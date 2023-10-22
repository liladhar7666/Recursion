package java3.TimeComplexity;

public class BigONotations {

    public static void main(String[] args) {

        int a[] = {3, 7, 1, 7, 23, 5};
//        int key = 10;
//        System.out.println(a.length);
        printAllPairInArray(a);

    }


    //    best case example -- just a find number a[0]
    static int getFirstNumber(int a[]) {
        return a[0];
    }

    //this is the worst case -- find key = 10; it not include in array so.
    static boolean CheckIfNumberIsPresent(int a[], int key) {
        for (int element : a) {
            if (element == key) return true;
        }
        return false;
    }

    static void printAllPairInArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(a[i] + " " + a[j]);
            }
        }
    }


}