public class Sortall {
             public static void BubbleSort(Comparable c[]) {
        Comparable temp;

        for (int i = 0; i < c.length; i++) {
            for (int j = 1; j < c.length; j++) {

Comparable compare = c[j];

if (compare.compareTo(c[j - 1]) < 0) {
     temp = c[j - 1];
     c[j - 1] = c[j];
     c[j] = temp;
}
            }
        }
    }   
}
