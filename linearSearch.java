public class linearSearch {
    public static void main(String[] args){
        int[] nums = {23 , 45 , 56 , 67 , 89 , 10};
        int target = 10;
        System.out.println(search1(nums, target));
        System.out.println(search2(nums, target));
        System.out.println(search3(nums, target));
    }
    // search in the array : return the index if item found
    // otherwise if not found -1

    // search the element and return the index :-
    static int search1(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }

        // run  a for loop
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
        // this return statement at the end has been written , in case when none of the above return statements is not executed, hence when target is not found.

    // search the target and return the element
    static int search2(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }

        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] == target){
        //         return arr[i];
        //     }
        // }

        // enhanced for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }  

    // search the element and return true/false
    static boolean search3(int[] arr, int target){
        if(arr.length == 0){
            return false ;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
        // at the end , if element not found , then return false.
    }

}











