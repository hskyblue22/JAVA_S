package level1.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class F_수박수 {
	//1.수박수박수박수?
	
	//내가 푼 방법
	public String solution(int n) {
		String str1 = "수";
		String str2 = "박";
		
		String answer = "";
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) 
				answer += str1;
			else 
				answer += str2;
		}
        return answer;
    }
	
	//다른 사람 방법 보고 풀어보기
	//삼항연산자 사용
	public String solution1(int n) {
		
		String answer = "";
		
		for(int i=1; i<=n; i++) {
			answer += i%2 == 1 ? "수" : "박";
		}
        return answer;
    }
	
	
	
	//2. 가운데 글자 가져오기
	public String solution(String s) { 
        int leng = s.length();
        
        if(leng %2 == 1) {
        	return s.substring(leng/2, leng/2+1);
        }else {
        	return s.substring(leng/2 -1, leng/2 +1);
        }
    }
	
	
	//3. 두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {
		ArrayList<Integer> temp = new ArrayList<>();  //numbers 더한 값 넣기
		ArrayList<Integer> mid = new ArrayList<>();   //temp 에서 중복 없애기
		int[] answer = {};

		//numbers 더한 값 넣기
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		temp.add(numbers[i]+ numbers[j]);
        	}
        }
        
        //중복 없애기
        for(int item : temp) {
        	if(!mid.contains(item))
        		mid.add(item);
        }
        
        //정수 arraylist -> 정수 배열 / stream API 사용
        answer = mid.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
	
	//3. 두 개 뽑아서 더하기
	//mid 없애기, stream API 쓰지 않기
	public int[] solution1(int[] numbers) {
		ArrayList<Integer> temp = new ArrayList<>();  //numbers 더한 값 넣기
		int[] answer;

		//numbers 더한 값 넣기
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int item = numbers[i]+ numbers[j];
        		if(!temp.contains(item))
        			temp.add(item);
        	}
        }
        
        answer = new int[temp.size()];
        
        int index=0;
        for(int value : temp) {
        	answer[index++] = value;
        }
        
        Arrays.sort(answer);
        return answer;
    }
	
	// 3. 두 개 뽑아서 더하기
	// set 사용하기, iterator 사용하기
	public int[] solution2(int[] numbers) {
		Set<Integer> temp = new HashSet<Integer>(); //set이라서 중복값 제거 필요없음
		int[] answer;

		// numbers 더한 값 넣기
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				temp.add(numbers[i]+numbers[j]);					
			}
		}

		answer = new int[temp.size()];
		
		Iterator<Integer> iterSet = temp.iterator();
		int index = 0;
		while(iterSet.hasNext()) {
			answer[index++] = iterSet.next();
		}

		Arrays.sort(answer);
		return answer;
	}
	
	
	public static void main(String[] args) {
		F_수박수 f = new F_수박수();
		System.out.println(f.solution(4));
		System.out.println(f.solution1(3));
		
		int[] arr = new int[]{2,1,3,4,1};
		System.out.println(Arrays.toString(f.solution2(arr)));
		
		//string, 메모리구조
		String[] a = null;
		System.out.println(a);    // null  ->stack영역 공간 할당
		
		a = new String[] {"안녕"}; // Heap 영역에 공간 할당,
        						  // 변수 a에 참조값 할당
		System.out.println(a);    // [Ljava.lang.String;@15db9742  ->heap영역의 참조값
		
		
		//2. String new연산자 -> 주소값 비교(==)
		//		            -> heap 영역
		String b1 = new String("hi");
		String b2 = new String("hi");
		
		
		System.out.println(b1);
		System.out.println(b2);
		
		if(b1 == b2){
			System.out.println("같은 주소값 입니다.");
		}else{
			System.out.println("다른 주소값 입니다.");
		}

		// 3. String 리터럴 생성-> 주소값 비교(==)
		//					 -> String Constant Pool
		String c1 = "hi";
		String c2 = "hi";
		String c3 = "hi!!!";

		System.out.println(c1);
		System.out.println(c2);

		if (c1 == c2) {
			System.out.println("같은 주소값 입니다.");
		} else {
			System.out.println("다른 주소값 입니다.");
		}
		
		if (c1 == c3) {
			System.out.println("같은 주소값 입니다.");
		} else {
			System.out.println("다른 주소값 입니다.");
		}
		
		//2번. 가운데 글자 가져오기
		System.out.println(f.solution("abcde"));
		
	}

}
