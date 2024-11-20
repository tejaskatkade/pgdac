//  Given an object representing a car, use object destructuring to extract its properties.

const car = {
    name :"Mustang", 
    made :"Ford",
    year : 2000
}

console.log(car.made);
const { name : carName } = car;
console.log(carName);



