import { createConnectionObject } from "../config/DbConfiguration.js";

const connection = createConnectionObject();

// POST - add task 
export function addTask(request,response) {
    try {
        const user_id = parseInt(request.params.userId);
        const task = request.body; 
        const query = `INSERT INTO task(
                        title, description,priority, due_date, user_id
                    ) VALUES
                    ('${task.title}','${task.description}','${task.priority}','${task.due_date}',${user_id})`;

        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// GET ALL TASK
export function GetAllTasks(request,response) {

    try {
        const query = "SELECT * FROM task"
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// GET - All TASK BY USER-ID
export function getTasksByUser(request,response) {

    try {
        const user_id = parseInt(request.params.userId);
        const query = `SELECT * FROM task WHERE user_id = ${user_id}`
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// GET - A TASK BY USER-ID AND TASK-ID
export function getTaskByUser(request,response) {

    try {
        const task_id = parseInt(request.params.taskId);
        const user_id = parseInt(request.params.userId);

        const query = `SELECT * FROM task WHERE id = ${task_id} AND user_id = ${user_id}`
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}


// DELETE - TASK BY USER-ID AND TASK-ID
export function deleteTask(request,response) {

    try {
        const user_id = parseInt(request.params.userId);
        const task_id = parseInt(request.params.taskId);

        const query = `DELETE  FROM task WHERE id = ${task_id} AND user_id = ${user_id} `
        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

// PUT - UPDATE TASK BY USER_ID AND TASK-ID
export function updateTask(request,response) {

    try {
        const user_id = parseInt(request.params.userId);
        const task_id = parseInt(request.params.taskId);
        const task = request.body; 
        const query = `UPDATE task SET
                    title = '${task.title}', 
                    description = '${task.description}', 
                    priority = '${task.priority}', 
                    due_date = '${task.due_date}', 
                    status = '${task.status}', 
                    user_id = ${task.user_id}
                    WHERE id = ${task_id} AND user_id = ${user_id}`;

        connection.query(query,(error,result)=>{
            if (error) {
                console.log(error);
                response.status(500).send({message:error});
            } else {
                console.log(result);
                response.status(201).send({message:result});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:error});
    }
}

        
   