public class SortBubbie {

    int counter = 0;

    public int[] sortMamber(int[] array) {
        for (int j = 0; j < array.length -1 ; j++) {
            boolean IsChanged = false;

            for (int i = 0; i < array.length - 1 -j ; i++) {
                counter++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    IsChanged = true;
                }
            }
            if (!IsChanged){
                break;
            }


        }
        System.out.println(counter);

        return array;
    }

}




