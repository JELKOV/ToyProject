package Test1.ToyProject;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 Scanner 객체 생성

        // 학생 수 입력 받기
        int N = sc.nextInt(); // 학생 수를 입력 받아 N에 저장

        // 점수를 저장할 배열 생성
        int[] scores = new int[N]; // 학생들의 점수를 저장할 크기 N의 배열 생성
        for (int i = 0; i < N; i++) { // N번 반복하며 각 학생의 점수를 입력 받음
            scores[i] = sc.nextInt(); // 각 학생의 점수를 배열에 저장
        }

        // 초기 최댓값과 최솟값 설정
        int maxScore = scores[0]; // 첫 번째 점수를 최댓값으로 초기화
        int minScore = scores[0]; // 첫 번째 점수를 최솟값으로 초기화

        // 최댓값과 최솟값 찾기
        for (int i = 1; i < N; i++) { // 두 번째 점수부터 마지막 점수까지 반복
            if (scores[i] > maxScore) { // 현재 점수가 최댓값보다 크다면
                maxScore = scores[i]; // 최댓값 갱신
            }
            if (scores[i] < minScore) { // 현재 점수가 최솟값보다 작다면
                minScore = scores[i]; // 최솟값 갱신
            }
        }

        // 최댓값과 최솟값의 차이 계산 및 출력
        int difference = maxScore - minScore; // 최댓값과 최솟값의 차이를 계산
        System.out.println(difference); // 계산된 차이를 출력
    }
}
