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
            System.out.println("Wpisz nazwę działania (ADD, SUBTRACT, MULTIPLY, DIVIDE, POWER): ");
                String userSymbol = sc.nextLine();
                try{
                symbol = OperationSymbol.valueOf(userSymbol.toUpperCase());
                }
                catch (IllegalArgumentException e){
                    System.out.println("Niewłaściwa nazwa działania!");
                    System.out.println("Spróbuj jeszcze raz");
                    return;
                }
                
        Calculator calculator = new Calculator();
        calculator.performOperation(firstUserNumber, secondUserNumber, symbol);
    }
    
    OperationSymbol symbol;
    
    enum OperationSymbol{
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        POWER;
    }    
    
    public void performOperation(double firstUserNumber, double secondUserNumber, OperationSymbol symbol){
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
        System.out.println(result);
     }
    }
