
/*****************************

* ���α׷���: 5���� ���� ��� ���α׷�

* �ۼ��� :  2019038072 ������	

* �ۼ��� : 20200929

*���α׷� ���� : Ű�����  5���� �й�, �̸�, ����, ����, ����,  C��� �Է¹޾�  ����, ���, ������ ����Ͽ� ����ϴ� ���α׷��̴�.


*********************************/
import java.util.Scanner;
public class GradeCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //���� ���α׷��� Ű �Է��� ���� ���� �� �ֵ��� �ڹ� ��Ű������ �����ϴ� Ŭ����
		
		char grade[]=new char[5];
		String sName[]= new String[5];//5���� �̸��� �޴� ���ڿ� �迭
		int score[][] = new int [5][7];//�й�, ����, ����, ���� ,C���, ����, ��� ������ �л��� ������ �޴� 2�����迭
		
		for(int i = 0;i<sName.length;i++) {
			System.out.println("�̸��� �Է��Ͻʽÿ� ");
			sName[i] =scanner.next();
		
			System.out.println("�й��� �Է��Ͻʽÿ� ");
			score[i][0] = scanner.nextInt();
			
			System.out.println("���������� �Է��Ͻʽÿ�");
			score[i][1] = scanner.nextInt();
			
			System.out.println("���� ������ �Է��Ͻʽÿ�");
			score[i][2] = scanner.nextInt();
			
			System.out.println("���� ������ �Է��Ͻʽÿ�");
			score[i][3] = scanner.nextInt();
			
			System.out.println("C��� ������ �Է��Ͻʽÿ�");
			score[i][4] = scanner.nextInt();
			
			for(int j=1;j<5;j++) { //��������� �л��� 5�� �迭�� �����Ѵ�
				score[i][5]+=score[i][j];
			}
			score[i][6]=score[i][5]/4; //��հ���� �л��� 6�� �迭�� ����
		}
		
		//grade���ڹ迭�� ���� ���� ������ ����Ͽ���
		for(int i=0;i<5;i++) {
			if(score[i][6] >= 90) // score[i][6]�� 90 �̻�
				grade[i] = 'A';
			else if(score[i][6] >= 80) // score[i][6]�� 80 �̻� 90 �̸�
				grade[i] = 'B';
			else if(score[i][6] >= 70) // score[i][6]�� 70 �̻� 80 �̸�
				grade[i] = 'C';
			else if(score[i][6] >=60) // score[i][6]�� 60 �̻� 70 �̸�
				grade[i] = 'D'; 
			else // score[i][6]�� 60 �̸�
				grade[i] = 'F';
			}
	
		//��ºκ�
		System.out.println("			  �������� ���α׷�	        	");
		System.out.println("____________________________________________");
		System.out.println("�й�        �̸�           ����    ����    ����     C���    ����     ���    ����");
		
		for(int i=0;i<5;i++) {
			System.out.print(score[i][0]+" ");
			System.out.print(sName[i]+" ");
			System.out.print(score[i][1]+" ");
			System.out.print(score[i][2]+" ");
			System.out.print(score[i][3]+" ");
			System.out.print(score[i][4]+" ");
			System.out.print(score[i][5]+" ");
			System.out.print(score[i][6]+" ");
			System.out.println(grade[i]);
		}
		System.out.println("____________________________________________");
		
	}

}
