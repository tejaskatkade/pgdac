import { createConnectionObject } from "../config/DbConfiguration.js";

const connection = createConnectionObject();

// POST - add user
export function addUser(request,response) {

    try {
        const user = request.body; 
        const query = `INSERT INTO user(
                        username, email,password
                    ) VALUES
                    ('${user.username}','${user.email}','${user.password}')`;

        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// GET -  user
export function getUser(request,response) {

    try {
        const user_id = parseInt(request.params.userId); 
        const query = `SELECT * FROM user WHERE user_id = ${user_id}`
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// PUT -  user
export function updateUser(request,response) {

    try {
        const user_id = parseInt(request.params.userId); 
        const user = request.body;
        const query = `UPDATE user SET
                       username = '${user.username}',
                       email = '${user.email}',
                       password = '${user.password}'
                       WHERE user_id = ${user_id}`
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// DELET -  user
export function deleteUser(request,response) {

    try {
        const user_id = parseInt(request.params.userId); 
        const query = `DELETE FROM user WHERE user_id = ${user_id}`
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}