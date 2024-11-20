const { log } = require('console');
const fs =  require('fs');

// fs.writeFile("myfile.txt","Tejas Katkade \n CDAC Mumbai",()=>{
//     console.log("File created");
// })

fs.writeFileSync("abc.txt","Hello from Tejas \nCdac Mumbai");
console.log("Writing completed");
// -> writefile() => work asynchronously

// Writing completed
// File created