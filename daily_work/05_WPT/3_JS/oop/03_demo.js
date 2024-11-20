//SyntaxError: A class may only have one constructor

class Employee{
    // constructor(){
    //     this.id = 101;   
    //     this.name = "Tejas";
    // }
    constructor(id,name){
        this.id = id;   
        this.name = name;
    }

    show(){
        console.log(this.id);
        console.log(this.name);
    }
}

var emp1 = new Employee();
emp1.show();

// undefined
// undefined


var emp2 = new Employee(101,"Ram");
emp2.show();

// 101
// Ram