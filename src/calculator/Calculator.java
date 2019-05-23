/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Calculator {
    public void calc() {
        double result = 0;
        
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
            System.out.println("Podaj znak działania, które chcesz wykonać (+ - * / ^): ");
                String operationSymbol = sc.nextLine();
        
        switch (operationSymbol) {
            case "+":
                result = firstUserNumber+secondUserNumber;
                break;
            case "-":
                result = firstUserNumber-secondUserNumber;
                break;
            case "*":
                result = firstUserNumber*secondUserNumber;
                break;
            case "/":
                result = firstUserNumber/secondUserNumber;
                break;
            case "^":
                result = Math.pow(firstUserNumber, secondUserNumber);
                break;
            default:
                System.out.println("Podałeś zły znak działania!");
                System.out.println("Spróbuj jeszcze raz");
                System.exit(0);
        }
        
        System.out.println(result);
    }
}
