import express from 'express';
import mysql from './configDB.js';

const app = express();


app.listen(5050,()=>{
    console.log("Server is running on port 5600");
    const c = mysql.getConnectionConfigObject();
    c.connectDatabase();
});




