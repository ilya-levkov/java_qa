package ru.stqa.qa.sandbox;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

		Point p1 = new Point(5, 4);
		Point p2 = new Point(7, 2);
		// функция
		System.out.println("Расстояние между точкой A(" + p1.x + ", " + p1.y + ") и B(" + p2.x + ", " + p2.y + ") равно " + distance(p1, p2));
		// метод
		System.out.println("Расстояние между точкой A(" + p1.x + ", " + p1.y + ") и B(" + p2.x + ", " + p2.y + ") равно " + p1.distance(p2));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double distance(Point p1, Point p2) {
		return sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2));
	}

}