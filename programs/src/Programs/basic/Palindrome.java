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
