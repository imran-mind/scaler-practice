package array;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maxOfArr(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static int maximumWealth(int[][] accounts) {
        int[] wealthArr = new int [accounts.length];
        for(int i=0; i<accounts.length; i++){
            int[] arr = accounts[i];
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                int val = accounts[i][j];
                sum = sum + val;
            }
            wealthArr[i] = sum;
        }
        return maxOfArr(wealthArr);
    }

    public static void main(String[] args) {
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};//{{1,5},{7,3},{3,5}}; //{{1,2,3},{3,2,1}};

//        int[] ar = {1,2,3};

        System.out.println(maximumWealth((arr)));
    }
}
