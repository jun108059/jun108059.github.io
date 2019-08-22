package lv2;
import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1983] ������ ���� �ű��
 * �Է����� ������ �л����� �߰�, �⸻, ���� ������ �־�����,
 * ������ �˰���� K ��° �л��� ��ȣ�� �־����� ��,
 * K ��° �л��� ������ ����ϴ� ���α׷��� �ۼ��϶�.
 */

public class N1983 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double mid = 0, fin = 0, ass = 0;					// �߰� �⸻ ����
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();		  // �׽�Ʈ���̽� ��
        
        // �׽�Ʈ ���̽���ŭ loop
        for(int test_case = 1; test_case < scanNum + 1; test_case++) {
        	int studentNum = scanner.nextInt(); // �л� ��
            int search = scanner.nextInt(); // ������ �ñ��� �л�
            int count = 0; // loop�� count
            int persent = studentNum / 10;
            double student_arr[] = new double[studentNum];
            while (count < studentNum) {  
               	mid = scanner.nextInt();
                fin = scanner.nextInt();
                ass = scanner.nextInt();
                student_arr[count] = (mid * 0.35) + (fin * 0.45) + (ass * 0.20);
                count++; // ���� �л� �迭 ����
            }
            double sort_student_arr[] = new double[studentNum]; // sorting�� �迭 ����
            for (int i = 0; i < student_arr.length; i++) {
    	        sort_student_arr[i] = student_arr[i];
            }
            // sort
            for (int i = 0; i < sort_student_arr.length; i++) {
                for (int k = i; k <  sort_student_arr.length; k++) {
                    if (sort_student_arr[i] < sort_student_arr[k]){
                        double temp = sort_student_arr[k];
                        sort_student_arr[k] = sort_student_arr[i];
                        sort_student_arr[i] = temp;
                    }
                }
            }
            // �ش� �л� ��� ���ϱ�
            int rank = 0;
            String grade = null; // �л� ���� 
            for (int i = 0; i < student_arr.length; i++) {
    	    	if (student_arr[search-1] == sort_student_arr[i]) {
                    rank = i+1;
                }
            }
            // ���� ���ϱ�
            if (rank <= persent) {
                grade = "A+";
            }
            else if (rank <= persent*2) {
                grade = "A0";
            }
            else if (rank <= persent*3) {
                grade = "A-";
            }
            else if (rank <= persent*4) {
                grade = "B+";
            }
            else if (rank <= persent*5) {
                grade = "B0";
            }
            else if (rank <= persent*6) {
                grade = "B-";
            }
            else if (rank <= persent*7) {
                grade = "C+";
            }
            else if (rank <= persent*8) {
                grade = "C0";
            }
            else if (rank <= persent*9) {
                grade = "C-";
            }
            else if (rank <= persent*10) {
                grade = "D0";
            }
            System.out.println("#" + test_case + " " + grade);
        }
	}
}
