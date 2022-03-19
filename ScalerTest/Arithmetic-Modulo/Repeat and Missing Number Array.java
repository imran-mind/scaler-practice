/*https://www.scaler.com/academy/mentee-dashboard/class/19185/homework/problems/60?navref=cl_tt_lst_sl*/
public class Solution {
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
       ArrayList<Integer> list = new ArrayList<>();
        int n = A.size();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            if(set.contains(A.get(i)))
                list.add(A.get(i));
            set.add(A.get(i));
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                list.add(i);
                break;
            }
        }
        return list;
    }
}
