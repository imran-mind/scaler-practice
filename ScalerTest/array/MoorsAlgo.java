package MathsProblems;

import java.util.ArrayList;

public class MoorsAlgo {

    //https://www.scaler.com/academy/mentee-dashboard/class/19186/assignment/problems/4105/?navref=cl_pb_nv_tb
    public static int moores(ArrayList<Integer> A){
        int me = -1;
        int cnt = 0;
        int n = A.size();
        for(int i=0; i<n; i++){
            int item = A.get(i);
            if(me == -1 && cnt == 0){
                me = item;
                cnt++;
            }else if(item == me){
                cnt++;
            }else if(item != me && cnt == 1){
                me = -1;
                cnt=0;
            }else if(item != me && cnt > 1){
                cnt--;
            }
        }
        int c=0;
        for(int i=0; i<n; i++){
            if(A.get(i) == me)
                c++;
        }
        int val = n/2;
        if(c>val)
            return me;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,3,4,3,3};//{4,3,4,4,4,1,5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4); list.add(4);
        list.add(3); list.add(4);
        list.add(4); list.add(3);


        System.out.println(moores(list));
    }
}
