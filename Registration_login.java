/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration_login;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Registration_login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String registeredUsername = "";
        String registeredPassword = "";
        String registeredCellphone = "";
        
        System.out.println("wlecome to the Registration page");
        
             //registration
             System.out.print("register your user name (must contain'_' including maximum 5 characters):");
             registeredUsername = scanner.nextLine();
             if (!(registeredUsername.contains("_") && registeredUsername.length()<=5)){
                 System.out.println("username is not correctly formatted, please ensure that username contains underscore and is not more than 5 characterslong in return");
                  return;
                  } else{ 
                  System.out.println("Username successfully captured");
             
             }
             System.out.print("register a password (maximum 8 characters, including a special character):");
             registeredPassword = scanner.nextLine();
             if (!(registeredPassword.contains("at least 8 characters including a special character, a capitcal letter, a number and a special character"))){
                  System.out.println("Password not correctly formatted, please insure that password contains at least 8 characters, a capital letter,a number and a special character");
                  return;
             } else {
            System.out.println("Password successfully captured");
             }
             
             System.out.println("register your Cellphone ( contain international country code and must be 100 characters long): ");
             registeredCellphone = scanner.nextLine();
             if (!(registeredCellphone.contains("+27")));
             System.out.println("Cellphone is incorrectly formatted or does not contain an international code, please try again");
           
            System.out.println("Cellphone successfully captured");

             
            
             System.out.print("\nRegistration successful");
             System.out.println("please log in to continue");
            
             //login
              int attempts = 0;
              int maxAttempts = 3;
              boolean isLoggedIn = false;
             
              while (attempts < maxAttempts && !isLoggedIn) {
                System.out.print("\nEnter username: ");
                String username = scanner.nextLine();
                
                System.out.print("enter password");
                String password = scanner.nextLine();
                
                System.out.print("\nEnter Cellphone: ");
                String Cellphone = scanner.nextLine();
                
                if (username.equals(registeredUsername) && password.equals(registeredPassword) && Cellphone.equals(registeredCellphone)) {
                    System.out.println("login successful! welcome, " + username + "!");
                    isLoggedIn = true;
                }else {
                    attempts++;
                    int remaining = maxAttempts - attempts;
                System.out.println("incorrect username, password or Cellphone. Attempts remaining: " + remaining );        
            }            
        }
        if (!isLoggedIn) {
        System.out.println("too many failed attempts account locked");
        }
    
        scanner.close(); 
    }
}
