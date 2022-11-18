import org.testng.Assert;
import  org.testng.annotations.Test;

public class MyCalculatorTest {

    @Test
    void testTambahMethod(){
        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue + secondValue;
        int actualResult = MyCalculator.tambah(firstValue, secondValue);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testKurangMethod(){
        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue - secondValue;
        int actualResult = MyCalculator.kurang(firstValue, secondValue);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testKaliMethod(){
        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue * secondValue;
        int actualResult = MyCalculator.kali(firstValue, secondValue);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testBagiMethod(){
        int firstValue = 20, secondValue = 60;
        int expectedResult = firstValue / secondValue;
        int actualResult = MyCalculator.bagi(firstValue, secondValue);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
