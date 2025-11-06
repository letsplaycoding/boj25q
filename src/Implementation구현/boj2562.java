package Implementation구현;

import java.util.Scanner;

public class boj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자연수 9개를 배열에 저장하는 과정
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();;
        }

        // 배열에 저장된 9개의 자연수 중 최댓값과 그 위치(인덱스값 + 1) 를 찾는 과정
        int max = arr[0]; // 첫 번째 값을 최댓값으로 초기화
        int index = 1;    // 첫 번째 값의 순서를 1로 설정

        for (int i = 1; i < 9; i++) { // 두 번째 값부터 확인
            if (arr[i] > max) {
                max = arr[i];         // 더 큰 값이 나오면 갱신
                index = i + 1;        // 위치는 배열 인덱스가 아닌 ‘몇 번째인지’이므로 +1
            }
        }

        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}
