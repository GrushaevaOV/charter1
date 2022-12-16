import java.util.Arrays;

public class puzir {

    static void print (double array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
     static void sort (double arr[]){
         for (int i=0; i< arr.length;i++) {
             for (int j = 1; j< arr.length-i;j++)
                if (arr[j]<arr[j-1]) {
                    double k=arr[j-1];
                   arr[j-1] = arr[j];
                     arr[j] = k;
                }
         }
    print(arr);
     }

    public static void main(String[] args) {
        double[] nums = new double[] { 5, 4, 3, 1 };
        sort (nums);

    }
}
