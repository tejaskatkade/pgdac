// Call Back Functions

function show(a){
    console.log(a);
    console.log(typeof a);
    
}
show(5);        // 5
                // number
show("hello");
                // hello
                // string

show(true);
                // true
                // boolean

show([1,2,3,4]);

                // [ 1, 2, 3, 4 ]
                // object


var fun = function(){
    
}
//--------------------------------------------------------------
// We can pass function as an argument for another function

show(fun);      // [Function: fun]
                // function


//CallBack Funtion : Function that is passed as an argument

function print(a){
    console.log(a);
    a();
}
//--------------------------------------------------------------


print( function demo(){
    console.log("Call Back Funtion 1");     
});

// [Function: demo]
// Call Back Funtion 1

//--------------------------------------------------------------

function demo1(){
    console.log("Call Back Funtion 2");     
}

print(demo1);

// [Function: demo1]
// Call Back Funtion 2

//--------------------------------------------------------------

function print2(a){
    console.log(a);
    a();
}

var fun = function demo3(){
    return 5;
}


var res = print2(fun);
console.log(res);


// function print(a){
//     //console.log(a);
//     var res = a();
//     console.log(res);   //5
    
// }

// var fun = function demo(){
//     return 5;
// }


// var res = print(fun);
// console.log(res);       // undefined



// If in a function call, we are passing entire definition then name of callback function is not needed;
// coz that function will not outside that function 
