import {createConnection} from 'mysql2';

export function createConnectionObject(){
    return createConnection({
        host:'localhost',
        user:'tejas',
        password:'cdac',
        database:'wpt_task_m'
    });
}

export function establishConnection(){
    createConnectionObject().connect((err)=>{
        if (err) {
            console.log(err);
            
        } else {
            console.log('Connetion Successfull');
            
        }
    });
}