package java_packages.Oefeningen;

public class ComparePrime {

    public static boolean isPrime(int a) {
        int rest;
        boolean priem = true;

        for (int i = 2; i < a; i++) {

            rest = a % i;
            if (rest == 0) {
                priem = false;
            }
        }
        return priem;
    }
}
