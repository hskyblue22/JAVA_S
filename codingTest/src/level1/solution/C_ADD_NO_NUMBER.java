package level1.solution;

public class C_ADD_NO_NUMBER {

	//없는 숫자 더하기(10/11)
	public int solution(int[] numbers) {
        int answer = 0;

        for(int i=1; i<10; i++) {
        	boolean result = true;
        	
        	for(int j=0; j<numbers.length; j++) {
        		if(i == numbers[j]) {
        			result = false;
        			break;
        		}
        	}
        	if(result) {
        		answer += i;
        	}
        }
        return answer;
    }
	
	public int solution2(int[] numbers) {
        int answer = 45;

        for(int i : numbers) {
        	answer -= i;
        }
        return answer;
    }

	public static void main(String[] args) {
		C_ADD_NO_NUMBER c = new C_ADD_NO_NUMBER();
		int[] arr = {5,8,4,0,6,7,9};
		System.out.println(c.solution(arr));
		System.out.println(c.solution2(arr));
	}
}
