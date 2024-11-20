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

        }),2000);
    });
}

function square(num){
    return new Promise((resolve,reject)=>{
        setTimeout((()=>{
            if(num){
                var ans = num*num;
                resolve(ans);
            }else{
                reject()
            }
        }),1500);
    });
}

sum(2,3)
    .then((sRes)=>{
        console.log(sRes);
        return factorial(sRes);
    })
    .then((fact)=>{
        console.log(fact);
        return square(fact);
    }).then((pow)=>{
        console.log(pow);
    })
    .catch((err)=>{
        console.log(err);
    });