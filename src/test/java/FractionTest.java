import java_packages.UnitTestingClasses.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private Fraction res;

    @Test
    public void positiveNumbersCanAdd (){
        Fraction a = new Fraction(4,8);
        Fraction b = new Fraction(6,5);

        res = a.add(b);
        Assert.assertEquals(68,res.getTeller());
        Assert.assertEquals(40,res.getNoemer());
    }

    @Test
    public void negativeNumbersCanAdd (){
        Fraction a = new Fraction(-5,-8);
        Fraction b = new Fraction(6,5);

        res = a.add(b);
        Assert.assertEquals(-73,res.getTeller());
        Assert.assertEquals(-40,res.getNoemer());
    }

    @Test
    public void positiveNumbersCanSubstract (){
        Fraction a = new Fraction(10,16);
        Fraction b = new Fraction(4,5);

        res = a.substract(b);
        Assert.assertEquals(-14,res.getTeller());
        Assert.assertEquals(80,res.getNoemer());
    }

    @Test
    public void negativeNumbersCanSubstract (){
        Fraction a = new Fraction(-10,16);
        Fraction b = new Fraction(4,-5);

        res = a.substract(b);
        Assert.assertEquals(-14,res.getTeller());
        Assert.assertEquals(-80,res.getNoemer());
    }

    @Test
    public void positiveNumbersCanMultiply (){
        Fraction a = new Fraction(2,8);
        Fraction b = new Fraction(4,6);

        res = a.multiply(b);
        Assert.assertEquals(8,res.getTeller());
        Assert.assertEquals(48,res.getNoemer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nominatorCantBeZero (){
        new Fraction(5, 0);
    }
}

