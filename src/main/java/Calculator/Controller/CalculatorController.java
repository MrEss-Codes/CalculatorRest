package Calculator.Controller;


import Calculator.Core.Entity.FloatSum;
import Calculator.Core.Service.ICalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
  //Dependency Injection
    ICalculatorService _calculatorService;
    public CalculatorController(ICalculatorService _calculatorService) {
        this._calculatorService = _calculatorService;
    }

   // takes the string numbers and return a float value
   // which we put to the variable sum and return it with as a new FloatSum entity
    @RequestMapping("/calculator/add")
    public FloatSum addition (@RequestParam( value= "operands", defaultValue = "0") String numbers) {

       Float sum = _calculatorService.add(numbers);

       return new FloatSum(sum);

    }

}
