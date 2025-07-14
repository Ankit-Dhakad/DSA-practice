//Q. Find Ncr & Cpr

import java.util.Scanner;
public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.print("Enter the choose (r) : ");
        int r = sc.nextInt();
//        int nminusr = n - r;

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        int rfactorial = 1;
        for(int i = 1; i<=r; i++){
            rfactorial = rfactorial * i;
        }
        int nminusrfactorial = 1;
        for (int i = 2; i <=(n-r); i++) {
            nminusrfactorial = nminusrfactorial * i;
        }
        int npr = factorial / nminusrfactorial;
        int ncr = factorial / (rfactorial * nminusrfactorial);
        System.out.println("The NPR is : " + npr);
        System.out.print("The CPR is : " + ncr);
    }
}