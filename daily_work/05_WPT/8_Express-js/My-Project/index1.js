import express, { response } from 'express';
const app = express();

// app.listen(4600,()=>{
//     console.log("Server is running on port 4600");
// });

app.listen(5600,()=>{
    console.log("Server is running on port 5600");
});

app.post("/",(request,response)=>{
    response.send("Hello");
})

app.post("/greet",(request,response)=>{
    response.send("Good Morning");
})

app.get("/sum/:x/:y",(request,response)=>{
    
    const a = parseInt(request.params.x);
    console.log(request.params.x);
    const b = parseInt(request.params.y);
    console.log(b);
    const c = a+b;
    console.log(c);
    response.status(200).send({sum:c}); 
});

app.get("/square/:n1",(request, response)=>{
    const s = parseInt(request.params.n1);
    const sqr = s*s;
    console.log(sqr);
    response.send({square : sqr})
    
})


//localhost:5600/square/5

//- output
// {
//     "square": 25
// }


//2. Request Body :- 
//  post

// suppose for registration
// phone . - 9359252805
//127.0.0.1:46000/register

// we can send it in request body
/***
 
    {
        name: "Tejas",
        phone: "9359252805",
        password: "Pass@1234"

    }





 */

//07-11-24

app.post("/data",express.json() ,(request,response)=>{
    const a = request.body.a;
    const b = request.body.a;
    const c = a+b;
    response.send("Sum : "+c);
});

