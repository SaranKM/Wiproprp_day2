package If2;
import java.util.Scanner;
public class Sixteen {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n!=0){
			int rem=n%10;n=n/10;
			sum=sum*10+rem;
			}
		System.out.println(sum);
		}
	}
