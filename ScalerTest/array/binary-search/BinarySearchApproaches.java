package MathsProblems;

public class BinarySearchAppraoches {

    // write your code here...

// HI Imran , can you hear me ??

//[1,2,3,4,5,6,7,8,9]
//[0,0,0,1,1,1,1,1,1]
// start =3
// end = 3;
// mid = 2

// Find the commit/idx of array which broke the build
// start = 2
// end   = 3

//[0,0,1,1]
//    m = 1
//    s = 0
//    e = 3
//            ------
//    m = 2
//    s = 2
//    e = 3
//
//            [1,1,1,1]
//    m = 1
//    s = 0
//    e = 3

//    public int findBreakingCommit(int[] results) {
//
//        int start =0;
//        int end = results.length;
//
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(results[mid] == 1){
//                if(mid == 0){
//                    return mid;
//                } else {
//                    if(results[mid-1] == 0){
//                        return mid;
//                    }else{
//                        end = mid-1;
//                    }
//                }
//            } else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }



//[0,0,1,1]
//    s=0
//    e=3
//    m=1
//            ----
//    s=2
//    e=3
//    m=2
//            ----
//    s=2
//    e=2
//    m=2
//
//    low = high = mid
//    XXX low > high
//    low < high
//            low = high
//
//    s=2,e=3
//    m=3
//
//    first occurance of a number
//[1,1,2,2]
//
//    n = 2
//    idx = 7
//    l = 0
//    h = 3
//    m = 1
//
//    l = 2
//    h = 3
//    m = 2
//
//    l = 2
//    h = 2
//    m = 2
//    find the last occurance of a number

//    while (low < high) {
//        int mid = low + (high - low ) / 2;
//        if (nums[mid] == 2)
//            high = mid;
//        else
//            low = mid + 1;
//    }
//
//    return arr[mid] == target ? mid : -1;

//[1,2,2,2,2,2,2]
//    m = 3
//    s=0
//    e=6
//    idx = 3
//            --------
//    s = 4
//    e = 6
//    m = 5
//    idx = 5
//            ---------
//    s = 6
//    e = 6
//    m = 6
//            ---------
//    s = 7
//    e = 6
//    xxx
//
//------
//    int idx = -1;
//while (low <= high) {
//        int mid = (low + high) / 2;
//        if (nums[mid] == target) {
//            idx = mid;
//            low = mid + 1;
//        }
//        else if (nums[mid] < target)
//            low = mid + 1;
//        else
//            high = mid - 1;
//    }
//
//return idx;

// search in rotated sorted array.

    public static int findLastOccrenses(int[] arr,int target){
        int idx = -1;
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                idx = mid;
//                low = mid + 1;
            }
            low = mid + 1;
        }
        return idx;
    }

    public static int findFirstOccrences(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid =-1;
        while (low<high){
            mid = low + (high - low)/2;
            if(arr[mid] == target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return arr[mid] == target ? mid : -1;
    }
    public static void main(String[] args) {
        int[] ar = {0,0,0,0,0,1,1,1,1,1};
        System.out.println(findFirstOccrences(ar,1));
    }
}
