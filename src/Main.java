import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sortoo(array)));
        
    }

    public static int[] sortoo(int[] array) {
        Arrays.sort(array);
        int[] res = new int[array.length];
        int sort = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            res[sort] = array[i];
            sort++;
        }
        return res;
    }
}