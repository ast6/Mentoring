package demo3;

public class SortingRunner {

    public static void main(String[] args) {

        int[] array = {40, 300, 68, 10, 8, 2, 6, 7, 5, 125, 89, 47, 66};
        BinSearch binSearch = new BinSearch();

//        Sorting sorting = new Sorting();
//        int[] sortArr = sorting.bubbleSort(array);
//        for (int i = 0; i < sortArr.length; i++) {
//            System.out.println(sortArr[i]);
//        }
//        if (binSearch == -1) {
//            System.out.println("Array does not include entered element");
//        } else {
            System.out.println("Index of searched number is: " + binSearch.binarySearch(array, 9));
        }

    }
//}
