import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest{

    Calculator sut;

    @BeforeEach//перед каждым
    public void init(){
        System.out.println("Test BeforeEach");
        sut = new Calculator();
    }
    @AfterEach// после каждого
    public void init2 (){
        System.out.println("Test AfterEach");
    }

    @Test
    public void testPlus(){
        //подготавливаем данные
        int x = 2, y = 3, expected = 5;
        //вызываем целевой метод и сохраняем результат в переменную
        int result = sut.plus.apply(x,y);
        // производим проверку
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testPow(){
        // подготавливаем данные
        int x = 10, expected = 100;
        //вызываем целевой метод и сохраняем результат в переменную
        int result = sut.pow.apply(x);
        //производим проверку
        Assertions.assertEquals(result,expected);
    }

    @Test
    public void testDevide(){
        // подготавливаем данные
        int x = 1, y = 0;
        var expected = ArithmeticException.class;
        // производим проверку
        Assertions.assertThrows(expected,()-> sut.devide2.apply(x,y));
    }

    @Test
    public void testAbc(){
        // подготавливаем данные
        int x = 1; int expected = 1;
        //вызываем метод - сохраняем результат в переменную
        int result = sut.abs.apply(x);
        // производим проверку
        Assertions.assertEquals(result,expected);
    }
}