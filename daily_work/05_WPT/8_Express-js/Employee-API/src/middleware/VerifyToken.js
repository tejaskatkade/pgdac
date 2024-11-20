import jwt from "jsonwebtoken";

export function verifyToken(request,response,next){
    const authHeader = request.get('Authorization');
    if(authHeader){
        const token = authHeader.split(" ")[1];
        jwt.verify(token,"secret-key",(error,payload)=>{
            if(error){
                response.status(401).send({message:"Invalid Token"});               
            }else{
                next();
            }
        })
    }else{
        response.status(401).send({message:"Token is missing"});               

    }
}