
/*****************************

* ���α׷���: ���� ��� ���α׷�

* �ۼ��� :  2019038072 ������	

* �ۼ��� : 20200922

*���α׷� ���� : ���� ������ �Է¹����� ����, ���, ������ ����ϴ� ���α׷��̴�. 


*********************************/
import java.util.Scanner;
public class GradeCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //���� ���α׷��� Ű �Է��� ���� ���� �� �ֵ��� �ڹ� ��Ű������ �����ϴ� Ŭ����
		
		char grade;
		
		System.out.println("�̸��� �Է��Ͻʽÿ� ");
		String name = scanner.next(); //���� ��ū�� ���ڿ��� ����
		
		System.out.println("�й��� �Է��Ͻʽÿ� ");
		int sNum = scanner.nextInt(); //���� ��ū�� int Ÿ������ ����
		
		System.out.println("���������� �Է��Ͻʽÿ�");
		int korean = scanner.nextInt(); //���� ��ū�� double Ÿ������ ����
		
		System.out.println("���� ������ �Է��Ͻʽÿ�");
		int english = scanner.nextInt();
		
		System.out.println("���� ������ �Է��Ͻʽÿ�");
		int math = scanner.nextInt();
		
		System.out.println("C��� ������ �Է��Ͻʽÿ�");
		int cLanguage = scanner.nextInt();
		
		int sum = korean+english+math+cLanguage; //���� ����Ͽ� sum������ ����
		double mean = (korean+english+math+cLanguage)/4.0; //��� ����Ͽ� mean ������ ����
		
		if(mean >= 90) // mean�� 90 �̻�
			grade = 'A';
			else if(mean >= 80) // mean�� 80 �̻� 90 �̸�
			grade = 'B';
			else if(mean >= 70) // mean�� 70 �̻� 80 �̸�
			grade = 'C';
			else if(mean >= 60) // mean�� 60 �̻� 70 �̸�
			grade = 'D'; 
			else // mean�� 60 �̸�
			grade = 'F';
		//����� �й� �̸� ���� ���� ��� ���
		System.out.println("****************");
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+sNum);
		System.out.println("���� ����: "+ korean);
		System.out.println("���� ����: "+ english);
		System.out.println("���� ����: "+ math);
		System.out.println("C ��� ����: "+ cLanguage);
		System.out.println("���� : " +sum);
		System.out.println("���: "+ mean);
		System.out.println("��� ����: " +grade);
	}

}
