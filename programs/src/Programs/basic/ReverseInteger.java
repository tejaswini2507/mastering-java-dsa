package Programs.basic;

import java.net.SocketOption;
import java.util.*;
public class ReverseInteger {
    /// https://leetcode.com/problems/reverse-integer/description/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n=n/10;
        }
        System.out.println("Reverse number:" + rev);
    }
}

// algorithm
/*
S1 : read the input and initialize rev
S2 : get the each last digit
S3 : add it to the rev
S4 : remove the last digit

Reverse the digits of the given integer.

it range overflows for int...use integer.MIN_VALUE and integer.MAX_VALUE
 */