package main;

public class Ex9 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 10.0f;
		double d = f;
		System.out.println(d);
		
		int iNum = 1;
		float fNum = iNum;
		System.out.println(fNum);
		
		//연산 중에 자동형변환이 되는 경우
		System.out.println(iNum + fNum);
		
	}

}
