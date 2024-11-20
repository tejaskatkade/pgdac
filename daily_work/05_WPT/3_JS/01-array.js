var arr =[10,20,30,40,50];

//map()
// If we want to get a new array by updating each and every element of the current array 


//var newArr = arr.map((e)=>{return e+1});
var newArr = arr.map(e=>e+1);

console.log(newArr);    // [ 11, 21, 31, 41, 51 ]

// NOTE : It does not update current array
console.log(arr);       // [ 10, 20, 30, 40, 50 ]


// foreach() :  
//  It will do traversing on the array and in each iteration it will give you each element of array one by one

// Doesn't return anything

var newArray = arr.forEach((val)=>{
    console.log(val);
    
}); 

// Output :

// 10
// 20
// 30
// 40
// 50


//

var a1 = [10,20,30,40,50];

var a2 = [11,12,13,14];

var a3 = a2.concat(a1);

console.log(a3);

