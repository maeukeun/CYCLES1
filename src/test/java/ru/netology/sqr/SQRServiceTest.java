package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/count.csv")

    public void testI(int expected, int leftBound, int rightBound){
        SQRService service = new SQRService();
        System.out.println(service);
        int actual = service.calcSQR(leftBound, rightBound) ;
        Assertions.assertEquals(expected, actual);


    }
}
