/**

1. print out "Program started " at the start of your code 
2. create a promise that resolves after 5 seconds with the value 
{data: "Hello, friend!", error:null}
3. Log out the promise while it's pending
4. Print out "Program in progress..." as well

5. Create a first Promis chain using th promise above and print out the resolved value when the first promise fulfills 
6. Have this first promise return another new Promise that will fulfill after 2 seconds with the message:
"First promise chain complete!"
7. Print out the message form the above promise after it fulfills ("First promise chain complete!")

8. create a second promise chain using the promise above and print out the resolved value when the second promise fulfills 
9. Have this second promise return another new Promise that will fulfill after 10 seconds with the message:
"Second promise chain complete!"
10. Print out the message form the above promise after it fulfills ("Second promise chain complete!")


 */


console.log("Program started");

const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(
            {data: "Hello, friend!", error:null}
        );
    },5000);
});

console.log(myPromise);
console.log("Program in Progress......");


myPromise
    .then((val)=>{
        console.log(val);
        
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve("First promise chain completed");
            },2000);
        });
    })
    .then((res)=>{
        console.log(res);
    })
    .catch();

// 2.

myPromise
    .then((val)=>{
        console.log(val);
        
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve("Second promise chain completed");
            },10000);
        });
    })
    .then((res)=>{
        console.log(res);
    })
    .catch();