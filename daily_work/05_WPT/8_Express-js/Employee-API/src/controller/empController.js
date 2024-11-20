import { createConnectionObject } from "../config/dbConfiguration.js";

const connection = createConnectionObject();


// POST -> Add Employee
export function saveEmployee(request,response){
    //try{
        const data = request.body;
        const insertQuery =  `INSERT INTO employee (id, name, salary, phone) VALUES(${data.id},'${data.name}',${data.salary},'${data.phone}')`;
        connection.query(insertQuery,(error,result)=>{
            if(error){
                response.status(500).send({message:"error"});
            }else{
                response.status(201).send({message:"Success"});
            }
        })

    //}
    // catch(error){
    //     response.status(500).send({message : "Error in registration"});
    // }
}

// Get All employee
export function getEmployees(request,response){
    try {
        const fetchQuery = `select * from employee`;
        connection.query(fetchQuery,(error,result)=>{
            if(error){
                response.status(500).send({message:"Error in Query"});
            }else{
                response.status(200).send(result);
            }
        })
    } catch (error) {
        response.status(500).send({message:"Error in fething data"});
    }
}

// Get Employee by id
export function getEmployeeById(request,response){
    try {
        const empId = parseInt(request.params.id);
        const fetchQuery = `select * from employee where id = ${empId}`;
        connection.query(fetchQuery,(error,result)=>{
            if(error){
                response.status(500).send({message:"Error in Query"});
            }else{
                response.status(200).send(result);
            }
        })
    } catch (error) {
        response.status(500).send(error);
    }
}

//Delete employee by id
export function deleteEmployeeById(request,response){
    try {
        const empId = parseInt(request.params.id);
        const query = `delete from employee where id = ${empId}`;
        connection.query(query,(error,result)=>{
            if (error) {
                response.status(500).send(error);
            } else {
                response.status(200).send(result);
            }
        });
    } catch (error) {
        response.status(500).send(error);
    }
};

