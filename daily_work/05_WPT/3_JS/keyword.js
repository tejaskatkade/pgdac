// var : 
//let :
// const :
// 

//----------------------------------------------------------------------------

// NOTE : if variable is declare without key word then it is considered as  global variable

// without var, let, const keyword variables are reffered on the window object 

a = 5;              // It will become property of window object
                    // So it will considered as Global variable
function show(){
    a = 6;
   // console.log(a); //6
}
show();
//console.log(a); //6

//--------------------------------------------------------------------------------------

// var


var num = 12;
console.log(num);
console.log(typeof num);
console.log(typeof(num));

//--------------------------------------------

//var keyword : declared using var keyword will get either local or global scope specially

var a = 5;
function show(){
    var a = 7;          // local
    var b = 6;          // local
    // console.log(a); //7
    // console.log(b); //6
}
show();
//console.log(a); //5
// console.log(b); // ReferenceError: b is not defined

// ---------------------------------------------------------

function print(){
    var a = 5;
    console.log(a); // 5
    var a = 8;
    console.log(a); // 8
}
print();

// We can re-declare a variable using var keyword

//-----------------------------------------------

console.log(z); // OK
var z = 10;

// js inter priter provides HOISTING 
// interpriter reads all the code and place all the declarations at top and then it executes the code.
// dont consider assignmetns 

// -----------------------------


function demo(){
    if(true){
        var x = 'a';
        //console.log("Inside x ",x);
    }
//    console.log("Outside x ",x);''
}

//demo();

// var is accessible throughout the function

//-------------------------------

// let

// let variables are block scope 


function demo1(){
    if(true){
        let x = 'a';
       // console.log("Inside x ",x);
    }
    //console.log("Outside x ",x); // ReferenceError: x is not defined
}

//________________________________________________________

let y = 8;
function demo3(){
//    console.log(y); // 8
    let y = 10;        
}
//let y = 10;    // Identifier 'y' has already been declared    
console.log(y);  // 8
demo3();

// ---------------------------

    function demo3(){
       // console.log(y);     // ReferenceError: Cannot access 'y' before initialization
        let y = 10;        
    }  
    
    demo3();

//__________________________________________

// const 

//exactly same as let keyword
// 1 diiference is there, we can't change its value 

const p = 10;
//p = 40; //TypeError:  Assignment to constant variable.




