package Programs.basic;

import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

// algorithm
/*
S1 : read the input and initialize rev
S2 : get the each last digit
S3 : add it to the rev
S4 : remove the last digit

Reverse the digits of the given integer and cwhether a number reads the same from left to right and right to left.

 */
