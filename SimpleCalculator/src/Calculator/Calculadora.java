package Calculator;

import java.util.Scanner;

public class Calculadora {
	
    interface Addition {
	      int add(int numberOne, int numberTwo);
 	}

	public static Addition isSum () {return (numberOne,numberTwo) -> numberOne + numberTwo;}
	
	public static Addition isSubtraction () {return (numberOne,numberTwo) -> numberOne - numberTwo;}
	
	public static Addition isDivision () {return (numberOne,numberTwo) -> numberOne / numberTwo;}
	
	public static Addition isMultiplication () {return (numberOne, numberTwo) -> numberOne * numberTwo;}
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);

			int numberOne,numberTwo,operation;
			
			System.out.print(
					new StringBuilder("-----Write One Option-----\n")
					.append("1: Sum \n")
					.append("2: Subtraction \n")
					.append("3: Division \n")
					.append("4: Multiplication \n")
					.append("Write Option View: "));
			operation = scan.nextInt();
			
			switch (operation) {
			case 1: {
				System.out.print("\nWrite One Number: ");
				numberOne = scan.nextInt();
				
				System.out.print("Write Two Number:");
				numberTwo = scan.nextInt();
				
				System.out.println("\n"+numberOne +" + "+ numberTwo+"\nSum: " + isSum().add(numberOne, numberTwo));
				break;
			}
			case 2: {
				System.out.print("\nWrite One Number: ");
				numberOne = scan.nextInt();
				
				System.out.print("Write Two Number:");
				numberTwo = scan.nextInt();
				
				System.out.println("\n"+numberOne +" - "+ numberTwo+"\nSubtraction: " + isSubtraction().add(numberOne, numberTwo));
				break;
			}
			case 3: {
				System.out.print("\nWrite One Number: ");
				numberOne = scan.nextInt();
				
				System.out.print("Write Two Number:");
				numberTwo = scan.nextInt();
				
				System.out.println("\n"+numberOne +" / "+ numberTwo+"\nDivision: " + isDivision().add(numberOne, numberTwo));
				break;
			}
			case 4: {
				System.out.print("\nWrite One Number: ");
				numberOne = scan.nextInt();
				
				System.out.print("Write Two Number:");
				numberTwo = scan.nextInt();
			
				System.out.println("\n"+numberOne +" * "+ numberTwo+"\n Multiplication:" + isMultiplication().add(numberOne, numberTwo));
				break;
			}
			default:
				System.out.println("Unexpected value: Sum, Subtraction, Division, Multiplication");
		}
		}catch (Exception e) {
			System.out.println("Please enter an integer!");
		}
		


	}

}
