package array;

public class ProductOfAnArray {

    public static int arraySign(int[] nums) {
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            if(pro<0)
                pro=-1;
            else if(pro>0)
                pro=1;
        }
        return pro;
    }
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};//{-1,1,-1,1,-1};//{1,5,0,2,-3};//{-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
}
