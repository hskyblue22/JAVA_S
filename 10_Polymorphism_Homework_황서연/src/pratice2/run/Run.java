package pratice2.run;

import pratice2.model.vo.GalaxyNote9;
import pratice2.model.vo.SmartPhone;
import pratice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for(int i=0; i<phone.length; i++) {
			phone[i].printMarker();
			phone[i].makeacall();
			phone[i].takeacall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
		
		
		
	}

}
