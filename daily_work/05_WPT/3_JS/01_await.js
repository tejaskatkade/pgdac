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

async function handlePromise() {
    try{
        const sumRes =  await sum(2,3);
        console.log("Sum : ",sumRes);
        const factRes =  await factorial(sumRes);
        console.log("Factorial : ",factRes);
        const sqRes =  await square(factRes);
        console.log("Square : ",sqRes);
        
    }catch(error){
        console.log(error);
        
    }
}
handlePromise();