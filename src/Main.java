import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int length = 7;
        int[] array = new int[length];
        Random random = new Random();
        for (int y = 0; y < length; y++) {
            array[y] = random.nextInt(100);
        }





        System.out.println(Arrays.toString(array));


        //SortBubbie sort = new SortBubbie();
        //sort.sortMamber(array);
        MinSort sorrt = new MinSort();
        sorrt.sorrtNumber(array);
        System.out.println(Arrays.toString(array));




        System.out.println();

    }
}


