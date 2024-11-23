package Test1.ToyProject;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 학생 수 입력 받기
		int N = sc.nextInt();

		// 점수를 저장할 배열 생성
		int[] scores = new int[N];
		for (int i = 0; i < N; i++) {
			scores[i] = sc.nextInt(); // 각 학생의 점수를 배열에 저장
		}

		// 초기 최댓값과 최솟값 설정
		int maxScore = scores[0];
		int minScore = scores[0];

		// 최댓값과 최솟값 찾기
		for (int i = 1; i < N; i++) {
			if (scores[i] > maxScore) {
				maxScore = scores[i]; // 최댓값 갱신
			}
			if (scores[i] < minScore) {
				minScore = scores[i]; // 최솟값 갱신
			}
		}

		// 최댓값과 최솟값의 차이 계산 및 출력
		int difference = maxScore - minScore;
		System.out.println(difference);
	}
}
