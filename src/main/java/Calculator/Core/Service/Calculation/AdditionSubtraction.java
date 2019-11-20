package Calculator.Core.Service.Calculation;

import java.util.ArrayList;

public class AdditionSubtraction {



    public float Add(String[] input) {

        ArrayList<Float> numbers = new ArrayList<>(); //Array list used for storing floats.
        float sum = 0;
        //parse each string in the array into a float and add to a float array of numbers
        for (int i = 0; i < input.length; i++) {

            float x = Float.parseFloat(input[i]);

            numbers.add(x);
        }
        // performs addition of the numbers to the total sum
        for (int i = 0; i < numbers.size(); i++) {

            float x = numbers.get(i);

            sum = sum + x;
        }

        return sum;





    }
}
