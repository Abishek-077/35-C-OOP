// TASK TO DO

// 1.
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// // Declare and initialize variables
// int age, diff;

// // Take user input
// Scanner scan = new Scanner(System.in);
// System.out.print("Please enter your age: ");
// age = scan.nextInt();

// // Check voting eligibility
// if (age >= 18) {
// System.out.println("You are eligible to vote.");
// } else {
// diff = 18 - age;
// System.out.println("You are not eligible to vote. You can vote after " + diff
// + " years.");
// }
// }
// }

// 2.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the principal amount: ");
// float principal = scanner.nextFloat();

// System.out.print("Enter the rate of interest (in percentage): ");
// float rate = scanner.nextFloat();

// System.out.print("Enter the time (in years): ");
// float time = scanner.nextFloat();

// float simpleInterest = (principal * rate * time) / 100;

// System.out.println("Simple interest = " + simpleInterest);

// scanner.close();
// }
// }

// 3.

// import java.util.Scanner;

// class Main {
// public static void main(String args[]) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter the length of the cuboid:");
// double length = scanner.nextDouble();
// System.out.println("Enter the breadth of the cuboid:");
// double breadth = scanner.nextDouble();
// System.out.println("Enter the height of the cuboid:");
// double height = scanner.nextDouble();

// // Calculate volume
// double volume = length * breadth * height;

// System.out.println("Volume of the cuboid is: " + volume);
// }
// }

// 4.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter your name: ");
// String name = scanner.nextLine();
// System.out.print("Enter your roll number: ");
// int rollNumber = scanner.nextInt();
// scanner.nextLine(); // Consume newline
// System.out.print("Enter your field of interest: ");
// String fieldOfInterest = scanner.nextLine();

// System.out.println("Hey, my name is " + name + " and my roll number is " +
// rollNumber + ".");
// System.out.println("My field of interest is " + fieldOfInterest + ".");
// }
// }

// 5.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the side length of the square: ");
// double side = scanner.nextDouble();

// double area = side * side;
// double perimeter = 4 * side;

// System.out.println("Area of the square: " + area);
// System.out.println("Perimeter of the square: " + perimeter);
// }
// }

// 6.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the length of the rectangle: ");
// double length = scanner.nextDouble();
// System.out.print("Enter the breadth of the rectangle: ");
// double breadth = scanner.nextDouble();

// double area = length * breadth;
// int areaAsInt = (int) area; // Type-cast to int

// System.out.println("Area of the rectangle (as int): " + areaAsInt);
// }
// }

// 8.
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the length of the cuboid: ");
// double length = scanner.nextDouble();
// System.out.print("Enter the breadth of the cuboid: ");
// double breadth = scanner.nextDouble();
// System.out.print("Enter the height of the cuboid: ");
// double height = scanner.nextDouble();

// double volume = length * breadth * height;

// System.out.println("Volume of the cuboid: " + volume);
// }
// }

// 9.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the length of the rectangle: ");
// double length = scanner.nextDouble();
// System.out.print("Enter the breadth of the rectangle: ");
// double breadth = scanner.nextDouble();

// double area = length * breadth;
// int areaAsInt = (int) area; // Type-cast to int

// System.out.println("Area of the rectangle (as int): " + areaAsInt);
// }
// }

// 10.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int totalSubjects = 4;
// int totalMarks = 0;

// // Input marks for each subject
// for (int i = 1; i <= totalSubjects; i++) {
// System.out.print("Enter marks for subject " + i + ": ");
// int marks = scanner.nextInt();
// totalMarks += marks;
// }

// // Calculate percentage
// float percentage = (totalMarks / (float) (totalSubjects * 100)) * 100;

// // Determine the result based on percentage
// String result;
// if (percentage >= 70) {
// result = "First Class";
// } else if (percentage > 59) {
// result = "Upper Second Class";
// } else if (percentage > 49) {
// result = "Second Class";
// } else if (percentage > 39) {
// result = "Third Class";
// } else {
// result = "Fail";
// }

// System.out.println("Total Marks: " + totalMarks);
// System.out.println("Percentage: " + percentage + "%");
// System.out.println("Result: " + result);
// }
// }
