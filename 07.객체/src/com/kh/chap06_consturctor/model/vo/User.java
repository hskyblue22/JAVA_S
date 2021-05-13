package com.kh.chap06_consturctor.model.vo;

public class User {
	/*
	 * * 생성자 : 다른 패키지나 사용하고자하는 클래스에서 현재클래스를 통한 객체를 생성할때 사용하는 메소드
	 * 
	 * [접근제한자] 클래스명([매개변수, 매개변수, ...]) {... }
	 * 접근제한자 :public (다른클래스에서 생성하려는 목적이므로)
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 반드시 클래스명과 동일해야된다. (대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다. (메소드와 유사해서 헷갈릴수있음)
	 * 3. 매개변수 생성자를 명시적으로 작성하게되면 기본생성자를 JVM이 자동으로 만들어주지 않는다. 
	 *    즉, 기본생성자는 항상 기본으로 작성하는 습관을 길러라
	 * 
	 */
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	//기본생성자 --> public 클래스명() {...}, 매개변수가 없는 생성자
	public User() {
		//단지 객체생성을 목적 할 때 사용
		//기본생성자를 생략하는 경우는 오류가 아니다 --> JVM이 자동으로 만들어줬기 때문에 항상 객체 생성이 가능했던 것
		//매개변수가 있는 생성자가 있는 경우에는 기본생성자라해도 생략이 불가능하다.
	}
	
	//매개변수가 있는 생성자(사용자가 만든) 
	//객체의 생성과 동시에 전달된 값들을 매개변수로 받아서 해당필드에 초기화하는 목적
	//--> public 클래스명(매개변수) {
	//         this.필드 변수명 = 매개변수명;
	//}
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//나머지 필드부분은 JVM이 넣어준 초기값으로 들어가있다.
	}

	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		
		this(userId, userPwd, userName);
		//위와같이 중복되는 동일한 초기화하는 내용의 생성자가 존재하는 경우 this생성자를 사용가능하다.
		//같은 클래스내에서는 생성자에서 다른 생성자를 호출가능, 단,이때 반드시 첫줄에 작성을 해야한다.(단 한번만 호출가능)
		this.age = age;
		this.gender = gender;
		
	}
	/* 결론 ***"시험!!"
	 * 오버로딩 : 동일한 메소드명을 사용하는것, 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 한다.(접근제한자, 반환형은 상관이 없다.)
	 * 
	 * */
	
	
	public void setUserID(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserAge(int age) {
		this.age = age;
	}
	public void setUserGender(char gender) {
		this.gender = gender;
	}
	
	public String getUserID() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserAge() {
		return age;
	}
	public char getUserGender() {
		return gender;
	}
	
	
	public String information() {
		return "아이디 : "+userId+" 비밀번호 : " +userPwd+" 이름 : " +userName+
				" 나이 : " +age +" 성별 : " +gender;
	}
	
	
	
}
