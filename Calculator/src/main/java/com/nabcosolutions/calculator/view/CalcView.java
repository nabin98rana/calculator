/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabcosolutions.calculator.view;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CalcView {
     
    public static void input2number(){
      System.out.println("Enter first and second number:");
       Scanner input= new Scanner(System.in);
         int num1,num2;
         num1 = input.nextInt();
         num2 = input.nextInt();
    }
    
    public static void Controller(){
       int choose, number1,number2;
       Scanner input= new Scanner(System.in);
         number1 = input.nextInt();
         number2 = input.nextInt();
       choose =input.nextInt();
        switch (choose){
        case 1:
            System.out.println(addition( number1,number2));
            break;
        case 2:
            System.out.println(substraction( number1,number2));
            break;      
        case 3:
            System.out.println(multiplication( number1,number2));
            break;
        case 4:
            System.out.println(divison( number1,number2));
            break;
        case 5:
            System.exit(0);
            break;    
            default:
                System.out.println("Illigal Operation");


        }
      
    }
    public static int addition(int x, int y)
    {
        int add = x + y;
        return add;
    }
    public static int substraction(int x, int y)
    {
        int sub = x-y;
        return sub;
    }
    public static int multiplication(int x, int y)
    {
        int mul = x*y;
        return mul;
    }
    public static int divison(int x, int y)
    {
        int div = x/y;
        return div;
    }
}
