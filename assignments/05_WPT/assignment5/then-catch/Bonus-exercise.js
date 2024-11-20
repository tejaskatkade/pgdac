/**
 
1. create a Promise that resolves with the number 10 after 3 seconds
2. create another Promise that resolves with the number 20 after 5 seconds

How can we log out the sum(30) of these two resolved values once, after BOTH  successfully fulfill?

// resolving 2 Promises at hte same time 

 */


const promise1 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(10);
    },3000);
});
const promise2 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(20);
    },5000);
});


Promise.all([promise1,promise2])
    .then((result) => {
        var sum = 0;
        for (let index = 0; index < result.length; index++) {
            sum = sum + result[index];
        }
        console.log(sum);
        
    });