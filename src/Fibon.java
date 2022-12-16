import java.util.Arrays;
public class Fibon {

    public static void main(String[] args) {
        int nums[];
        nums = new int[15];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < 15; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(i + " " + nums[i]);

        }
    }
}
