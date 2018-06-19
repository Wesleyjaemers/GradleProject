package java_packages.UnitTestingClasses;

public class Prime {
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int c = 2; c < n; c++) {
            if(n % c == 0) {
                return false;
            }
        }
        return true;
    }
}
