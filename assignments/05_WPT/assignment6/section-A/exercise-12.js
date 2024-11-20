
/// 12. Question: Create a promise that resolves with a message after 3 seconds.

const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Promise Resolved")
    },3000);
});

myPromise
    .then((msg)=>{
        console.log(msg);
    });