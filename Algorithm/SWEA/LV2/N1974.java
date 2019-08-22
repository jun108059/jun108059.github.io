package lv2;
import java.util.Scanner;

/* 19.08.14
 * SW Expert Academy
 * [1974] ������ ����
 * ������ ������ �����ϴ� ���α׷�
 */
public class N1974 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case �� �Է�
		for (int test_case = 1; test_case < test+1; test_case++) { // test case ��ŭ Loop
			int [][] sudozu = new int[9][9];
			int[] sum_cal = new int[9];
			int[] squal = new int[9];
			int sum_line = 0;
			int tf = 0;
			for (int i = 0; i < sudozu[0].length; i++) {
				for(int j = 0; j < sudozu.length; j++) {
					sudozu[i][j] = scan.nextInt();
					sum_line += sudozu[i][j];
					if(j == 8 && tf != 1) {
						// i�� 9�� ����� �� �� = ������ �˻�
						if(sum_line%45 != 0) {
							System.out.println("#" + test_case + " 0");
							tf = 1;
							break;
						}
					}
					// ������ �˻�
					switch(j) {
					case 0:
						sum_cal[0] += sudozu[i][j];
						break;
					case 1:
						sum_cal[1] += sudozu[i][j];
						break;
					case 2:
						sum_cal[2] += sudozu[i][j];
						break;
					case 3:
						sum_cal[3] += sudozu[i][j];
						break;
					case 4:
						sum_cal[4] += sudozu[i][j];
						break;
					case 5:
						sum_cal[5] += sudozu[i][j];
						break;
					case 6:
						sum_cal[6] += sudozu[i][j];
						break;
					case 7:
						sum_cal[7] += sudozu[i][j];
						break;
					case 8:
						sum_cal[8] += sudozu[i][j];
						break;
					}
					
					// 3x3 �ڽ� ó��
					if (i<3) {
						if(j<3) squal[0] += sudozu[i][j];
						else if(3<=j && j<6) squal[1] += sudozu[i][j];
						else if(6<=j && j<9) squal[2] += sudozu[i][j];
					}
					else if (3<=i && i<6) {
						if(j<3) squal[3] += sudozu[i][j];
						else if(3<=j && j<6) squal[4] += sudozu[i][j];
						else if(6<=j && j<9) squal[5] += sudozu[i][j];
					}
					else{
						if(j<3) squal[6] += sudozu[i][j];
						else if(3<=j && j<6) squal[7] += sudozu[i][j];
						else if(6<=j && j<9) squal[8] += sudozu[i][j];
					}

				}
				
					
			}
			for (int k=0; k<sum_cal.length; k++) {
				if (sum_cal[k]%45 != 0 &&  tf != 1) {
					System.out.println("#" + test_case + " 0");
					tf = 1;
					break;
				}
				if (squal[k] != 45 &&  tf != 1) {
					System.out.println("#" + test_case + " 0");
					tf = 1;
					break;
				}
			}
			
			if (tf == 0) {
				System.out.println("#" + test_case + " 1");
			}
		}
	}
}


/*
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int map[][] = new int[9][9];
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int ans = 1;
            for(int i = 0; i < 9; i++) {
                int arr[] = new int[10];
                for(int j = 0; j < 9; j++) {
                    arr[map[i][j]]++;
                    arr[map[j][i]]++;
                    arr[map[(i / 3) * 3 + (j / 3)][(i % 3) * 3 + (j % 3)]]++;
                }
                for(int j = 1; j <= 9; j++) {
                    if(arr[j] < 3) {
                        ans = 0;
                        break;
                    }
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
    }
}
*/