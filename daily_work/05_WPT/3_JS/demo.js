// function sum(a,b){
//     return a+b;
// }

// c = sum(3,2);
// // console.log(c);


// function max(a,b){
//     if(a>b){
//         return a;
//     }
//     return b;
// }

// c = max(2,3);
// console.log(c);


// console.log(typeof(max));




var str="Hello";
//console.log(typeof str);    // string

var myfun = function show(){
    console.log("Hello");
    
}
console.log(typeof show);  //undefined

//show();   // undefined
myfun();    // hello

console.log( myfun);    // [Function: show]
console.log(typeof myfun);  //function


//--------------------
// Anonymous Functions
var fun = function(){
    console.log("Anonymous");
}

fun();  // Anonymous

