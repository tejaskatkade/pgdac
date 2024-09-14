package pob1;

class Main{
    public static void main(String[] args) {

        InstanceCounter.getInstanceCount();     // 0

        InstanceCounter i1 = new InstanceCounter();
        InstanceCounter i2 = new InstanceCounter();

        InstanceCounter.getInstanceCount();     // 2

        InstanceCounter i3 = new InstanceCounter();
        InstanceCounter i4 = new InstanceCounter();
        InstanceCounter.getInstanceCount();     // 4
    }

}