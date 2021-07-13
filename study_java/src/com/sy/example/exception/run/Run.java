package com.sy.example.exception.run;

import java.io.IOException;

import com.sy.example.exception.controller.RideController;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RideController rc = new RideController();
		rc.cutGuests();
		
//		method22();
	}

	public static void method22() { //throw적어줘야 한다.
		byte[] bArr = {'I', 'O', 'E'};
		try {
			System.out.write(bArr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
