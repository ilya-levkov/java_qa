package ru.stqa.qa.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		String somebody = "world";
		System.out.println("Hello, " +  somebody + "!");

		//double l = 8.0;
		//double s = l * l;
		//System.out.println("Площадь квадрата со стороной " + l + " = " + s);
		hello("world");
		hello("user");
		hello("Ilya");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}