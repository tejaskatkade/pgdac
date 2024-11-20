var a1 = [10,20,30,40,50];

var a2 = [11,12,13,14];


// Spread operator

var a4 = [...a1,...a2];

console.log(a4);
// [
//   10, 20, 30, 40, 50,
//   11, 12, 13, 14
// ]

var studName = "Tejas";

var obj ={name:studName, marks:67};
console.log(obj);   // { name: 'Tejas', marks: 67 }

// if we want to consider variable as the key
var obj1 ={studName, marks:67};
console.log(obj1);   // { studName: 'Tejas', marks: 67 }

// In above case the variable name itself will be treated as key name.



//-

var o1 = {
    name: "suresh",
    age:25
}

var o2 = {
    email : "suresh@gmail.com",
    phone:"12345678"
}


// I want to merge both the objects

var o3 = {o1,o2};

console.log(o3);
// It will become nested object
// {
//     o1: { name: 'suresh', age: 25 },
//     o2: { email: 'suresh@gmail.com', phone: '12345678' }
// }


var o3 = {...o1,o2};

console.log(o3);
// {
    //     name: 'suresh',
    //     age: 25,
    //     o2: { email: 'suresh@gmail.com', phone: '12345678' }
    // }
    
    
var o4 = {...o1,...o2};
    
console.log(o4);

// {
//     name: 'suresh',
//     age: 25,
//     email: 'suresh@gmail.com',
//     phone: '12345678'
//   }


var x = "Tejas";

var obj = {x};
console.log(obj); //{ x: 'Tejas' }

// but i want value of varible as key

var y = "studName";
var obj = {[y]:"Tejas"};
console.log(obj);

