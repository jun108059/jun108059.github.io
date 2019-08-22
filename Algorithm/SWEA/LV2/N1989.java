package lv2;

import java.util.Scanner;

/*
 * SW Expert Academy
 * [1989] �ʽ����� ȸ�� �˻�
 * "level" �� ���� �Ųٷ� �о ����� ���� �Ͱ� ���� �����̳� ������ ȸ��(palindrome)�̶� �Ѵ�.
 * �ܾ �Է� �޾� ȸ���̸� 1�� ����ϰ�, �ƴ϶�� 0�� ����ϴ� ���α׷��� �ۼ�
 */

public class N1989 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sol = 1;
		Scanner scan = new Scanner(System.in);
		int testcount = scan.nextInt();
		// �Է¹��� test case��ŭ �迭 ����
		// �迭�� �ܾ�� �ֱ�
		String [] wordArr = new String[testcount];
		for(int i=0; i<testcount; i++) {
			wordArr[i] = scan.next();
		}
		for(int i=0; i<testcount; i++) {
			int wordLeng= wordArr[i].length();
			// Ȧ���� ���� ���ϸ� ��
			for(int k=0; k<((wordLeng/2)); k++) {
				// �迭�� ���ڿ� ���� /2 ��ŭ Ȯ��
				if (!(wordArr[i].substring(k,k+1).equals(wordArr[i].substring(wordLeng-k-1,wordLeng-k)))) {
					sol = 0;
					break;
				}
			}
			System.out.println("#"+ (i+1) + " " + sol);
			sol = 1;
		}
	}
}
