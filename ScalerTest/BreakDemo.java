public class BreakDemo {

    public static void main(String[] args) {
        int cal = 0;
        int gf_calls_up = 40;
        while(cal<=100){
            System.out.println("running step and cal"+cal);
            if(cal == gf_calls_up){
                break;
            }
            cal = cal + 5;
        }
        System.out.println("Go for Dinner");
    }
}

