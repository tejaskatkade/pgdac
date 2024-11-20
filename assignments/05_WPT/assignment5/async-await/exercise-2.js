/***
    1. create a function called "fetchFast" that returns a promise that resolves wiht hte string "fast done"
       after 2 seconds
    2. Create a functions called "fetchSow" that returns a Promise that resolves with the  Stirng "Slow Done"
       after 6 seconds
    3. Print out "Program starting" 

    4. Create an async function that uses await to wait for the data to comes back from "fetchFast"  then log out the data. Then use await to wait for the data to come back from "fethcSlow" and log it out right after.

    5. Call the async function your create 
    6. Log out "Program Complete"

    7. How long does this take and why?
    8. How could you speed it up?


 */


const fetchFast = ()=>{
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve("fast done");
        },2000);
    });
}
const fetchSlow = ()=>{
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve("slow done");
        },3000);
    });
}

console.log("Program started...");

const useData = async ()=>{
    const fast =  fetchFast();
    //console.log(fast);
    const slow = fetchSlow();
    //console.log(slow);
    const result = await Promise.all([fast,slow]);
    console.log(result);
}


useData();

console.log("Program completed");

