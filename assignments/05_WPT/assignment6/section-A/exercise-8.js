// 8. Question: Use the reduce method to find the total price of items in a shopping cart.

const shoppingCart = [
    {
        id: 1,
        name: "T-shrirt",
        price: 1000
    },
    {
        id: 2,
        name: "Jeans",
        price: 3000
    },
    {
        id: 3,
        name: "Shirt",
        price: 1700
    },
    {
        id: 4,
        name: "Trouser",
        price: 1900
    }
];


// console.log(shoppingCart);
// console.log(shoppingCart.length);


var totalPrice = shoppingCart.reduce((total,obj)=>{
        return total + obj.price;
},0);
console.log("Total Price :",totalPrice);

