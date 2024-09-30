class complexity{
    public static void main(String[] args) {
       int n = 100;

       // 1.  
       // excutes n times
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
        // O(n)

        // 2
        // executes n times
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
            // executes n times
            for (int j = 1; j <= n; j++) {
                System.out.println(j);
            }   
        }

        // total n * n
        // O(n2)
        
        
        int p = 0;

        for (int i = 1; p <=n; i++) {
            p = p+i;
        }
    }
}