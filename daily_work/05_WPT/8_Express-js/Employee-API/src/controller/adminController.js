import bcrypt from 'bcrypt';
import { createConnectionObject } from '../config/dbConfiguration.js';
import jwt from "jsonwebtoken";


const connection =  createConnectionObject();
export function registerAdmin(request, response){
    try {
        const data = request.body
        const encryptedPassword = bcrypt.hashSync(data.password,12);
        const insertQuery = `INSERT INTO  admin VALUES(${data.id},'${data.name}','${data.username}','${encryptedPassword}','${data.phone}')`;
        connection.query(insertQuery,(error,result)=>{
            try {
                if(error){
                    response.status(500).send(error);
                }else{
                    response.status(201).send({message:"Registration successfully"});
                }
            } catch (error) {
                response.status(500).send(error);
            }
        })
    } catch (error) {
        response.status(500).send({message:"Something went wrong"});
    }
}


export function adminLogin(request,response){
    try {
        const requestData = request.body;
        // console.log(requestData);
        // console.log(requestData.username);

        const selectQuery =  `SELECT * FROM admin WHERE username='${requestData.username}'`;
        connection.query(selectQuery,(error,result)=>{
            if (error) {
                response.status(500).send(error);
            } else {
                if (result.length > 0) {
                    //console.log(result);
                    console.log(result[0]);
                    console.log(result[0].password);
                    if(bcrypt.compareSync(requestData.password,result[0].password)){
                        // jwt.sign(payload,secret-Key,callback)
                        jwt.sign({adminId:result[0].id},"secret-key",(error,token)=>{
                            if(error){
                                response.status(500).send({message:"Something went wrong in token geration"});       
                            }else{
                                response.status(200).send({message:"Login successful",token});
                                // we are sending token in response body
                                response.status(200).send({message:"Login successful"});
                            }
                        })
                    }else{
                        response.status(400).send({message:"Password is incorrect"});
                    }
                } else {
                    response.status(500).send({message:"Invalid Username"});       
                }
            }
        })
    } catch (error) {
        response.status(500).send({message:"error"});
    }
}