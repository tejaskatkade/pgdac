console.log("Program started....");


const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Program Completed !");
    },3000);
});

console.log(myPromise);
console.log("Program in process....");


myPromise.then((val)=>{
    console.log(val);
});


//
// Program started....
// Promise { <pending> }
//
// Program in process....
// Program Completed !