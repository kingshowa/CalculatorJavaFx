/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author AsmaPC
 */

// Le modèle effectue toutes les opérations nécessaires.
//Le modèle ne sait pas que la vue existe

public class CalculatorModel {

    private double calculationValue1;

    //For decimal numbers
    public void addTwoNumbers1(double firstNumber, double secondNumber){
        calculationValue1 = firstNumber + secondNumber;
    }
    
    public void subtractTwoNumbers1(double firstNumber, double secondNumber){
        calculationValue1 = firstNumber - secondNumber;
    }
    
    public void multiplyTwoNumbers1(double firstNumber, double secondNumber){
        calculationValue1 = firstNumber * secondNumber;
    }
    
    public void divideTwoNumbers1(double firstNumber, double secondNumber){
        calculationValue1 = firstNumber / secondNumber;
    }
    
    public double getCalculationValue1(){
        return calculationValue1;        

    }

}
