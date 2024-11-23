package Test1.ToyProject;

import java.util.Scanner;
import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위해 Scanner 객체 생성
        int N = sc.nextInt(); // 탑의 개수 입력
        int[] heights = new int[N]; // 각 탑의 높이를 저장할 배열
        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder 생성

        // 탑의 높이 입력 받기
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt(); // 입력받은 높이를 배열에 저장
        }

        Stack<Integer> stack = new Stack<>(); // 탑의 인덱스를 저장할 스택 생성

        // 각 탑에 대해 수신 가능한 탑 찾기
        for (int i = 0; i < N; i++) {
            // 스택이 비어있지 않고 현재 탑이 스택 최상단 탑보다 높은 경우
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop(); // 스택 최상단 탑 제거 (수신 불가능한 탑)
            }

            // 스택이 비어있는 경우 (수신 가능한 탑이 없음)
            if (stack.isEmpty()) {
                result.append("0 "); // 0을 결과에 추가
            } else {
                // 스택 최상단 탑이 현재 탑의 신호를 수신 (1-based 인덱스)
                result.append((stack.peek() + 1) + " ");
            }

            // 현재 탑의 인덱스를 스택에 추가
            stack.push(i);
        }

        // 결과 출력
        System.out.println(result.toString().trim()); // 결과 문자열 출력 (마지막 공백 제거)
    }
}
