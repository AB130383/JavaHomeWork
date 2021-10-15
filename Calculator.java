import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		
		int operand1;
		int operand2;
		int result;
		char operator;
		
		
		System.out.println("Enter two numbers: ");
		Scanner input=new Scanner(System.in);
		operand1=input.nextInt();
		operand2=input.nextInt();
		
		System.out.println("Enter an operator: +,-,* or /: ");
		
		operator=input.next().charAt(0);
		
		switch(operator){
			case '+':
				result=operand1+operand2;
				System.out.println(result);
				break;
			
			case '-':
				result=operand1-operand2;
				System.out.println(operand1+" - "+operand2+" = "+ result);
				break;
				
			case '*':
				result=operand1*operand2;
				System.out.println(operand1+" * "+operand2+" = "+ result);
				break;
				
			case '/':
				if(operand1==0 || operand2==0){
					System.out.println("You can't divide by or with zero");
				}
				result=operand1/operand2;
				System.out.println(operand1+" / "+operand2+" = "+ result);
				break;
				
			default:
				System.out.println("You entered an invalid operator");
				break;
			
			
			
			
		}
	}
}