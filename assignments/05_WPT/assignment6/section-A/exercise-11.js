// 11. Question: Write a function that accepts a callback and executes it after a delay.

function work(callback){
    setTimeout(()=>{
        console.log("Function executed after dalay");
        callback();
    },3000);
}

work(()=>{
    console.log("callback function execute");  
});