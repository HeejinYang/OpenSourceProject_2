
/*****************************

* 프로그램명: 학점 계산 프로그램

* 작성자 :  2019038072 양희진	

* 작성일 : 20200922

*프로그램 설명 : 과목별 학점을 입력받은후 학점, 평균, 총점을 출력하는 프로그램이다. 


*********************************/
import java.util.Scanner;
public class GradeCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //응용 프로그램이 키 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스
		
		char grade;
		
		System.out.println("이름을 입력하십시오 ");
		String name = scanner.next(); //다음 토큰을 문자열로 리턴
		
		System.out.println("학번을 입력하십시오 ");
		int sNum = scanner.nextInt(); //다음 토큰을 int 타입으로 리턴
		
		System.out.println("국어점수를 입력하십시오");
		int korean = scanner.nextInt(); //다음 토큰을 double 타입으로 리턴
		
		System.out.println("영어 점수를 입력하십시오");
		int english = scanner.nextInt();
		
		System.out.println("수학 점수를 입력하십시오");
		int math = scanner.nextInt();
		
		System.out.println("C언어 점수를 입력하십시오");
		int cLanguage = scanner.nextInt();
		
		int sum = korean+english+math+cLanguage; //총합 계산하여 sum변수에 대입
		double mean = (korean+english+math+cLanguage)/4.0; //평균 계산하여 mean 변수에 대입
		
		if(mean >= 90) // mean가 90 이상
			grade = 'A';
			else if(mean >= 80) // mean가 80 이상 90 미만
			grade = 'B';
			else if(mean >= 70) // mean가 70 이상 80 미만
			grade = 'C';
			else if(mean >= 60) // mean가 60 이상 70 미만
			grade = 'D'; 
			else // mean가 60 이만
			grade = 'F';
		//계산후 학번 이름 학점 총점 평균 출력
		System.out.println("****************");
		System.out.println("이름: "+name);
		System.out.println("학번: "+sNum);
		System.out.println("국어 점수: "+ korean);
		System.out.println("영어 점수: "+ english);
		System.out.println("수학 점수: "+ math);
		System.out.println("C 언어 점수: "+ cLanguage);
		System.out.println("총점 : " +sum);
		System.out.println("평균: "+ mean);
		System.out.println("평균 학점: " +grade);
	}

}
