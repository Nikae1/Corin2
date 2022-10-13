package front;

import back.BackEnd;

public class Front {

	
	public Front() {
		
		System.out.println("ll");
		
		BackEnd backend = new BackEnd();
		
		
		
		System.out.println(backend.controller('+', 2, 3));
		System.out.println(backend.plus(2, 3));
		
		//backend는 앞에 stack에 선언한 변수를 의미한다.
		
		
	}
}
