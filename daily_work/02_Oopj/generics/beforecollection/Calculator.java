package beforecollection;

import java.math.BigDecimal;

public class Calculator<T extends Number> implements ArithmeticOpertions<T>{

    @Override
    public BigDecimal add(T num1, T num2) {
       BigDecimal bd1 = new BigDecimal(num1.toString());
       BigDecimal bd2 = new BigDecimal(num2.toString());

       return bd1.add(bd2);
    }

    @Override
    public T subtract(T num1, T num2) {
        return num1 - num2;
    }

    @Override
    public T divide(T num1, T num2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

    @Override
    public T multiply(T num1, T num2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

   
    
}
