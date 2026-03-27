package baekjoon.bronze;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String yeondu = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        String[] teams = new String[n];
        for (int i = 0; i < n; i++) {
            teams[i] = sc.nextLine();
        }

        // 1. 연두 이름 LOVE 개수
        int L = 0, O = 0, V = 0, E = 0;
        for (char c : yeondu.toCharArray()) {
            if (c == 'L') L++;
            else if (c == 'O') O++;
            else if (c == 'V') V++;
            else if (c == 'E') E++;
        }

        String answer = "";
        int max = -1;

        // 2. 팀마다 계산
        for (String team : teams) {

            int l = L, o = O, v = V, e = E;

            // 팀 이름에서 추가 카운트
            for (char c : team.toCharArray()) {
                if (c == 'L') l++;
                else if (c == 'O') o++;
                else if (c == 'V') v++;
                else if (c == 'E') e++;
            }

            // 공식 계산
            int score =
                (l + o) *
                (l + v) *
                (l + e) *
                (o + v) *
                (o + e) *
                (v + e) % 100;

            // 최대값 갱신
            if (score > max) {
                max = score;
                answer = team;
            } else if (score == max) {
                if (team.compareTo(answer) < 0) {
                    answer = team;
                }
            }
        }

        System.out.println(answer);
    }
}