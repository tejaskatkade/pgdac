
class Program1{

    public static void main(String[] args) {
        // Color c = new Color();
        // Cannot instantiate the type Color

        Color c = Color.RED;
        System.out.println(c);

        c.name();
        String s = Color.RED.name();
        System.out.println(s);

        c.ordinal();
        int n = Color.BLUE.ordinal();
        System.out.println(n);


        Color[] value = Color.values();
        for(Color v : value){
            System.out.print(v.name()+" ");
        }

        System.out.println();
        
        String name = "blue";
        name = name.toUpperCase();

        System.out.println(Color.valueOf(name));
    }
}