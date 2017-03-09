package demo3;

public class BinSearch {

    public int binarySearch(int[] arr, int searchNumber) {

        Sorting sorting = new Sorting();
        int[] sortedArr = sorting.bubbleSort(arr);

        int size = sortedArr.length;
        int low = 0;
        int high = size - 1;
        int index = -1;
        int mid =0;

        if (searchNumber < sortedArr[0] || searchNumber > sortedArr[sortedArr.length - 1]) {
            System.out.println(String.format("Array does not include \"%s\"element", searchNumber));
        } else {
            while (low <= high) {
                mid = (low + high) / 2;
                if (sortedArr[mid] == searchNumber) {
                    index = mid;
                    break;
                }
                if (sortedArr[mid] <= searchNumber) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
            if (arr [mid] != searchNumber ){
                index = -2;
            }
        }
        return index;

    }

}
