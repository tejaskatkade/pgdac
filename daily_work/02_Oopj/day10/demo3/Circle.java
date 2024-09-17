package day10.demo3;

public class Circle extends Shape{
    
    private float radius;

    Circle(){

    }
    public void setRadius(float  radius){
        this.radius = radius;
    }

    public void calculateArea(){
        this.area = (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getArea(){
        return this.area;
    }
    
}
