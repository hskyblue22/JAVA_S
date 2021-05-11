package com.kh.variable;

public class C_Overflow {
	
	public void printVariableSize() {
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");
		
		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");
		System.out.println("char의 크기 : " + Character.BYTES + "byte");
	}
	
	public void overflow() {
		
		byte bNum = 127;
		System.out.println(bNum);
		
		byte result = (byte)(bNum+3);  //bNum+3 만 적으면 오류남(int라서) -> 형변환 필수
		
		System.out.println("result : " + result);//130 X -> -128 -127 -126
	
		
		int num1 = 1000000;
		int num2 = 700000;
		
		int result2 = num1 * num2;  //7조
		System.out.println("result : " + result2);
				
		long result3 = num1 * (long)num2;  //이곱셈 자체에 결과값이 int형으로 되기 때문에 그순간 이미 오버플로우가 발생했을 것임, 
										   // 그래서 둘 중하나라도 long형으로 강제 형변환을 시켜줘야 함
		System.out.println("result : " + result3);
	}

}
