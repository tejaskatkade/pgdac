import express, { request, response } from 'express';
import mysql from 'mysql';

const PORT = 5050;
const APP = express();

const STUDENTS_LIST = [];

APP.use(express.json());

APP.get("/",(request,response)=>{
    response.send("Hello, welcome to Home Page");
})

APP.post("/register-student",(request,response)=>{
    try {
        const data = request.body;
        STUDENTS_LIST.push(data);
        response.status(201).send({
            message : "Student registration successful !!!"
        });
    } catch (error) {
        response.status(500).send({message:"Something went wrong"})
    }
})

APP.get("/students",(request,response)=>{
    try {
        response.status(200).send(STUDENTS_LIST);
    } catch (error) {
        response.status(500).send({message:"Something went wrong"})
        
    }
})

APP.get("/students/:id",(request,response)=>{
    try {
        const id = parseInt(request.params.id);
        const student = STUDENTS_LIST.find(stud => stud.id === id);
        if(student){
            response.status(200).send(student);
        }else{
            response.status(404).send({message:"Student not found"});
        }
    } catch (error) {
        response.status(500).send({message:"Something went wrong"})
        
    }
})


APP.listen(PORT,()=>{
    console.log(`Sever is running on port ${PORT}`);
    
});




