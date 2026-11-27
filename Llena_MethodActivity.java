/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yes;

/**
 *
 * @author student
 */
public class Llena_MethodActivity {
    
    static int calculate(int x, int y) {
        return x + y;
    }
    
    static double calculate(double x, double y, char operator) {
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default: 
                System.out.println("Invalid operator");
                break;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        
        System.out.println(calculate(3,3));
        System.out.println(calculate(3,3, '-'));
        System.out.println(calculate(3,3, '*'));
        System.out.println(calculate(3,3, '/'));
        System.out.println(calculate(3,3, ';'));
        
    }
    
}
