

import {createConnection} from 'mysql';

export function getConnectionConfigObject(){
    const connectionConfig = createConnection({
        host:"localhost",
        user:"root",
        password:"student",
        database:"wpt"       
    });

    return connectionConfig;
}

export function connectDatabase(){

    connectionConfig.connect((error)=>{
        if(error){
            console.log("Error in connection");
            
        }else{
            console.log("DB connected");
            
        }
    })


} 