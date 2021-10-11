package level1.solution;

public class D_2016 {

	//2016년 (10/11)
	public String solution(int a, int b) {

        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};

        int sum = b;
        
        for(int i=0; i<a-1; i++) {
        	sum += months[i];
        }
        return days[sum % 7];
    }
	
	public static void main(String[] args) {
		D_2016 d = new D_2016();
		System.out.println(d.solution(1,7));

	}

}
