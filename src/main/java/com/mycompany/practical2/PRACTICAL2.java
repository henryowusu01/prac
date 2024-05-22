/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical2;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class PRACTICAL2 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner (System.in);
        System.out.print("please enter your first name");
         String fname = scan.nextLine();
         System.out.println("Your name is" + fname );
         
         System.out.println("please enter your monthly allowance");
         Double mAllowance = scan.nextDouble();
         System.out.println("how much are you left with ?");
         Double curBalance = scan.nextDouble();
         
    Double availBalance = mAllowance - curBalance;
    System.out.println("You have used R" + availBalance + "this far");
    }
}
