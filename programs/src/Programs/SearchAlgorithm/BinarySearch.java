package Programs.SearchAlgorithm;

public class BinarySearch {

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        BinarySearch p  = new BinarySearch();
//        int result =p.binarySearch(arr, x);
//        if (result == -1)
//            System.out.println(
//                    "Element is not present in array");
//        else
//            System.out.println("Element is present at "
//                    + "index " + result);
        int result2  = p.binarySearch2(arr , 0 , arr.length -1,x);
        if (result2 == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result2);


    }
    public int binarySearch(int arr[] , int search) {

       int low = 0 , high = arr.length-1;

        while ( low <= high){
            int mid = (low +high) /2 ;

            if(search == arr[mid]){
                return mid;
            } else if (search > arr[mid]) {
                low = mid +1;
            } else{
                high = mid -1;
            }
        }

        return -1;
    }

    public int binarySearch2(int arr[] ,int low,int high,int target){

        if(low > high) return -1;
        int mid = (low +high) /2 ;
        if (target == arr[mid]) return mid;
        if (target > arr[mid]){
            return binarySearch2(arr , mid+1 , high ,target);
        }
        return binarySearch2(arr, low, mid-1, target);
    }
    // Algorithm
    /*

    s1 : formulae
          mid = low + (high - low) /2 ;
          if search == mid return index ;
          else if mid > search high = mid -1;
          else if mid < search low = mid +1 ;
     */

}
