package Test;

import Calculator.Core.Service.Calculation.AdditionSubtraction;
import Calculator.Core.Service.CalculatorServiceImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoreUnitTest {

    @Test
    public void CalculatorLogicTest(){
        AdditionSubtraction add = new AdditionSubtraction();
        CalculatorServiceImpl service = new CalculatorServiceImpl();

        //TEST DATA
        String str = ("1,2,3,4,5,6,7");
        String str2 = ("1,2");
        String str3 = ("5,-3");
        String str4 = ("5,5.5");

        //Sanitize
        String[] numbers = service.sanitizer(str);
        String[] numbers2 = service.sanitizer(str2);
        String[] numbers3 = service.sanitizer(str3);
        String[] numbers4 = service.sanitizer(str4);

        //EXPECTED RESULTS
        Float expected = 28f;
        Float expected2 = 3f;
        Float expected3 = 2f;
        Float expected4 = (float) 10.5;

        //Act
        Float result = add.Add(numbers);
        Float result2 = add.Add(numbers2);
        Float result3 = add.Add(numbers3);
        Float result4 = add.Add(numbers4);

        //Assert
        assertEquals(expected,result);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
        assertEquals(expected4,result4);
    }
}
