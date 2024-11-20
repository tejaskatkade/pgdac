// Exercise 1:
// Create a function processData that takes two parameters: a string and a callback
// function. Your task is to write a callback that converts the string to uppercase and
// then call it within processData.
// Requirements:
// ● Define a function toUpperCase that will serve as a callback.
// ● Pass a string and toUpperCase to processData and log the output.

function processData(str, UpperCase){
    console.log(UpperCase(str));
}
function UpperCase(str){
    return str.toUpperCase();
}
processData("tejas",UpperCase);