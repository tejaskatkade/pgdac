package arrtypes;

public class Complex {
    private int real;
    private int image;

    Complex(){

    }
    Complex(int real, int image){
        this.image = image;
        this.real = real;
    }

    @Override
    public String toString(){
        return "Complex [ Real : "+real+" Imaginary : "+image+"]";
    }

}
