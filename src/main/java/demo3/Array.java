package demo3;

public class Array {


    public static void arrayBuilder() {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <8; j++) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

}
