// Exercise 2:
// Write a function forEachElement that accepts an array and a callback. This
// function should apply the callback to each element of the array.
// Requirements:
// ● Pass an anonymous function as the callback that multiplies each element by
// 2 and logs the result with the index


arr = [2,3,4,5,6,7,8,9];
console.log(arr);
function forEachElement(arr,update){
    for (let index = 0; index < arr.length; index++) {
        arr[index] = update(index);
    }
}

forEachElement(arr,((i)=>{
    return arr[i]*2;
}));

console.log(arr);


