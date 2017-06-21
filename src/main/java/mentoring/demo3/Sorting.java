package mentoring.demo3;

public class Sorting {

    public int[] bubbleSort(int[] arr) {

        int size = arr.length;

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
}

