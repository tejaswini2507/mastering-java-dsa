package Programs.basic;

public class FizzBuzz {
    /// https://leetcode.com/problems/fizz-buzz/
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

/*

take the input from the user using Scanner, display by using System.out.println().
if the return type is List<String>, create an ArrayList<String> use answer.add() to add each result,and return answer
 */

