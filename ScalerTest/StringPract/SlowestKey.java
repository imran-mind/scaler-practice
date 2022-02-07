package StringPract;

import java.util.HashMap;
import java.util.Map;

public class SlowestKey {

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        char ansChar = keysPressed.charAt(0);
        int max = releaseTimes[0]; // 'a';//;
        for(int i=0; i<n; i++){
            int duration = i == 0 ? releaseTimes[i] : releaseTimes[i] - releaseTimes[i-1];
            char key = keysPressed.charAt(i);
            if(duration > max || (duration == max && key > ansChar)){
                max = duration;
                ansChar = key;
            }

        }
        System.out.println(ansChar +":"+max);

        return ansChar;
    }

    public static void main(String[] args) {
//       int[] releaseTimes = {12,23,36,46,62};
//       String keysPressed = "spuda";

       int[] releaseTimes = {9,29,49,50};
        String keysPressed = "cbcd";


        System.out.println("ans =>"+slowestKey(releaseTimes,keysPressed));

    }
}
