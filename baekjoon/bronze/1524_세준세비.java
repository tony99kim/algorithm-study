package baekjoon.bronze;

import java.util.*;

class Main {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int t = 0; t < T; t++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int maxJ = 0;
            int maxB = 0;

            for(int i = 0; i < N; i++){
                maxJ = Math.max(maxJ, sc.nextInt());
            }

            for(int i = 0; i < M; i++){
                maxB = Math.max(maxB, sc.nextInt());
            }

            if(maxJ >= maxB){
                System.out.println("S");
            } else {
                System.out.println("B");
            }
        }

    }
}
