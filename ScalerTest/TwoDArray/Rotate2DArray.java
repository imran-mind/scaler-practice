package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate2DArray {

    public static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void solveByArr(int[][] A) {
        int cols = A[0].length;
        int row = A.length;
        int B[][] = new int[cols][row];
        for(int c=0; c<cols; c++){
            for(int r=0; r<row; r++){
                B[c][r] = A[c][r];
            }
        }
        for(int c=0; c<cols; c++){
            int k = 0;
            for(int r=row-1; r>=0; r--){
//                System.out.println("A["+c+"]["+k+"] = "+A[c][k]+" A["+r+"]["+c+"] "+A[r][c]);
                  A[c][k] = B[r][c];
                k++;
            }
        }
    }
    public static void solve(ArrayList<ArrayList<Integer>> A) {
        int cols = A.get(0).size();
        int row = A.size();
        ArrayList<ArrayList<Integer>>  copy = new ArrayList<ArrayList<Integer>>();

        for(int r=0; r<row; r++){
            ArrayList<Integer> listRow = A.get(r);
            ArrayList<Integer> copyRow = new ArrayList<>();

            for(int c=0; c<listRow.size(); c++) {
                copyRow.add(listRow.get(c));
            }
            copy.add(copyRow);
        }

        A = new ArrayList();
        for(int c=0; c<cols; c++){
            ArrayList<Integer> col = new ArrayList<>();
            int k = 0;

            for(int r=row-1; r>=0; r--){
                int rotetedVal = copy.get(r).get(c);
                col.add(k,rotetedVal);
                k++;
            }
            A.add(c, col);
        }
    }
    public static void main(String[] args) {
        int[][] l = {{1,2},{3,4}};
        ArrayList<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> zeroRow = new ArrayList<>();
        zeroRow.add(1);
        zeroRow.add(2);
        list.add(zeroRow);

        ArrayList<Integer> oneRow = new ArrayList<>();
        oneRow.add(3);
        oneRow.add(4);
        list.add(oneRow);
        System.out.println("original Matrix "+list);
        solve(list);
//        solveByArr(l);
//        display2DArray(l);
//        System.out.println("rotated 90 Deg "+Arrays.toString(l));

    }
}
