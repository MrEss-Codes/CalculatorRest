package Calculator.Core.Service;

public interface ICalculatorService {
    
    //Sanitizer needs to sanitize whatever input, 
    //as to make sure that the numbers are valid 
    //and that the input can be calculated by the calculator
    public String[] sanitizer (String numbers);
    
    //Divison calculation should be seperated by comma
    //This function should work as following: first number before the comma is the number we want to divide,
    //second number after the comma is the number we will divide the first number by.
    public Float division (String input);
    
    //check if a number is a prime
    //This is simply just a Bool, we just wanna return a true or false on wether the given input is a prime number or not
    public Bool PrimeVerification (String input);
    
    //Perform sqaureroot of a given number, seperated by comma
    //First number is the number we want to perform the action on, second number is action number.
    public Float Squareroot (String input);
    
    //multiplication 
   //First number is the number we want to perform the action on, second number is action number. 
    public Float Multiply (String input);
    
    //addition or subtraction (This function is done. Use this for reference as to how the other functions can be done!)
    //First number is the number we want to add or subtract to. 
    //Second number is how much we add or subtract. Seperated by comma
    public Float AddSub (String input);
}
