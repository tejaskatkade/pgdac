var arr = [10,9,11,12,8,78,3,5,6];

for (let i = 0; i< arr.length; i++) {
    if(arr[i]%2==0 )
        {
           // console.log(arr[i]);

        }    
}


var evenArr = arr.filter(function(ele){
    return ele%2==0;
});

console.log(evenArr);


// Another way to define function

// 1. Using function keyword -> functin name(){}

// 2. Fat Arrow function OR arrow function 
// ->               (argument)=>{}



(a,b)=>{
        return a+b;
}

const sum = (a,b)=>{
        return a+b;
}

var res = sum(4,5);
console.log(res);   // 9


const sum1 = a=> a**a;

console.log(sum1(3));   // 27



array = [1,2,3,4,5,6,7,8,9];
var evenArr = array.filter((ele)=>ele%2==0);
console.log(evenArr);       // [ 2, 4, 6, 8 ]