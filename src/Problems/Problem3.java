package Problems;

public class Problem3 {
    public static void main(String[] args) {

      int a[] = {1, 3, 20, 4, 1, 0};
//int a []= {1};
        int peek = 0;

        if (a.length == 1) {
            peek = a[0];
        } 
        else {

            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    peek = a[i];
                }
            }

            if (a[0] > a[1]) {
                peek = a[0];
            }

            if (a[a.length - 1] > a[a.length - 2]) {
                peek = a[a.length - 1];
            }
        }

        System.out.println(peek);
    }
}