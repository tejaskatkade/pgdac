import express from 'express';
import mysql from 'mysql';

const PORT = 5050;
const APP = express();


APP.get("/",express.json(),(request,response)=>{
    response.send("Hello, welcome to Home Page");
})

APP.listen(PORT,()=>{
    console.log(`Sever is running on port ${PORT}`);
    
});




