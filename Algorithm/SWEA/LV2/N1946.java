package lv2;
import java.util.Scanner;
/* 19.08.20
 * SW Expert Academy
 * [1946] ������ ���� Ǯ��
 * ���� 10���� ���ڿ� ���� �� ����
 * ���ĺ� �����ؼ� 10���� ���缭 ����
 */
public class N1946 {
	static final int line_fix = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			System.out.println("#" + test_case);
			int al_num = 0;
			int line= scan.nextInt();

			for (int i = 0; i < line; i++) {
				String alpha = scan.next();
				int count = scan.nextInt();
				for (int j = 0; j < count; j++) {
					if(al_num == line_fix) {
						al_num = 0;
						System.out.println();
					}
					System.out.print(alpha);
					al_num++;
				}
			}
			System.out.println();
		}
		scan.close();
	}
}