
/*****************************

* 프로그램명: 5명의 학점 계산 프로그램

* 작성자 :  2019038072 양희진	

* 작성일 : 20200929

*프로그램 설명 : 키보드로  5명의 학번, 이름, 국어, 영어, 수학,  C언어 입력받아  총점, 평균, 학점을 계산하여 출력하는 프로그램이다.


*********************************/
import java.util.Scanner;
public class GradeCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //응용 프로그램이 키 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스
		
		char grade[]=new char[5];
		String sName[]= new String[5];//5명의 이름을 받는 문자열 배열
		int score[][] = new int [5][7];//학번, 국어, 영어, 수학 ,C언어, 총점, 평균 순으로 학생별 점수를 받는 2차원배열
		
		for(int i = 0;i<sName.length;i++) {
			System.out.println("이름을 입력하십시오 ");
			sName[i] =scanner.next();
		
			System.out.println("학번을 입력하십시오 ");
			score[i][0] = scanner.nextInt();
			
			System.out.println("국어점수를 입력하십시오");
			score[i][1] = scanner.nextInt();
			
			System.out.println("영어 점수를 입력하십시오");
			score[i][2] = scanner.nextInt();
			
			System.out.println("수학 점수를 입력하십시오");
			score[i][3] = scanner.nextInt();
			
			System.out.println("C언어 점수를 입력하십시오");
			score[i][4] = scanner.nextInt();
			
			for(int j=1;j<5;j++) { //총점계산후 학생별 5번 배열에 대입한다
				score[i][5]+=score[i][j];
			}
			score[i][6]=score[i][5]/4; //평균계산후 학생별 6번 배열에 대입
		}
		
		//grade문자배열을 새로 만들어서 학점을 계산하였다
		for(int i=0;i<5;i++) {
			if(score[i][6] >= 90) // score[i][6]가 90 이상
				grade[i] = 'A';
			else if(score[i][6] >= 80) // score[i][6]가 80 이상 90 미만
				grade[i] = 'B';
			else if(score[i][6] >= 70) // score[i][6]가 70 이상 80 미만
				grade[i] = 'C';
			else if(score[i][6] >=60) // score[i][6]가 60 이상 70 미만
				grade[i] = 'D'; 
			else // score[i][6]가 60 이만
				grade[i] = 'F';
			}
	
		//출력부분
		System.out.println("			  성적관리 프로그램	        	");
		System.out.println("____________________________________________");
		System.out.println("학번        이름           국어    영어    수학     C언어    총점     평균    학점");
		
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
