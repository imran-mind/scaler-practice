package array;

public class BinarySerach {
    public static int binarySearch(int[] a, int key){
        int n = a.length-1;
        int start = 0;
        int end = n;

        while (start <= end){
            int mid = (start + end) / 2;

            if(a[mid] > key){
                end = mid - 1;
            }else if(a[mid] < key){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchFindOneOcc(int[] a, int key){
        int n = a.length - 1;
        int start = 0;
        int end = n;
        int res = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(a[mid] > key){
                end = mid - 1;
            }else if(a[mid] < key){
                start = mid + 1;
            }else {
                res = mid;
                //search left;
//                end = mid -1;
                start = mid +1;
            }
        }
        return res;
    }


    public static int binarySearchFindOcc(int[] a, int key,String occPos){
        int n = a.length - 1;
        int start = 0;
        int end = n;
        int res = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(a[mid] > key){
                end = mid - 1;
            }else if(a[mid] < key){
                start = mid + 1;
            }else {
                res = mid;
                if(occPos.equals("FIRST")){
                    //search left;
                    end = mid -1;
                }else{
                    //search right;
                    start = mid +1;
                }
            }
        }
        return res;
    }
    public static int binarySearchDupNumOccu(int[] a,int key){
        int firstOcc = binarySearchFindOcc(a, key,"FIRST");
        int lastOcc = binarySearchFindOcc(a, key,"LAST");
        int count = (lastOcc - firstOcc) + 1;
        return count;
    }
    public static void main(String[] args) {
        int[] a = {2,3,5,6,7,7,7,7,8,9,10};
        int key = 7;
//        int res = binarySearchFindOneOcc(a, key);
        int res = binarySearchDupNumOccu(a,key);
        System.out.println(res);
        if(res == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Found index =>"+res);
        }
    }
}
