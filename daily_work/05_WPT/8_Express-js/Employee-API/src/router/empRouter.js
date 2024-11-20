import { Router } from "express";
import { saveEmployee ,getEmployees, getEmployeeById, deleteEmployeeById } from "../controller/empController.js";
import { verifyToken } from "../middleware/VerifyToken.js";
// import pkg from 'jsonwebtoken';
// const { verify } = pkg;

const empRouter = Router();
empRouter.post("/register-employee",saveEmployee);
empRouter.get("/get",verifyToken,getEmployees);
empRouter.get("/get/:id",verifyToken,getEmployeeById);
empRouter.delete("/delete/:id",verifyToken,deleteEmployeeById);

export default empRouter;

