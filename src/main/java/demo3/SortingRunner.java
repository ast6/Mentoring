package demo3;

public class SortingRunner {

    public static void runner() {

        int[] array = {40, 300, 68, 10, 8, 2, 6, 7, 5, 125, 89, 47, 66};
        BinSearch binSearch = new BinSearch();

        int result = binSearch.binarySearch(array, 125);
        switch (result) {
            case -1:
                System.out.println("Searched element is out of range of array");//for -1
                break;
            case -2:
                System.out.println("Array does not include element");//for -2
                break;
            default:
                System.out.println("Index of searched number is: " + result);//for index
                break;
        }
    }
}

