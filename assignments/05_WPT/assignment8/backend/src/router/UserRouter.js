import { Router } from "express";
import { addUser, deleteUser, getUser, updateUser } from "../controller/userController.js";

const userRouter = Router();

userRouter.post("/add",addUser);
userRouter.get("/get/:userId",getUser);
userRouter.put("/update/:userId",updateUser);
userRouter.delete("/delete/:userId",deleteUser);

export default userRouter;