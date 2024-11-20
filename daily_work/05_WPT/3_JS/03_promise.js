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
            if(num) {
                var fact = 1;
                for (let i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                resolve(fact);
            }else{
                reject("Error ");
            }

        }),3000);
    });
}

sum(2,3)
    .then((sRes)=>{
        console.log(sRes);
        return factorial(sRes);
    })
    .then((fact)=>{
        console.log(fact);
    })
    .catch((err)=>{
        console.log(err);
    });