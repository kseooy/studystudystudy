package sec02_2.exam02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L; // long 타입 리터럴 
		// long var3 = 1000000000000000000; <- 컴파일 에러 발생 (int 타입 범위를 넘어가기 때문에 long 타입 리터럴로 지정해야 함)
		long var4 = 1000000000000L; // Long 타입 리터럴 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
