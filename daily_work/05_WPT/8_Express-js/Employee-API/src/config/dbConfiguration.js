
import { createConnection } from 'mysql2';

export function createConnectionObject(){
    const connection = createConnection({
        host:'localhost',
        user:'root',
        password:'student',
        database:'wpt'
        // ,
        // insecureAuth : true
    });
    return connection;
};

export function establishConnection(){
    createConnectionObject().connect((err)=>{
        if(err){
            console.log(err);
        }else{
            console.log("Connection successfull");
            
        }
    });
}