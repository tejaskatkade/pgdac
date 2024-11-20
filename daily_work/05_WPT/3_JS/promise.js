
// var n = 4;
// const evenPromise = new Promise((resolve,reject)=>{
//     if(n%2 === 0){
//         resolve();
//     }
//     else{
//         reject();
//     }
// });


// evenPromise
//     .then((n)=>{
//         console.log("Fetching the data from server");

//     }).catch((n)=>{
//         console.log("saving the data from server");
//     });
 

function checkEvenPromise(n) {
    const evenPromise = new Promise((resolve, reject) => {
        if (n % 2 === 0) {
            resolve(n);
        }
        else {
            reject(n);
        }
    });


    return evenPromise;
}

// const evenPromise = checkEvenPromise(5);

// evenPromise
//     .then((n)=>{
//         console.log(n," is even. Fetching the data from server");

//     }).catch((n)=>{
//         console.log(n," is odd. saving the data from server");

//     });

checkEvenPromise(5)
    .then((n) => {
        console.log(n, " is even. Fetching the data from server");

    }).catch((n) => {
        console.log(n, " is odd. saving the data from server");

    });