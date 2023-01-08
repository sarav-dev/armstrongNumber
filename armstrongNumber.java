import java.util.*;

class armstrongNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Enter an integer: ");
        int N = sc.nextInt();
        int i = 1;
        System.out.println();
        while (i <= N) {
            int num = i;
            int AN = 0;
            while (num > 0) {
                int rem = num % 10;
                AN = AN + (rem*rem*rem);
                num = num/10;
            }
            if (AN == i) System.out.println("Armsstrong Number: " + AN);
            i++;
        }
        System.out.println();
        sc.close();
    }
}