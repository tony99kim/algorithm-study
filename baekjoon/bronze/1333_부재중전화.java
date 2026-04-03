package baekjoon.bronze;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int L = sc.nextInt();
        int D = sc.nextInt();
        
        int total = (N - 1) * (L + 5) + L;
        
        for (int t = 0; ; t += D) {
            
            if (t > total) {
                System.out.println(t);
                break;
            }
            
            int mod = t % (L + 5);
            
            if (mod >= L) {
                System.out.println(t);
                break;
            }
        }
    }
}