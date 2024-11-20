// 13. Question: Create a function that returns another function, demonstrating closure.



function sum(x){
    return function(y){
        return x + y ;
    }
}

var add1 = sum(5);
var add2 = sum(7);

console.log(add1(5));   // 10
console.log(add2(7));   // 14
