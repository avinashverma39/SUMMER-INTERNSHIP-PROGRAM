class operator1{

    public static void main(String arge[])
    {
        int a = 10;
        int b = 20;

        int c = a++ + ++b;
        int d = ++a + b++;
        
        
         System.out.println(a);
        System.out.println(b);
         System.out.println(c);
        System.out.println(d);

    }

}