package com.java.Calculators; // Package Name

import java.util.ArrayList; // import ArrayList for store inputs
import java.util.Scanner; // import scanner for input

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Number to select Calculator: ");
			System.out.println("1.Basic Calculator");
			System.out.println("2.Scientific Calculator");
			System.out.println("3.Trignomentric Calculator");
			int n1 = sc.nextInt();

			if (n1 == 1) {
				BasicCalculator bc = new BasicCalculator();
				System.out.println("Enter Number to select operation: ");
				System.out.println("1.Addition");
				System.out.println("2.Subraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				int n2 = sc.nextInt();
				if (n2 == 1) {
					ArrayList<Double> Addlist = new ArrayList<>();
					System.out.println("Enter Numbers to Add and in the last Give comand add after entering number");
					while (true) {
						if (sc.hasNextDouble()) {
							Addlist.add(sc.nextDouble());
						} else if (sc.next().equalsIgnoreCase("add")) {
							double sum = Addlist.stream().mapToDouble(Double::doubleValue).sum();
							System.out.println("Sum is: " + sum);
							break;
						} else {
							System.out.println("Invalid input, please enter a number or 'add' command.");
						}
					}

				} else if (n2 == 2) {
					ArrayList<Double> sublist = new ArrayList<>();
					System.out
							.println("Enter Numbers to Subtract and in the last Give comand sub after entering number");
					while (true) {
						if (sc.hasNextDouble()) {
							sublist.add(sc.nextDouble());
						} else if (sc.next().equalsIgnoreCase("sub")) {
							double sub = sublist.stream().reduce(sublist.get(0), (a, b) -> a - b);
							System.out.println("Subtraction is: " + sub);
							break;
						} else {
							System.out.println("Invalid input, please enter a number or 'sub' command.");
						}
					}

				} else if (n2 == 3) {
					ArrayList<Double> mulList = new ArrayList<>();
					System.out
							.println("Enter Numbers to Multiply and in the last Give comand mul after entering number");
					while (true) {
						if (sc.hasNextDouble()) {
							mulList.add(sc.nextDouble());
						} else if (sc.next().equalsIgnoreCase("mul")) {
							double mul = mulList.stream().reduce(1.0, (a, b) -> a * b);
							System.out.println("Multiplication is: " + mul);
							break;
						} else {
							System.out.println("Invalid input, please enter a number or 'mul' command.");
						}
					}
				} else if (n2 == 4) {
					ArrayList<Double> divList = new ArrayList<>();
					System.out.println("Enter Numbers to Divide and in the last Give comand div after entering number");
					while (true) {
						if (sc.hasNextDouble()) {
							divList.add(sc.nextDouble());
						} else if (sc.next().equalsIgnoreCase("div")) {
							double div = divList.stream().reduce(divList.get(0), (a, b) -> a / b);
							System.out.println("Division is: " + div);
							break;
						} else {
							System.out.println("Invalid input, please enter a number or 'div' command.");
						}
					}

				}
			}

			if (n1 == 2) {
				ScientificCalculator SC = new ScientificCalculator();
				System.out.println("Enter Number to select operation: ");
				System.out.println("1.To find Exponential Value");
				System.out.println("2.To find Log Value");
				int n2 = sc.nextInt();
				if (n2 == 1) {
					double x = sc.nextDouble();
					System.out.println(SC.exp(x));
				} else if (n2 == 2) {
					double x = sc.nextDouble();
					System.out.println(SC.log(x));
				}
			}

			if (n1 == 3) {
				TrignomentricCalculator tc = new TrignomentricCalculator();
				System.out.println("Enter Number to select operation: ");
				System.out.println("1.sine");
				System.out.println("2.cosine");
				System.out.println("3.tangent");
				System.out.println("4.arcsine");
				System.out.println("5.arccosine");
				System.out.println("6.arctangent");
				int n2 = sc.nextInt();
				if (n2 == 1) {
					double x = sc.nextDouble();
					System.out.println(tc.sine(x));
				} else if (n2 == 2) {
					double x = sc.nextDouble();
					System.out.println(tc.cosine(x));
				} else if (n2 == 3) {
					double x = sc.nextDouble();
					System.out.println(tc.tangent(x));
				} else if (n2 == 4) {
					double x = sc.nextDouble();
					System.out.println(tc.arcsine(x));
				} else if (n2 == 5) {
					double x = sc.nextDouble();
					System.out.println(tc.arccosine(x));
				} else if (n2 == 6) {
					double x = sc.nextDouble();
					System.out.println(tc.arctangent(x));
				}
			}
			if (n1 > 3 || n1 < 1)
				System.out.println("Enter Valid Input 1, 2, 3 :) ");
			System.out.println();
		}

	}
}
