// 주석처리: "//" 한 줄, "/*" 여러 줄, 
//Class 파트
public class FirstEx0125 {
//Method 파트
	public static void main(String[] args) {
		int a = 5;
		// Statement(실행문) 파트    //System.out. <- 표준 입출력 함수
		System.out.println("Study");
		System.out.print("Hello JAVA\n");
		System.out.print("INHA\n");
		System.out.printf("Decimal Number = %d\n", 7); //python의 서식 지정자와 같음 
		System.out.printf("a = %d\n", a);
		System.out.println("=================================================================================");
		
		//float fv = 3.14f ;
		float fv = (float) 3.14 ;	//  뒤에 f를 붙이거나, 앞에 (flaot)를 붙이면 됨 / 기억 공간 크기와 관련된건데 공간 크기가 뭐지
		double dv = 6.28 ;
		System.out.println(fv);
		System.out.println(dv);
		System.out.println("fv = "+ fv);
		System.out.println("dv = "+ dv);
		System.out.println("=================================================================================");
		System.out.printf("fv = %f\n", fv);
		System.out.printf("fv = %.2f\n", fv); // %와 f 사이의 ".2" : 소수점 이하 2번째 자리까지만 출력하라는 뜻
		System.out.printf("fv = %07.2f\n", fv); // %과 f 사이의 "07.2" : 전체는 7자리고, 소수점은 2번째 자리까지만,
		System.out.printf("fv = %7.2f\n", fv); // %과 f 사이의 "7.2" : 위에는 "0"으로 7자리를 채웠지만, 이건 비어있음
		System.out.printf("fv = %-7.2f\n", fv); // %과 f 사이의 "-7.2" : 위에는 우측정렬, 이건 좌측 정렬(뒷부분 드래그하면 공간 있음)
		System.out.println("=================================================================================");
		System.out.printf("dv = %f\n", dv);
		System.out.printf("dv = %.2f\n", dv);
		System.out.println("=================================================================================");
		
		char ch = 'A' ;
		/* char ch2 = "A" ; // Java는 "와 '를 구분한다... / Compiler가 인신하는게 달라져서.. 
		 * '로 묶으면, 문자 하나(character)로 취급
		 * "로 묶으면, character가 아닌 문자열(string)으로 취급하기 때문에 오류가 나옴 
		 * 문자 하나면 2byte에 넣는데, "로 묶으면 문자열로 취급해서 2byte(문자열)+2byte(끝에 null문자) => 4byte에 할당 하고, 
		 * 2byte로 넣어서 오류 
		 * 그리고 Java에서 문자열은 null문자(\0)로 끝나야 하는데,
		 * character는 null문자를 포함하지 않는다.. */
		
		String ch2 = "A";		// 이렇게 하면 해결됨..
		System.out.println(ch2);
		System.out.printf("ch = %c\n", ch);
		System.out.printf("ch = %d\n", (int)ch); // "A"의 ASCII 코드
		System.out.println("=================================================================================");
		String	name = "gildong";  // name이라는 변수에 문자열 "gildong"을 넣겠다... String은 문자열 Class
								   // name은 String class의 변수
		System.out.println("name = " + name); 		//  syso를 입력하고 Ctrl+space 입력하면 System.out.println(); 자동완성
		System.out.print("name = " + name + "\n");
		System.out.printf("name = %s\n", name);
		System.out.println("=================================================================================");
		
		final double PI = 3.14159 ;		//  변수는 소문자, 상수는 대문자로 하는게 관례다.. 
		// final의 용도: 1. 상수 선언 / 2. Class 간의 상속 시 Method Overiding을 막고자 할 때 / 3. Class의 상속을 막고자 할 때
		//  PI = 3.14159; // 상수는 수정불가.. ERROR 발생
		System.out.printf("PI = %.5f\n", PI);
		System.out.println("=================================================================================");
		
		// 피연산자 = 연산수 operand / 연산자 operator
		int s = 15 / 2;
		int p = 13 % 4;
		System.out.printf("s = %d, p = %d\n", s, p);
		// 증감연산자 ++, --
		int k = 3;
		++k ;
		k++ ;		//  이 두개는 사실 똑같긴 한데.. print로 출력하면 다르게 나올 때도 있다.
		System.out.printf("k = %d\n", k);
		}
}