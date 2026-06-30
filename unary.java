class operator12 {

    public static void main(String arge[]) {
        int a = 10;
        int b = ++a;
        int c = ++b + a++;
        int d = ++a + b + ++c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}