package com.kh.git;

import com.kh.git.animal.Cat;
import com.kh.git.animal.Dog;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("HelloGit");
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		if(true) {
			System.out.println("김태연입니댱");
		}
//		Dog 기능 추가
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.miao();
		
	}	
}
