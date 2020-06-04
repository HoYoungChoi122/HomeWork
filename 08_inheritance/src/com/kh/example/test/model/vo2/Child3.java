package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	
	public Child3() {
		Parent p = new Parent();
		
//		p.num = 0; //접근 불가 private;
//		p.dNum = 12.123;  // 같은패키지가 아님
//		p.bool = false;  // 상속관계도 아니고 같은 패키지도 아님
		p.ch = '1';
		
	}

}
