package day10.demo2;

public class Rectangle extends Shape {
      private float length;
      private float breadth;

      Rectangle(){

      }

      public void setLength(float length){
            this.length = length;
      }

      public void setBreadth(float breadth){
            this.breadth = breadth;
      }

      public void calculateArea(){
            this.area = length * breadth;
      }
      
      public float getArea(){
          return this.area;
      }
        
}
