class Animal{
    speak(){

    }
}

class Dog extends Animal{
    speak(){
        console.log("bhow bhow");
    }
}

new Dog().speak();
new Animal().speak();
