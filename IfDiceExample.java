package bcs.test2;

public class IfDiceExample {
	public static void main(String[] args) {

		
		int num = (int)(Math.random()*6) + 1;

			switch(num) {
				case 1:
					System.out.print("1���� ���Խ��ϴ�.");
					break;
				case 2:
					System.out.print("2���� ���Խ��ϴ�.");
					break;
				case 3:
					System.out.print("3���� ���Խ��ϴ�.");
					break;
				case 4:
					System.out.print("4���� ���Խ��ϴ�.");
					break;
				case 5:
					System.out.print("5���� ���Խ��ϴ�.");
					break;
				default:				
					System.out.print("6���� ���Խ��ϴ�.");
					break;
			}
//		if(num==1) {
//			System.out.println("1���� ���Խ��ϴ�.");
//		} else if(num==2) {	
//			System.out.println("2���� ���Խ��ϴ�.");
//		} else if(num==3) {
//			System.out.println("3���� ���Խ��ϴ�.");
//		} else if(num==4) {
//			System.out.println("4���� ���Խ��ϴ�.");
//		} else if(num==5) {
//			System.out.println("5���� ���Խ��ϴ�.");
//		} else {
//			System.out.println("6���� ���Խ��ϴ�.");
//		}
	}
}


//char grade = 'B';
//
//switch(grade) {
//	case 'A':
//	case 'a':
//		System.out.println("��� ȸ���Դϴ�.");
//		break;
//	case 'B':
//	case 'b':
//		System.out.println("�Ϲ� ȸ���Դϴ�.");
//		break;							
//	default:
//		System.out.println("�մ��Դϴ�.");