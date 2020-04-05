package Calculator.Core.Service;




public interface ICalculatorService {
    
    //Sanitizer needs to sanitize whatever input, 
    //as to make sure that the numbers are valid 
    //and that the input can be calculated by the calculator
    public String[] sanitizer (String numbers);
    //Divison calculation should be seperated by comma
    public Float division (String input);
    //check if a number is a prime
    public Bool PrimeVerification (String input);
    //Perform sqaureroot of a given number, seperated by comma
    public Float Squareroot (String input);
    //multiplication 
    public Float Multiply (String input);
    //addition or subtraction
    public Float AddSub (String input);
}
