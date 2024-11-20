// 9. Question: Create a function that takes any number of arguments and returns their sum using the rest operator.


function sum(...args) {
    let total = 0;
    for(let i= 0; i<args.length; i++){
        total = total + args[i];
    }
    return total;
}

console.log(sum(2,3,4,1));

function sum1(...args) {
    let total = 0;
    for(let i of args){
        total = total + i;
    }
    return total;
}

console.log(sum1(2,3,4,1));

