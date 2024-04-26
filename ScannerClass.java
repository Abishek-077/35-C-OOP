// Task To Do
// 1. Write a JAVA program to find the maximum between three numbers.

// import java.util.Scanner;

// class ScannerClass{
// public static void main(String[] args) {
// Scanner myObj = new Scanner(System.in); // Create a Scanner object

// System.out.println("Enter name, age, and salary:");

// String name = myObj.nextLine(); // Read name as a String
// int age = myObj.nextInt(); // Read age as an integer
// double salary = myObj.nextDouble(); // Read salary as a double

// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// System.out.println("Salary: " + salary);
// }
// }

// 2. Write a JAVA program to check whether a number is negative, positive, or
// zero.

// import java.util.Scanner;

// class CheckPositiveOrNegative {
// public static void main(String[] args) {
// int num = 912;

// if (num > 0) {
// System.out.println("The number is positive.");
// } else if (num < 0) {
// System.out.println("The number is negative.");
// } else {
// System.out.println("The number is zero.");
// }
// }
// }

// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or
// not.

// import java.util.Scanner;

// class DivisibleBy5And11 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Please enter a number: ");
// int number = sc.nextInt();

// if ((number % 5 == 0) && (number % 11 == 0)) {
// System.out.println("\nGiven number " + number + " is divisible by 5 and
// 11.");
// } else {
// System.out.println("\nGiven number " + number + " is not divisible by 5 and
// 11.");
// }
// }
// }

// 4. Write a JAVA program to check whether a number is even or odd.

// import java.util.Scanner;

// class CheckEvenOrOddTernary {
// public static void main(String[] args) {
// Scanner reader = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int num = reader.nextInt();

// String evenOdd = (num % 2 == 0) ? "even" : "odd";
// System.out.println(num + " is " + evenOdd);
// }
// }

// 5. Write a JAVA program to check whether a year is a leap year or not.

// Hint: if year%4==0; if year%100!==0 ; year%400==0;

// public class ScannerClass {
// public static void main(String[] args) {
// int year = 2024; // Change this to the desired year

// boolean leap = false;

// if (year % 4 == 0) {
// if (year % 100 == 0) {
// if (year % 400 == 0)
// leap = true;
// } else {
// leap = true;
// }
// }

// if (leap)
// System.out.println(year + " is a leap year.");
// else
// System.out.println(year + " is not a leap year.");
// }
// }

// 6. Write a JAVA program to input any alphabet and check whether it is vowel
// or consonant.

// public class ScannerClass {
// public static void main(String[] args) {
// char ch = 'z'; // Change this to the desired alphabet

// switch (ch) {
// case 'a':
// case 'e':
// case 'i':
// case 'o':
// case 'u':
// System.out.println(ch + " is a vowel.");
// break;
// default:
// System.out.println(ch + " is a consonant.");
// }
// }
// }

// SWITCH CASE

// 1. Write a Java program that takes a student's grade as input (A, B, C, D, or
// F) and converts it to the corresponding GPA value. Use a switch case
// statement to handle different grades.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter a grade (A, B, C, D, or F):");
// String grade = scanner.nextLine();
// double gpa = 0.0;

// switch (grade) {
// case "A":
// gpa = 4.0;
// break;
// case "B":
// gpa = 3.0;
// break;
// case "C":
// gpa = 2.0;
// break;
// case "D":
// gpa = 1.0;
// break;
// case "F":
// gpa = 0.0;
// break;
// default:
// System.out.println("Invalid grade entered.");
// System.exit(0);
// }

// System.out.println("The GPA for grade " + grade + " is " + gpa);
// }
// }

// 2. Create a Java program that takes two numbers and an operator (+, -, *, /)
// as inputs and performs the corresponding arithmetic operation using a switch
// case statement.
// import java.util.Scanner;

// public class ScannerClass {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter the first number:");
// double num1 = scanner.nextDouble();
// System.out.println("Enter the second number:");
// double num2 = scanner.nextDouble();
// System.out.println("Enter an operator (+, -, *, /):");
// char operator = scanner.next().charAt(0);
// double result;

// switch (operator) {
// case '+':
// result = num1 + num2;
// break;
// case '-':
// result = num1 - num2;
// break;
// case '*':
// result = num1 * num2;
// break;
// case '/':
// if (num2 != 0) {
// result = num1 / num2;
// } else {
// System.out.println("Error! Dividing by zero is not allowed.");
// return;
// }
// break;
// default:
// System.out.println("Error! Invalid operator. Please enter correct
// operator.");
// return;
// }

// System.out.printf("The result is: %.2f", result);
// }
// }

// 3. Write a Java program that takes an integer input (1 to 12) representing a
// month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring,
// 7-9: Summer, 10-12: Fall) using a switch case.

// import java.util.Scanner;

// public class ScannerClass {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter a number (1 to 12) representing a month:");
// int month = scanner.nextInt();
// String season;

// switch (month) {
// case 1: case 2: case 3:
// season = "Winter";
// break;
// case 4: case 5: case 6:
// season = "Spring";
// break;
// case 7: case 8: case 9:
// season = "Summer";
// break;
// case 10: case 11: case 12:
// season = "Fall";
// break;
// default:
// System.out.println("Invalid month. Please enter a number between 1 and 12.");
// return;
// }

// System.out.println("The season is: " + season);
// }
// }

// 4. Implement a Java program that calculates the area of different shapes
// (circle, rectangle, square, triangle) based on the user's choice using a
// switch case.

// import java.util.Scanner;

// public class ScannerClass{
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Choose a shape (1: Circle, 2: Rectangle, 3: Square, 4:
// Triangle):");
// int shape = scanner.nextInt();
// double area;

// switch (shape) {
// case 1:
// System.out.println("Enter the radius of the circle:");
// double radius = scanner.nextDouble();
// area = Math.PI * Math.pow(radius, 2);
// break;
// case 2:
// System.out.println("Enter the length and width of the rectangle:");
// double length = scanner.nextDouble();
// double width = scanner.nextDouble();
// area = length * width;
// break;
// case 3:
// System.out.println("Enter the side of the square:");
// double side = scanner.nextDouble();
// area = Math.pow(side, 2);
// break;
// case 4:
// System.out.println("Enter the base and height of the triangle:");
// double base = scanner.nextDouble();
// double height = scanner.nextDouble();
// area = 0.5 * base * height;
// break;
// default:
// System.out.println("Invalid choice. Please enter a number between 1 and 4.");
// return;
// }

// System.out.printf("The area is: %.2f", area);
// }
// }
