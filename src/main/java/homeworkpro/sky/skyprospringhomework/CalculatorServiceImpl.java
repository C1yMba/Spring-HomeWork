package homeworkpro.sky.skyprospringhomework;

import org.springframework.stereotype.Service;

/*Написать 5 методов, которые при вызове из браузера делают следующее:

1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.*/
@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculatorGreetings(){

        return "Добро пожаловать в калькулятор";
    }

    public int sumNumbers(int num1, int num2){
        return num1 + num2;
    }
    public int minusNumbers(int num1, int num2){

        return num1 - num2;
    };
    public int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    };
    public double divideNumbers(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Деление на ноль");
        }
        return (double) num1 / num2;
    };
}