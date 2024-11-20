console.log("Calculating sum...");

setTimeout((a,b)=>{
    var c = a+b;
    console.log("sum : ",c );
    
    console.log("Calculating factorial...");
    setTimeout(()=>{
        var fact = 1;
        for (let i = 1; i <= c; i++) {
            fact = fact * i;
        }
        console.log(" factorial: ",c );
        
        console.log("Calculating power...");
        setTimeout((fact)=>{
            var pow = fact**2;
            console.log("power : ",c );
            
        },1500, 2,3);
    },3000, 2,3);

},1000, 2,3);