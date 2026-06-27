package Programs.basic;

import java.util.*;
public class POwerOfTwo {
    /// https://leetcode.com/problems/power-of-two/description/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("false");
        }else{
            while(n % 2 == 0){
                n=n/2;
            }
            if(n == 1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
