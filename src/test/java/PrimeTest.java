import java_packages.UnitTestingClasses.Prime;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {

   /* public static void main(String[] args) {

        boolean out = Prime.isPrime(6);
        if (out != false){
            System.out.println("fout");
        }else{
            System.out.println("ok");
        }
        out = Prime.isPrime(7);
        if (out != true){
            System.out.println("fout");
        }else{
            System.out.println("ok");
        }
    }*/

   @Test
   public void primeNumberReturnsTrueIfValueIsPrime(){
       boolean out = Prime.isPrime(7);
       Assert.assertTrue(out);  // Hier wordt er verwacht dat het juist is
   }

   @Test
    public void primeNumberReturnsFalseIfValueIsPrime(){
       boolean out = Prime.isPrime(6);
       Assert.assertFalse(out);  //Hier wordt er verwacht dat het fout is
   }

   @Test
    public void oneIsNotAPrime(){
       boolean out = Prime.isPrime(1);
       Assert.assertFalse(out);
   }

   @Test
    public void negativeNumbersAreNotPrimes(){
       Assert.assertFalse(Prime.isPrime(-6));
   }


}
