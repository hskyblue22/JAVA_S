package level1.solution;

import java.util.Arrays;

public class E_같은숫자는싫어 {

	//같은 숫자는 싫어 (10/11)
	public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        int count = 1;
        
        for(int i=0; i<arr.length-1; i++) {

        	if(arr[i] == arr[i+1]) {
        		continue;
        	}else {
        		answer[count++] = arr[i+1];
        	}
        }
        answer = Arrays.copyOfRange(answer, 0, count);
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		E_같은숫자는싫어 e = new E_같은숫자는싫어();
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr1 = {4,4,4,3,3};
		int[] result = e.solution(arr);
		System.out.println(Arrays.toString(result));
	}

}
