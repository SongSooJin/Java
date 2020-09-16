package p20_0808; //다수의 클래스를 하나로 묶는 큰 박스 , 물리적으로 폴더이며 자바는 패키지라고 부른다.
//폴더 = package 파일명이 같아도 폴더로 파일의 유일성을 구분하는 것처럼
//패키지의 존재 목적은 해당 클래스 파일의 이름이 같아도 패키지로 유일성을 확보하기 위함이다.
 class Car {
	 String name = "소나타"; //멤버변수: 클래스 박스가 직접 갖고 있는 변수 
	String color = "black";
	
	
	
	void run() {
		String weather = "맑음"; //지역변수 : 메소드 박스가 갖고 있는 변수
		System.out.println("차가 움직인다.");
		
	}
	
	void openDoor(Client client) {
		System.out.println("문이 열리고 손님이 탄다. 손님의 이름 = " + client.name);
		
	}

}
