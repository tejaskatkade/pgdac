/**
 
    1. Create a function called "goGetCandies" which
       return a Promise Object that resolves to the value:

       { candy: "sour keys", quantity :10 }
       This should take 2 seconds


    2. Create another function called "sellCandies" that will take a candy Object like above and return a Number that is 25 * quantity. This will be how much (in cents) we get for out candies. However, make this functiob take 3 seconds to do this matvh (return a Promise with a setTimeout with the answer).
    
    3. write an async function that ues await to:
        1. Get the candy objedct from goGetCandies()
        2. Passes it to "sellCandies" and waits for the response
        3. Prints out how much money we made fro out sale  
    
        4. Do the same as #3 but with vanilla Promises.

        Q1.  Which of these 2 methods do your prfer?
        Q2.  Which of these 2 methods is easier to read?
 */


const goGetCandies = ()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve({ candy: "sour keys", quantity :10 });
        },2000);
    });    
}

const sellCandies = (candy)=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
           // console.log( 25 * candy.quantity);
            resolve(25 * candy.quantity);
        },3000)
    });
};

const useCandies = async ()=>{
    const candy = await goGetCandies();
    console.log(candy);
    const price = await sellCandies(candy);
    console.log(price);
}

console.log("Program started");
useCandies();
console.log("Program completed");
