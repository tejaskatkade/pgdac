//const { log } = require('console');

 const { log } = require('console');
const fs = require('fs');

 // fs.readFile("abc.txt",(err,data)=>{
//     if(err){
//         console.log(err);
//     }else{
//         console.log(data.toString());
//     }
// })
// console.log("Reading Done...");

const data = fs.readFileSync("abc.txt");
console.log(data.toString());
console.log("Reading Done...");
 