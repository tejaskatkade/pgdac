class Employee{
    constructor(){
        //id = 101;   // ReferenceError: id is not defined
        this.id = 101;   
        this.name = "Tejas";
    }

    show(){
        //console.log(id);   //ReferenceError: id is not defined
        console.log(this.id);
        console.log(this.name);
    }
}

var emp = new Employee();
emp.show();