package bcs.test2;

import java.util.Scanner;

public class MultiFTest2 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		int count = stdin.nextInt();
		if (count < 0 )
		{
			System.out.print("�Էµ� �� " + count);
			System.out.print("��(��) �����Դϴ�");
		
		}
		else if (count ==0)
			System.out.print("�Էµ� ���� 0 �Դϴ�");
		else {
			System.out.print("�Էµ� �� " + count);
			System.out.print("��(��) ����Դϴ�.");
		}
					
		
		
	}

}