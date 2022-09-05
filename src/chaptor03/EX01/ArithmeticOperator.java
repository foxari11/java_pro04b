package chaptor03.EX01;

public class ArithmeticOperator {
    public static void main(String[] args) {
		// 연산자 
    	// 1. 산술 연산자 ( +, -, * , /, %(나머지값만) )
    	System.out.println(2+3);
    	System.out.println(8-5);
    	System.out.println(7*2);
    	System.out.println(7/2); // 몫만 출력
    	System.out.println(7.0/2.0); // 나눈 값을 제대로 출력함 (평균낼땐 더블!)
    	System.out.println(8%5); // 나머지값만 출력 
    	System.out.println("======================");
    	
    	// 2.증감 연산자 : case 1
    		//++ : 1씩증가
    		//-- : 1씩감소
    	int value1 = 3;
    	value1 ++;
    	System.out.println(value1);
    	
    	int value2 = 3;
    	++ value2;
    	System.out.println(value2);
    	
    	System.out.println(     "=======================");

    	
    	//2. 증감 연산자 case 2
    	
    	int value3 = 3;
    	int value4 = value3++;
    	
    	System.out.println(value3); // 4
    	System.out.println(value4); // 3
    	System.out.println( "====================");
    	
    	
    	int value5 = 3;
    	int value6 = ++value5;
    	
    	System.out.println(value5); // 4
    	System.out.println(value6); // 4 
    	System.out.println("======================");
    	
    	
    	//2. 증감 연산자 case 3 
    	
    	int value7 = 3;
    	int value8 = 4;
    	int value9 = 2 + value7-- + ++value8 ; // 2 + 3 + 5 
       	
    	System.out.println(value7);
    	System.out.println(value8);
    	System.out.println(value9);

    	
    	    	
//    	++를 앞이든 뒤든 혼자 있을 땐 아무런 상관이 없었는데, 두개가 오니까 앞 뒤 차이가 생김
//    	앞에 온 경우는 대입된 상태에서 더하기가 가능하나, 뒤에 온 경우는 더하기가 안됨.

    	
    
    
    }
}
