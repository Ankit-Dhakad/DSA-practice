// Q4. Take n numbers as inputs and find their HCF and LCM.

import java.util.Arrays;
import java.util.Scanner;

public class HCFLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {34, 58, 44};  // Replace with your numbers
        int hcf = findHCF(numbers);
        int lcm = findLCM(numbers);
        System.out.println("HCF of " + Arrays.toString(numbers) + " is " + hcf);
        System.out.println("LCM of " + Arrays.toString(numbers) + " is " + lcm);
    }
    public static int findHCF(int[] numbers) {
        int hcf = numbers[0];
        for (int num : numbers) {
            hcf = findGCD(hcf, num);
        }
        return hcf;
    }

    public static int findLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int num : numbers) {
            lcm = (lcm * num) / findGCD(lcm, num);
        }
        return lcm;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
