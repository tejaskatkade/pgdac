package implementation;

import exception.StackException;

public class DynamicStack extends StaticStack {
    
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int data) throws StackException {
        
        if (isFull()) {
            // increase stack size 
            int tempArr[] = new int[arr.length * 2];
            
            // copy data
            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            // copy pointer(reference)
            arr = tempArr;
        }
        // at this point stack is not full
        return super.push(data);
    }
}
