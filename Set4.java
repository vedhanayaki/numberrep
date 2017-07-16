package player;
import java.util.Scanner;
public class Set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
Scanner s=new Scanner(System.in);
int i,j,l;
String a,b[];
a=s.next();
l=a.length();
b=a.split("");
for(i=0;i<l;i++){
	for(j=i+1;j<l;j++){
		if(b[i].equals(b[j])){
			System.out.println(b[i]);
		}
	}
}
s.close();
	}

}
