import express  from 'express';
import cors from 'cors';
import { establishConnection } from './src/config/DbConfiguration.js';
import userRouter from './src/router/UserRouter.js';
import taskRouter from './src/router/TaskRouter.js';

const APP = express();
const PORT = 6700;
APP.use(express.json());
APP.use(cors());

APP.use("/user",userRouter);
APP.use("/task",taskRouter);

APP.listen(PORT,()=>{
    establishConnection();
    console.log(`Server on http://localhost:${PORT}`);
})

