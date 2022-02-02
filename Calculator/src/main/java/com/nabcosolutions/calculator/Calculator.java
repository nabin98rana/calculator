/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabcosolutions.calculator;

import com.nabcosolutions.calculator.view.CalcView;

/**
 *
 * @author Navin
 */
public class Calculator {
public static void menu(){
    
    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Exit");
    System.out.println("Enter your selection [1-5]:");
    
}
public static void main(String[] args){    
       
       CalcView.input2number();
        
        menu();
        
        CalcView.Controller();
        
    }
    

}
