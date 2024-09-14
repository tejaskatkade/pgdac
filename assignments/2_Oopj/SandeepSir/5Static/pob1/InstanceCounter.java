package pob1;

public class InstanceCounter{
    private static int instanceCount = 0;


    InstanceCounter(){
        instanceCount = instanceCount + 1;
    }

    public static void  getInstanceCount(){
        System.out.println("Total Instances : "+ InstanceCounter.instanceCount);
    }

}