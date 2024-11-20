import { Router } from "express";
import { adminLogin, registerAdmin } from "../controller/adminController.js";
import pkg from 'jsonwebtoken';
const { verify } = pkg;


const adminRouter = Router();

adminRouter.post("/register",registerAdmin);
adminRouter.post("/login",verify,adminLogin);

export default adminRouter;