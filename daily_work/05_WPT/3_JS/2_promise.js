function sum(num1, num2){
    var c = num1 + num2;
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            if(c){
                resolve(c);
            }else{
                reject("Error : sum can not be caculated")
            }
        },1000);
    });
}

function factorial(num){
    return new Promise((resolve,reject)=>{
        setTimeout((()=>{
            if(n) {
                var fact = 1;
                for (let i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                resolve(fact);
            }else{
                reject("Error ");
            }

        }),1000);
    });
    

}

function power(num, pow){
}


sum(2,3).then((res)=>{
    console.log("Sum is "+ res);
    
}).catch((err)=>{
    console.log(err);
});
// Sum is 5

sum(null,null).then((res)=>{
    console.log("Sum is "+ res);
    
}).catch((err)=>{
    console.log(err);
});

// Error : sum can not be caculated