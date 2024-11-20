/**
 *  1. Print out "Program started" at the start of your code
 *  2. Create a Promise that resolves after 3 seconds
 *  3. Log out the promise while it's pending
 *  4. Print out "Program in process.." as well
 *  
 *  5. Print out "Step 1 complete" when the first promise fulfills
 *  6. Have the first promise return another new Promise that will fulfill after 3 seconds with the message: "Step 2 Complete"
 * 
 *  7. Print out the message from the second promise after it fulfills ("Step 2 Complete")
 * 
 * 
 */

console.log("Program started");

const myPromise = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        resolve("Step 1 completed");
    },3000);
});

console.log(myPromise);
console.log("Program in progress ...");

myPromise
    .then((result)=>{
        console.log(result);

        return new Promise((resolve, reject)=>{
            setTimeout(()=>{
                resolve("Step 2 completed");
            },6000);
        });
    })
    .then((result)=>{
        console.log(result);
        
    })
    .catch((error)=>{
        console.log(error);
    });



// Program started
// Promise { <pending> }
// Program in progress ...
// Step 1 completed
// Step 2 completed