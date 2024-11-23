package Test1.ToyProject;

import java.util.Scanner;
import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위해 Scanner 객체 생성

        // 입력: 소의 수 N
        int N = sc.nextInt(); // 소들의 수를 입력 받아 변수 N에 저장
        int[] heights = new int[N]; // 소들의 키를 저장할 배열 생성

        // 소들의 키 입력 받기
        for (int i = 0; i < N; i++) { // N번 반복하며 각 소의 키를 입력 받음
            heights[i] = sc.nextInt(); // 입력 받은 소의 키를 배열에 저장
        }

        long count = 0; // 확인 가능한 소들의 수를 저장할 변수 초기화
        int[] stack = new int[N]; // 스택 역할을 할 배열 생성 (소들의 키를 저장)
        int top = -1; // 스택의 최상단 인덱스 초기화 (-1은 스택이 비어있음을 의미)

        // 메인 루프: 소들의 키를 순차적으로 처리
        for (int i = 0; i < N; i++) { // 각 소의 키를 순회하며 처리
            // 현재 소의 키보다 작거나 같은 소는 스택에서 제거
            while (top >= 0 && stack[top] <= heights[i]) { // 스택이 비어있지 않고, 스택 최상단 소의 키가 작거나 같을 때
                top--; // pop 연산: 스택 최상단 소를 제거
            }

            // 현재 소가 확인할 수 있는 소의 수는 스택에 남아있는 소들의 수와 동일
            count += (top + 1); // top + 1은 스택에 남아있는 요소 개수를 의미

            // 현재 소를 스택에 추가
            stack[++top] = heights[i]; // push 연산: 현재 소의 키를 스택에 저장
        }

        // 결과 출력
        System.out.println(count); // 확인 가능한 소들의 총합을 출력
    }
}
