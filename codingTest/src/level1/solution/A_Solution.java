package level1.solution;

public class A_Solution {
	
	//문자열다루기 기본
	public boolean solution1(String s) {
		boolean answer = false;
		
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				String si = String.valueOf(s.charAt(i));
				
				try{
					int ii = Integer.valueOf(si);  //NumberFormatException 발생
				}catch(NumberFormatException e) {
					return answer;
				}
			}
			answer = true;
			return answer;
		}else {
			return answer;
		} 
    }
	
	//문자열다루기 기본2
	public boolean solution1_1(String s) {
		
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				//int ch = s.charAt(i); --> int로 자동형변환되면 숫자가 커진다,,,
				char ch = s.charAt(i);
				System.out.println(ch);
				
				if(ch<'0' || ch>'9') {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}

	public void method1() {
		
		for(int i=0, j =0; i<10 ;i++,++j) {
			System.out.println("i : "+i);
			System.out.println("j : "+j);
		}
	}
}
