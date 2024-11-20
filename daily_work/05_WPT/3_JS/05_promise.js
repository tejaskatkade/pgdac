// 1. fetch user ids from server 101 to 106\
// 2. fetch data base on id name, phone, email,age,
// 3. base on the age, decid if user can vote or not


// for 1 -> 3 sec
// for 2 -> 1.5 sec
// for 3 -> 1 sec

function fetchIds(){
    return new Promise((resolve,reject)=>{
        setTimeout((()=>{
            var ids = [101,102,103,104,105];
            if (ids) {
                resolve(ids);
            } else {
                reject("Erro : 404 : data not found");
            }
        }),3000);
    });
}

function fetchDataById(id){
    return new Promise((resolve,reject)=>{
        setTimeout((()=>{
            var data = {
                id, // Id is the key and its argument is value
                name : 'NodeJs Sharma',
                age : 12,
                email : 'tsk@gmail.com'
            };

            if(data){
                resolve(data);
            }else{
                reject('Error: Not able to access data');
            }
        }),1500);
    });
}

function checkEligibility(age){
    return new Promise((resolve,reject)=>{
        if(age>=18){
            resolve(age);
        }else{
            reject('Error :  Not Eligible');
        }
    });
}

fetchIds()
    .then((ids)=>{
        console.log("ID ",ids);
        return fetchDataById(ids[0]);
    })
    .then((data)=>{
        console.log(data);
        return checkEligibility(data.age);
    })
    .then((age)=>{
        console.log("Age : ",age);
        console.log("Eligible ");
        
    })
    .catch((err)=>{
        console.log(err);
    });
