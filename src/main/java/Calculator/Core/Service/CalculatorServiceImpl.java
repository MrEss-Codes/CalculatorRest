package Calculator.Core.Service;

import Calculator.Core.Service.Calculation.AdditionSubtraction;

public class CalculatorServiceImpl implements ICalculatorService {
    AdditionSubtraction additionSubtraction = new AdditionSubtraction();

    @Override
    public Float add(String input) throws NullPointerException{

        String[] numbers = sanitizer(input);
        Float sum = additionSubtraction.Add(numbers);

        return sum;
    }

    // split string into numbers and makes sure they parse as floats. return String array of the numbers
    @Override
    public String[] sanitizer(String numbers) {

        String[] strNumbers = numbers.split(",");

        for (int i = 0; i < strNumbers.length; i++) {

          try { Float.parseFloat(strNumbers[i]);} catch (NumberFormatException n)
           {    //
                throw new NumberFormatException("Invalid input at Index " + i + ". Input string: " +strNumbers[i]);
           }
       }
        return strNumbers;
    }



}
