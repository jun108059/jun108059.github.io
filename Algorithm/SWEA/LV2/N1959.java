package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1959] �� ���� ���ڿ�
 * ���� N, M���� ���ڷ� ������ ���ڿ� 2��
 * �� ���� �迭�� ���� �ִ��� ���
 */
public class N1959 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			int a_size = scan.nextInt();
			int b_size = scan.nextInt();
			int sol = 0; // ����
			int sum = 0; // �߰� ��
			int sub_size = 0;
			String move = "";
			if (a_size < b_size) {
				sub_size = b_size - a_size;
				move = "first";
			}else{
				sub_size = a_size - b_size;
				move = "second";
			}
			int[] a_num = new int[a_size];
			int[] b_num = new int[b_size];
			
			// �迭 �Ҵ�
			for(int i = 0; i < a_size; i++) {
				a_num[i] = scan.nextInt();
			}
			for(int i = 0; i < b_size; i++) {
				b_num[i] = scan.nextInt();
			}
			for(int i = 0; i <= sub_size; i++) { // ������
				sum = 0;
				if (move == "first") { // ù��° ���ڿ� size�� �������
					for(int k = 0; k < a_size; k++) {
						sum += a_num[k] * b_num[i+k];
					}
				}
				else if (move == "second") { // �ι�° ���ڿ� size�� �������
					for(int k = 0; k < b_size; k++) {
						sum += a_num[i+k] * b_num[k];
					}
				}
				if(sol < sum) sol = sum; // ū �� �ֱ�
			}
			System.out.println("#" + test_case + " " + sol);
		}
		scan.close();
	}
}
