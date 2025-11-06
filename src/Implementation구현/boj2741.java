package Implementation구현;

import java.util.Scanner;

public class boj2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) { // i < N + 1 보단 i <= N 을 더 자주 사용함
            System.out.println(i);
        }
        sc.close();

        // 더 빠른 출력 방식
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= N; i++) {
//            sb.append(i).append("\n");
//        }
//
//        System.out.print(sb);
    }
}
