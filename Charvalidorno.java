package charvalidorno;
import java.util.Scanner;
public class Charvalidorno {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);        
System.out.println("Enter your character");
char c=n.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
System.out.println("your character is valid");
else
System.out.println("your character is invalid");



    }
    
}

