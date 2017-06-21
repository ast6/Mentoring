package mentoring.demo3;

public class BinSearch {

    public int binarySearch(int[] arr, int searchNumber) {

        Sorting sorting = new Sorting();
        int[] sortedArr = sorting.bubbleSort(arr);

        int low = 0;
        int high = sortedArr.length - 1;
        int index = -1;
        int mid = 0;

        if (searchNumber >= sortedArr[0] && searchNumber <= sortedArr[sortedArr.length - 1]) {
            while (low <= high) {
                mid = (low + high) / 2;
                if (sortedArr[mid] == searchNumber) {
                    index = mid;
                    break;
                }
                if (sortedArr[mid] <= searchNumber) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (arr[mid] != searchNumber) {
                index = -2;
            }
        }
        return index;

    }

}
