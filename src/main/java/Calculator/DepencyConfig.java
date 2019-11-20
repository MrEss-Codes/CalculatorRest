package Calculator;

import Calculator.Core.Service.CalculatorServiceImpl;
import Calculator.Core.Service.ICalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration()
public class DepencyConfig {
    @Bean
    public ICalculatorService iCalculatorServiceService() {
        return new CalculatorServiceImpl();
    }



}
