package array;

public class AvgSalary {

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static double average(int[] salary) {
        if(salary.length == 1)
            return salary[0];
        // double avgSal = 0.0;
        int min = findMin(salary);
        int max = findMax(salary);
        System.out.println("Min "+min+" Max "+max);

        double total = 0.0;
        for(int i=0; i<salary.length; i++){
            if(salary[i] != min && salary[i] != max){
                total = total + salary[i];
            }
        }
        return total / (salary.length-2);
    }
    public static void main(String[] args) {
//        int[] arr= {1,2,3,1,1,3};
        int[] arr= {8000,9000,2000,3000,6000,1000};

        double ans =  average(arr);
        System.out.println(ans);
    }
}
