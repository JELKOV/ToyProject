package Test1.ToyProject;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 숫자의 개수 K
        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>(); // 숫자를 저장할 스택 생성

        // K개의 숫자 입력 및 처리
        for (int i = 0; i < K; i++) {
            int number = sc.nextInt(); // 입력된 숫자

            if (number == 0 && !stack.isEmpty()) {
                // 숫자가 0이면 스택에서 마지막으로 추가된 숫자 제거
                stack.pop();
            } else {
                // 숫자가 0이 아니면 스택에 추가
                stack.push(number);
            }
        }

        // 스택에 남아있는 숫자들의 합을 계산
        // 초기값 설정
        int sum = 0;
        // 반복문 통해 stack에 넣은 값들을 반복적으로 더해준다
        for (int num : stack) {
            sum += num; // 남아있는 숫자를 합산
        }

        // 최종 결과 출력
        System.out.println(sum);
    }
}
