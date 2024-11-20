import express, { query, request, response } from 'express';
import { establishConnection } from './src/config/dbConfiguration.js';
import empRouter from './src/router/empRouter.js';
import { saveEmployee } from './src/controller/empController.js';
import adminRouter from './src/router/adminRouter.js';

const PORT = 9600;
const APP = express();

APP.use(express.json());

// APP.get("/",(request, response)=>{
//     response.send("Welcome");
// });

APP.use("/employee",empRouter);
APP.use("/admin",adminRouter);

APP.listen(PORT,()=>{
    console.log(`Server is running on ${PORT}`); 

    // When server started we need to establish connection

    establishConnection();
});


/**
 

{
    "id":101,
    "name": "Tejas",
    "salary";89076,
    "phone";"123456789"
}


 */