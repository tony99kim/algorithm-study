package baekjoon.bronze;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        int len = N.length();
        
        for (int i = 1; i < len; i++) {
            int leftProduct = 1;
            int rightProduct = 1;
            
         
            for (int j = 0; j < i; j++) {
                leftProduct *= (N.charAt(j) - '0');
            }
            
          
            for (int j = i; j < len; j++) {
                rightProduct *= (N.charAt(j) - '0');
            }
            
            if (leftProduct == rightProduct) {
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}
