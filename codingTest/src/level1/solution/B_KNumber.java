package level1.solution;

import java.util.Arrays;

public class B_KNumber {

	//k번째 수 10.03
	public int[] solution(int[] array, int[][] commands) {
	    int[] answer;
	    answer = new int[commands.length];
	    
	    for(int i=0; i< commands.length; i++) {
	    	int[] tempArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	    	Arrays.sort(tempArr);
	    	answer[i] = tempArr[commands[i][2]-1];
	    }

	    return answer;
	}
	
	public static void main(String[] args) {
		
		B_KNumber kn = new B_KNumber();
		int[] value1 = {1,5,2,6,3,7,4};
		int[][] value2 = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] ans = kn.solution(value1, value2);
		System.out.println(Arrays.toString(ans));
	}

}
