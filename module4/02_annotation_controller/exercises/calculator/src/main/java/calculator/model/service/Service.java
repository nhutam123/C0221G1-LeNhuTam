package calculator.model.service;

@org.springframework.stereotype.Service
public class Service implements iService {
    @Override
    public double calcul(double number1, double number2, String calcul) {
        double result=0;
     switch (calcul){
         case "cong":
             result=number1+number2;
             break;
         case "tru":
             result=number1-number2;
             break;
         case "nhan":
             result=number1*number2;
             break;
         case "chia":
             result=number1/number2;
             break;
     }
        return result;
    }
}
