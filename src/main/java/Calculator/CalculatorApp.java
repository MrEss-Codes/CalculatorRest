package Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class CalculatorApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CalculatorApp.class, args);


    }

}