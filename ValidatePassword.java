package forclass;

import java.util.*;
public class ValidatePassword { 
  static void passwordcheck()
        {
        System.out.println("Enter your password. It must have at least two upper case letters");
        System.out.println("At least three lowercase letters. And at least one digit");
        String passWord;
        Scanner sc = new Scanner(System.in);
        passWord = sc.nextLine();
        int len = passWord.length();
        char PassWord[];
        PassWord = passWord.toCharArray();
        int amountUp=0;
        int amountLow=0;
        int amountInt=0;
        for(int x = 0;x<len;x++)
        {
            if(Character.isUpperCase(PassWord[x])==true)
            {
                amountUp++;
            }
            if(Character.isLowerCase(PassWord[x])==true)
            {
                amountLow++;
            }
            if(Character.isDigit(PassWord[x])==true)
            {
                amountInt++;
            }
        }
        if(amountUp<2||amountLow<3||amountInt<1)
        {
            System.out.println("The password did not have enough of the following: ");
            if(amountUp<2)
            {
                System.out.println("uppercase letters");
            }
            if(amountLow<3)
            {
                System.out.println("lowercase letters");
            }
            if(amountInt<1)
            {
                System.out.println("digits");
            }
            passwordcheck();
        }
        else
        {
            System.out.println("Valid password");
        }
        }
    public static void main(String[] args) {
       
        passwordcheck();
    }
}
