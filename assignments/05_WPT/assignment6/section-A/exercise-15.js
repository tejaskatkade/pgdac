// 15. Question: Create a function that takes an array of numbers, applies a filter to keep only
// even numbers, then uses map to double those numbers, and finally returns the total
// using reduce.


const arr = [1,2,3,4,5,6,7,8,9,20,19,18,17,16,15,14,13,12,11,10];

const evenArr = arr.filter(ele => ele%2 == 0);

console.log("Even : ",evenArr);

const double = evenArr.map(ele => ele*2);

console.log("Double : ",double);

var total = double.reduce((total,ele)=>{
    return total = total + ele; 
})

console.log("Total : ",total);

