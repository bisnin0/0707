package bcs.test2;

public class ConditionalOperationExample {
	public static void main(String[] args) {
//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		int score = 40;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : ((score > 50) ? 'C' : 'D'));
		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		
	}
}
