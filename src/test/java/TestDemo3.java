import demo3.BinSearch;
import demo3.Sorting;
import org.junit.*;

public class TestDemo3 {

    int[] arr;

    @Before
    public void creatArray() {
        arr = new int[]{40, 300, 68, 10, 8, 2, 6, 7, 5, 125, 89, 47, 66};
    }

    @Test
    public void testOfSorting() {
        Sorting sorting = new Sorting();

        Assert.assertArrayEquals(new int[]{2, 5, 6, 7, 8, 10, 40, 47, 66, 68, 89, 125, 300}, sorting.bubbleSort(arr));

    }

    @Test
    public void testOfSearch() {
        BinSearch binSearch = new BinSearch();

        Assert.assertEquals(1, binSearch.binarySearch(arr, 5));
        Assert.assertEquals(-1,binSearch.binarySearch(arr,900));
        Assert.assertEquals(-2,binSearch.binarySearch(arr,39));
    }

    @After
    public void testEnd() {
        System.out.println("Test finished");
    }

    @AfterClass //If using @After, it will be display after each test
    public static void finish() {
        System.out.println("GZ! All tests passed.");
    }
}
