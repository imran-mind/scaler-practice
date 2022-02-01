package array;

public class FindEvenNumberofDigits {

    public static int findCount(int n){
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            n = n /10;
            count++;
        }
        return count;
    }
    public static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int count = findCount(nums[i]);
            if(count % 2 == 0){
                ans = ans + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};//{12,345,2,6,7896};
        int n = findNumbers(nums);
        System.out.println(n);
        /*
        * Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
        *
        * */
    }
}
