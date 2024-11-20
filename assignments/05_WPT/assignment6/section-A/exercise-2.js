// Write a function to calculate the area of a rectangle using both a regular
// function and an arrow function.

function calculateArea(radius){
    return 3.142 * radius * radius;
}

var Area = (radius)=>{
    return 3.142 * radius * radius;
} 

console.log(Area(10));
console.log(calculateArea(10));
