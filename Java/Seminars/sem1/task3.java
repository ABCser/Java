package sem1;

import java.util.Arrays;

// Дан массив nums = [3,2,2,3,4,1,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// [2,2,4,1,3,3,3]
public class task3 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,1,3,2,5,6,3,1,0};
        int val = 3;
        int j = 0;
        int n;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
            {
                n = nums[j];
                nums[j] = nums[i];
                nums[i]=n;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}