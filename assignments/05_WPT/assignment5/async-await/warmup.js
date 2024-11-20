/**
 
    1. Create a function called "fetchPokemom" that returns a Promise that resolves with the value
    { data: {name: "Pickachu". power: 20} } after 2 seconds

    2. Print out "Program starting...."

    3. create an async function that uses await to wait for the data to comes back "fetchPokemon" then log out the data

    4. Call the async function you created
    5. Log out "Program completed!"

    After your are done the above:

    6. Change "fetchPokemon" to reject after 2 seconds instead
    with a new error Object with the message "Dangeer, danger !!!"
    7. How can you modify your async function to catch this error?

 */


// const fetchPokemom = ()=>{
//     return new Promise((resolve, reject)=>{

//         setTimeout(()=>{
//             resolve({ data: {name: "Pickachu", power: 20} });
//         },2000 );
//     })
// };

// console.log("Program stating.....");


// const usePokemon = async () => {

//     const data =  await fetchPokemom();
//     console.log(data);
    
// };
// usePokemon();

// console.log("Program completed");

//- output
// Program stating.....
// Program completed

// { data: { name: 'Pickachu', power: 20 } }


//___________________________________________

const fetchPokemom = ()=>{
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            //resolve({ data: {name: "Pickachu", power: 20} });
            reject(new Error("Dangeer, danger !!!"))
        },2000 );
    })
};
console.log("Program stating.....");

const usePokemon = async () => {
    try {
        const data =  await fetchPokemom();
        console.log(data);
        console.log("Done fetching.....");
    } catch (error) {
        console.log(error);
    }

    console.log("Error in code, But no problem");
    
};
usePokemon();
console.log("Program completed");



//

// Program stating.....
// Program completed
// Error: Dangeer, danger !!!
//     at Timeout._onTimeout (d:\CDAC\pgdac\assignments\05_WPT\assignment5\async-await\warmup.js:58:20)
//     at listOnTimeout (node:internal/timers:573:17)
//     at process.processTimers (node:internal/timers:514:7)
// Error in code, But no problem
// PS D:\CDAC\pgdac\assignments\05_WPT\assignment5>
