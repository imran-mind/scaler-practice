package contest;

public class LittlePonnyAndMaxElement {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int found = -1;
        for(int i=0; i<n; i++){
            if(A[i] == B){
                found = B;
            }
        }
        if(found == -1)
            return -1;

        int c =0;
        for(int i=0; i<n; i++){
            if(A[i]>B){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] A = {2,4,3,1,5};
        int B = 3;

//        int[] A = {1,4,2};
//        int B = 3;

        System.out.println(solve(A,B));
    }
}
