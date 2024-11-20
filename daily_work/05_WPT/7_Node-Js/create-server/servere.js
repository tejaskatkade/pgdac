const http =  require('http')

const server = http.createServer((request, response)=>{

    response.write("Hello form server");
    response.end();
});

//server.listen(4050);    // Start a server listening for connections

// 3306 mysql
// 8000 php
// 8080 java / 8090
// 3000 react

server.listen(4050,()=>{
    console.log("Server is listening on port 4050");
    
});