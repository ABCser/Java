package sem2;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arg = {1,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == 1){
                count++;
                if (count > max) max = count;
            }
            else count = 0;
        }
        System.out.println(Arrays.toString(arg));
        System.out.println(max);
    }
}