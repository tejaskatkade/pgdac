// Question: Use the map method to create a new array that contains the lengths of the
// names in the following array.

const names = ["virat", "mahendra","Rohit","Hardik"];

const lengths = names.map(ele => {
    // console.log(ele);
    // console.log(ele.length);
    return ele.length;
})
console.log(names);

console.log(lengths);
