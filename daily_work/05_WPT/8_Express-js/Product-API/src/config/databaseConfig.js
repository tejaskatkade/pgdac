import { createConnection } from "mysql2"

function connectionDB(){
     createConnection({
        "host":"mysq",
        "username":"root",
        "password":"student",
        "database":"wpt"
     }); 
}