public class MinSort {

    int counter = 0;
    public int[] sorrtNumber(int[] array) {
        for (int j = 0; j < array.length; j++) {
            counter++;
            int min = array[j];
            int index = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;

                }

            }
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;



        }
        System.out.println(counter);


        return array;
    }}


