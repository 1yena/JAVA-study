package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
		// 제네릭 타입 클래스는 객체를 만들 때 타입을 지정한다.
		Wrapper<Cat> wrapper = new Wrapper<>();	// 포장 클래스의 객체를 만듦
		Wrapper<Creature> wrapper2 = new Wrapper<>();	// 포장 클래스의 객체를 만듦
		
		Cat cat = new Cat("마틸다");			// 고양이 마틸다 객체를 생성
		Creature creature = new Creature("생물");
		
		wrapper.set(cat);					// 포장 객체의 set 메소드에 마틸다 입력
		wrapper2.set(creature);
		
//		Cat ob = wrapper.get();
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
//		System.out.println(ob);
		System.out.println(r1);
		System.out.println(r2);
		
//		ob.feed();	Object 클래스의 메소드만 사용 가능.
		r1.feed();
		r2.feed();
		
	}

}
