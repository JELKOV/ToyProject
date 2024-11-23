package Test1.ToyProject;

import java.util.Scanner;
import java.util.Stack;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        String input = sc.nextLine(); // 괄호 문자열 입력 받기
        Stack<Character> stack = new Stack<>(); // 열린 괄호를 저장할 스택 생성
        int result = 0; // 잘린 쇠막대기의 총 개수를 저장할 변수 초기화

        // 입력 문자열을 한 글자씩 순회
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i); // 현재 문자를 가져옴

            if (current == '(') {
                stack.push(current); // '('인 경우 스택에 추가
            } else {
                stack.pop(); // ')'인 경우 스택에서 '('를 제거 (pop)

                if (input.charAt(i - 1) == '(') {
                    // 이전 문자가 '('인 경우 -> 레이저
                    result += stack.size(); // 현재 스택 크기만큼 잘린 쇠막대기 개수를 더함
                } else {
                    // 이전 문자가 ')'인 경우 -> 쇠막대기의 끝
                    result += 1; // 잘린 쇠막대기 하나를 추가
                }
            }
        }

        System.out.println(result); // 결과 출력
    }
}
