package vowelorconstant;
import java.util.Scanner;
public class Vowelorconstant {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);        
System.out.println("Enter your character");
char c=n.next().charAt(0);
if((c=='a'||c=='i'||c=='o'||c=='e'||c=='u')||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
System.out.println("your character is vowel");
else
System.out.println("your character is constant");



    }
    
}

