package lv2;
import java.util.Scanner;
/*
 * SW Expert Academy
 * [2001] �ĸ� ��ġ
 * N x N �迭 ���� ���ڴ� �ش� ������ �����ϴ� �ĸ��� ������ �ǹ��Ѵ�.
 * M x M ũ���� �ĸ�ä�� �� �� ������ �ִ��� ���� �ĸ��� ���̰��� �Ѵ�.
 * ���� �ĸ��� ������ ���϶�!
 */

public class N2001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) {
			int size = scan.nextInt();
			int [][] flying = new int[size][size];
			int a_size = scan.nextInt();
			int [] sum = new int[(size-a_size+1)*(size-a_size+1)];
			int fin_sum = 0;
			// Input data �迭�� �Ҵ����ֱ�
			for (int i=0; i<flying.length; i++) {
				for (int k=0; k<flying[i].length; k++) {
					flying[i][k] = scan.nextInt();
				}
			}
			// ���� �� �� ���� ū ��� ã��
			for (int n=0; n<sum.length; n++) {
				for (int i=0; i<a_size; i++) {
					for (int k=0; k<a_size; k++) {
						sum[n] += flying[i+(n/size)][k+(n/size)];
					}
				}
				System.out.print("> " + sum[n]);
				if (fin_sum <= sum[n])	{
					fin_sum = sum[n];
					
				}
			}
			System.out.println("#" + test_case + " " + fin_sum);
		}
		scan.close();
	}
}
