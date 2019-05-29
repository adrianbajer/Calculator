
package calculator;

import java.util.Scanner;

public class Calculator {
    
    public void calc() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
                while (!sc.hasNextDouble())
                {
                    System.out.println("Błąd! Wprowadź poprawną liczbę.");
                    sc.next();
                }
                    double firstUserNumber = sc.nextDouble();
            System.out.println("Podaj drugą liczbę: ");
                while (!sc.hasNextDouble())
                {
                    System.out.println("Błąd! Wprowadź poprawną liczbę.");
                    sc.next();
                }
                    double secondUserNumber = sc.nextDouble();
                    sc.nextLine();
            System.out.println("Podaj znak działania (+, -, *, /, ^): ");
                String userSymbol = sc.nextLine();
                
                symbol = OperationSymbols.getOperation(userSymbol);
                if (symbol == null){
                    System.out.println("Niewłaściwy znak działania!");
                    System.out.println("Spróbuj jeszcze raz");
                    return;
                }
                    
        System.out.println(performOperation(firstUserNumber, secondUserNumber, symbol));
    }
    
    OperationSymbols symbol;
    
    public double performOperation(double firstUserNumber, double secondUserNumber, OperationSymbols symbol){
        double result = 0;
        switch (symbol) {
            case ADD:
                result = firstUserNumber+secondUserNumber;
                break;
            case SUBTRACT:
                result = firstUserNumber-secondUserNumber;
                break;
            case MULTIPLY:
                result = firstUserNumber*secondUserNumber;
                break;
            case DIVIDE:
                result = firstUserNumber/secondUserNumber;
                break;
            case POWER:
                result = Math.pow(firstUserNumber, secondUserNumber);
                break;
        }
        return result;
     }
    }
