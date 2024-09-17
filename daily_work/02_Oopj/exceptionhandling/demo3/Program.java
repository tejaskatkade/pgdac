package exceptionhandling.demo3;

class Base{
	public void print( ){

    }
}

// Error in following code as Super class method does not throw checked exception but base class overriden method throws


// class Derived extends Base{

//     public void doPrint()throws InterruptedException{
       
//     }
// 	@Override
// 	public void print(){
//         for( int count = 1; count <= 10; ++ count ) {
// 			System.out.println("Count	:	"+count);
// 			Thread.sleep(250);
// 		}
// 	}
// }


// solution to above problem :
// wrap cheked exception with unchecked exception

class Derived extends Base{

    public void doPrint()throws InterruptedException{
       
    }
	@Override
	public void print()throws RuntimeException{
        
			try{
                
                for( int count = 1; count <= 10; ++ count ) {
                    System.out.println("Count	:	"+count);
                    if(count == 8)
                        throw new InterruptedException();  
                    Thread.sleep(250);
                }

            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
		
	}
}

public class Program {
    public static void main(String[] args) {
        Base base = new Derived(); //UPCASTING
        try {
            base.print();
        } catch (RuntimeException e) {
            //System.out.println(e.getCause());;
            Throwable t = e.getCause();
            System.out.println(t);

        }
    }    
}
