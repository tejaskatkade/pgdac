// Create a simple shopping cart application using let, const, and var to manage
// items. Use const for constant values (like tax rates) and let for variables that might
// change (like total price)

const products = [
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
    },
    {
        id: 5,
        name: "Kurta",
        price: 2000
    },
    {
        id: 6,
        name: "Sari",
        price: 5000
    }
];

let cart = [];

function addToCart(productId) {
    const items = products.find(i=> i.id == productId);
    let exitingItem = cart.find(i=> i.id == productId);

    console.log(items);
    console.log(exitingItem);
    

    if(exitingItem) {
        exitingItem.quantity++;
    }else{
        cart.push({...items,quantity : 1});
    }

    console.log(cart);
    
    console.log("Product added in your cart");
    //showCart();
    
}

console.log(" Prduct  Name :    quantity    :    Price");
function showCart() {
    const gst = 0.18;
    let totalPrice = 0;
    cart.forEach(i =>{ 
        console.log(i.name+"  :  "+i.quantity+"  :  "+i.price);
        totalPrice = totalPrice + (i.price * i.quantity)
    });
    console.log("Total Bill :",totalPrice );
    console.log("Total Bill (with 18% GST):",totalPrice + (totalPrice*gst));
    
}

addToCart(3);
addToCart(2);
addToCart(3);
// addToCart(1);
// addToCart(4);
// addToCart(1);
showCart();