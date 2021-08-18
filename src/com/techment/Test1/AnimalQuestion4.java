package com.techment.Test1;
class Animal{
	public void voice() {
		System.out.println("hello");
	}
}

class Dog extends Animal{
	public void voice() {
		System.out.println("Bhau Bhau");
	}
}

class Tiger extends Animal{
	public void voice() {
		System.out.println("Roar Roar");
	}
}

class Cat extends Animal{
	public void voice() {
		System.out.println("Meau meauu");
	}
}

public class AnimalQuestion4 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.voice();
		Animal horse = new Tiger();
		horse.voice();
		Animal cat = new Cat();
		cat.voice();
	}

}
