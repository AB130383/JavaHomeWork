import java.util.Scanner;

public class Interval{
	public static void main(String[] args){
	
		int number;
		
		
		System.out.println("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		
		number=input.nextInt();
		
		if(number<14){
			System.out.println("Number is between 0-14");
		}else if(number <36){
			System.out.println("Number is between 15-35");
		}else if(number<51){
			System.out.println("Number is between 36-50");
		}else if(number<=100){
			System.out.println("Number is between 51-100");
		}else{
			System.out.println("Number is not between range");
		}
			
			}
		}
		
		