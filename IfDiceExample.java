package bcs.test2;

public class IfDiceExample {
	public static void main(String[] args) {

		
		int num = (int)(Math.random()*6) + 1;

			switch(num) {
				case 1:
					System.out.print("1번이 나왔습니다.");
					break;
				case 2:
					System.out.print("2번이 나왔습니다.");
					break;
				case 3:
					System.out.print("3번이 나왔습니다.");
					break;
				case 4:
					System.out.print("4번이 나왔습니다.");
					break;
				case 5:
					System.out.print("5번이 나왔습니다.");
					break;
				default:				
					System.out.print("6번이 나왔습니다.");
					break;
			}
//		if(num==1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if(num==2) {	
//			System.out.println("2번이 나왔습니다.");
//		} else if(num==3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if(num==4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if(num==5) {
//			System.out.println("5번이 나왔습니다.");
//		} else {
//			System.out.println("6번이 나왔습니다.");
//		}
	}
}


//char grade = 'B';
//
//switch(grade) {
//	case 'A':
//	case 'a':
//		System.out.println("우수 회원입니다.");
//		break;
//	case 'B':
//	case 'b':
//		System.out.println("일반 회원입니다.");
//		break;							
//	default:
//		System.out.println("손님입니다.");