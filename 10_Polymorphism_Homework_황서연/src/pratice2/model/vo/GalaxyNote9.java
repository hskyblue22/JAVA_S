package pratice2.model.vo;

public class GalaxyNote9 extends SmartPhone{

	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printMarker() {
		System.out.println("갤럭시 노트9은 삼성 에서 만들어 졌다.");
		
	}

	@Override
	public void charge() {
		System.out.println("고속충전, 고속 무선 충전");
		
	}

	@Override
	public void makeacall() {
		System.out.println("전화를 누르고 통화버튼을 누름");
		
	}

	@Override
	public void takeacall() {
		System.out.println("전화 받기 버튼을 누름");
		
	}

	@Override
	public void picture() {
		System.out.println("1300만 듀얼 카메라");
		
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
		
	}

}
