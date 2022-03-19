/*https://www.scaler.com/academy/mentee-dashboard/class/19185/homework/problems/10351?navref=cl_tt_nv*/
public class Solution {
    public int solve(int year) {
        if (year % 400 == 0)
            return 1;
     
        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return 0;
     
        // Else If a year is multiple of 4,
        // then it is a leap year
        if (year % 4 == 0)
            return 1;
        return 0;
    }
}
ˇ
