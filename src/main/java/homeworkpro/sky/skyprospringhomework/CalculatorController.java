package homeworkpro.sky.skyprospringhomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String calculatorGreetings() {
        return calculator.calculatorHello();
    }

    @GetMapping(path = "/plus")
    public String sumNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка, не задан один или несколько параметров!");
        }
        return num1 + " + " + num2 + " = " + calculator.sumNumbers(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка, не задан один или несколько параметров!");
        }
        return num1 + " - " + num2 + " = " + calculator.minusNumbers(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка, не задан один или несколько параметров!");
        }
        return num1 + " * " + num2 + " = " + calculator.multiplyNumbers(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка, не задан один или несколько параметров!");
        }
        try {
            return num1 + " / " + num2 + " = " + calculator.divideNumbers(num1, num2);
        } catch (IllegalArgumentException e) {
        return e.getMessage();
    }
    }
}
