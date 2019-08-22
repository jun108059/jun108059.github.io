package lv2;

import java.util.Scanner;
/* 19.08.20
 * SW Expert Academy
 * [1961] ���� �迭 ȸ��
 * N x N ����� �־��� ��,
 * �ð� �������� 90��, 180��, 270�� ȸ���� ����� ���
 */
public class N1961 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			int size = scan.nextInt();
			int[][] input_Arr = new int[size][size];
			int[][] turn_90 = new int[size][size];
			int[][] turn_180 = new int[size][size];
			int[][] turn_270 = new int[size][size];
			// �迭 �Ҵ�
			for(int i = 0; i < size; i++) {
				for(int k = 0; k < size; k++) {
					input_Arr[i][k] = scan.nextInt();
				}
			}
			// 90��
			for (int i = 0; i < turn_90.length; i++) {
				for (int j = 0; j < turn_90.length; j++) {
					turn_90[j][size-1-i] = input_Arr[i][j];
				}
			}
			// 180��
			for (int i = 0; i < turn_180.length; i++) {
				for (int j = 0; j < turn_180.length; j++) {
					turn_180[size-1-i][size-1-j] = input_Arr[i][j];
				}
			}
			// 270��
			for (int i = 0; i < turn_270.length; i++) {
				for (int j = 0; j < turn_270.length; j++) {
					turn_270[size-1-j][i] = input_Arr[i][j];
				}
			}
			
			System.out.println("#" + test_case);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(turn_90[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(turn_180[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(turn_270[i][j]);
				}
				System.out.println();
			}
		}
		
		scan.close();
	}
}
