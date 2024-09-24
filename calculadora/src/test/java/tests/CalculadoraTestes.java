package tests;
import org.junit.Test;
import org.junit.Assert;
public class CalculadoraTestes {
    @test
    public void testeSomar(){
        Calculadora Calc = new Calculadora();
        Assert.assertEquals ( 5.0, cal.somar(3.0,2.0), 0.0);
    }
}
