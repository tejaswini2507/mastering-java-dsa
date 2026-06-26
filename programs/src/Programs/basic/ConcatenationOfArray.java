package Programs.basic;

public class ConcatenationOfArray {
/// https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        ConcatenationOfArray p = new ConcatenationOfArray();
        int [] arr = {1,2,1};
        int result [] = p.getConcatenation( arr);

        for( int i : result){
            System.out.print( i + " ");
        }

    }
    public int[] getConcatenation(int[] nums) {

    int ans [] = new int [nums.length*2];

        for (int i = 0; i < ans.length; i++) {

            if (i < nums.length ){
                ans[i] = nums[i];
            }else {
                ans[i] = nums[i - nums.length ];
            }
        }
        return ans;
    }

//    algorithm
    /*
    s1 : create an array and give length as 2n
    s2 : if i < n it will be ans[i]==nums[i]
         else ans[i]==nums[i-n]

     */
}
