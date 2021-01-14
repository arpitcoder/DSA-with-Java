package geeksterassignments;
import java.util.Scanner;
public class GCDtwonumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2= input.nextInt();
		if(num1<num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		}

		int rem= num1%num2;
			if(num2%rem==0) {
				System.out.println("The GCD is: "+rem);
			}
			else {
				while(rem!=0) {
				num1=num2;
				num2=rem;
				rem=num1%num2;
				
			}
				System.out.println("The GCD is: "+num2);
		}

	}

}
