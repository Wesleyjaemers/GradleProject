package java_packages.Oefeningen;

public class Fibonacci {
    public static void main(String[] args) {


        int n = 20;
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 1; i <= n; i++)
            {
                int som = a + b;

                System.out.print(som + " ");
                a = b;
                b = som;

        }

        System.out.println();
    }
}
