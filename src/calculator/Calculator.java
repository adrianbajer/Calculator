
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
                
                OperationSymbols symbol;
                symbol = OperationSymbols.getOperation(userSymbol);
                    if (symbol == null){
                        System.out.println("Niewłaściwy znak działania!");
                        System.out.println("Spróbuj jeszcze raz");
                        return;
                    }
                double result = 0;
                result = symbol.performOperation(firstUserNumber, secondUserNumber);
                System.out.println(result);
    }
}
