package array;

import java.util.ArrayList;

public class SumOfAllOddLengthSubarrays {

    public static ArrayList getOdds(int n){
        ArrayList<Integer> odds= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                odds.add(i);
            }
        }
        return odds;
    }

    public static int sumOfAllOddSubarray(int[] arr){
        int len = arr.length;
        int ans = 0;
        ArrayList<Integer> odds = getOdds(len);
        for(int k=0; k<odds.size(); k++){
            int count = odds.get(0); // 1 3 5

            for(int i=0; i < count ; i++){
                int m = 0;
                for(int j=i; j<arr.length; j++){
                    if(m < count){
                        System.out.print(arr[j]+" ");
                    }else{
                        break;
                    }
                    m++;
                }
                System.out.println();
            }
        }

        System.out.println(odds);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        sumOfAllOddSubarray(arr);
    }
}
