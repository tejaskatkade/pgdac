/**
 * 1. print out "Program started" at the start of your code
 * 2. create a promise that resolves after 3 seconds and reject after 2 seconds
 * 3. Log out the promise while it's pending
 * 4. Print out "Program in process..." as well
 * 
 * 5. Print out "Program complete" if the promise fulfills
 * 6. Print out "Program" failure if the promise rejectss
 *
 */


console.log("Program started");

const myPromise = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        resolve();
    },3000);

    setTimeout(()=>{
        reject();
    },2000);

});


console.log("Program in progress....");
console.log(myPromise);



myPromise
    .then(()=>{
        console.log("Program completed");
    })
    .catch(()=>{
        console.log("Program Failure");
    });
