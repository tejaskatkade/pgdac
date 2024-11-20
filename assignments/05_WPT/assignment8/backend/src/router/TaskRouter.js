import { Router } from "express";
import { addTask, deleteTask, getTaskByUser, getTasksByUser, updateTask } from "../controller/TaskController.js";

const taskRouter = Router();

taskRouter.post("/add/:userId",addTask);
taskRouter.get("/getAll/:userId",getTasksByUser);
taskRouter.get("/get/:userId/:taskId",getTaskByUser);
taskRouter.delete("/delete/:userId/:taskId",deleteTask);
taskRouter.put("/update/:userId/:taskId",updateTask);

export default taskRouter;
