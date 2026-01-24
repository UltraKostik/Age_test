import org.junit.Assert;
import org.junit.Test;
import  static  org.example.Main.checkAge;

public class MainTest {

    @Test
    public void testNegativeAge() {
        Assert.assertEquals("Возраст не может быть отрицательным.", checkAge(-1));
    }

    @Test
    public void testZeroAge() {
        Assert.assertEquals("Вы несовершеннолетний.", checkAge(0));
    }

    @Test
    public void testEighteen() {
        Assert.assertEquals("Вы несовершеннолетний.", checkAge(18));
    }
    @Test
    public void testNineteen() {
        Assert.assertEquals("Да здравствует, Санкт-Петербург! 😎", checkAge(19));
    }
    @Test
    public void testFiftyTwo() {
        Assert.assertEquals("Да здравствует, Санкт-Петербург! 😎", checkAge(52));
    }
    @Test
    public void testFiftyThree() {
        Assert.assertEquals("Библейский возраст.", checkAge(53));
    }
    @Test
    public void testOneHundredTwenty() {
        Assert.assertEquals("Библейский возраст.", checkAge(120));
    }
    @Test
    public void testOneHundredTwentyOne() {
        Assert.assertEquals("Вы легенда!", checkAge(121));
    }

    @Test
    public void testHugeAge() {
        Assert.assertEquals("Вы легенда!", checkAge(2147483647));
    }
}