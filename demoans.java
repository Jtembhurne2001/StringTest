/*** /*Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil"
	***/
package Com.Java;
import java.util.Scanner;
import java.util.Iterator;
// importing Scanner Class For input 


public class demoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Userinput ;
		String ans=" " ;
		
		//tacking input
		System.out.println("Enter The String :");
		Userinput =sc.next();
		//For loop
		for ( int i= 0; i< Userinput.length(); i++) {
			
		//checking if char is uppercase then shift it by 2
		//if char is A or B it should be Y and Z respectivelt
			
		if(Character.isUpperCase(Userinput.charAt(i))) {
			if(Userinput.charAt(i)== 'A') {
				ans = ans+"Y";
			}else if(Userinput.charAt(i)=='B') {
				ans+="Z";
			}else {
				ans +=(char)(Userinput.charAt(i)-2);
			}
			
		}
		//checking if char is lowercase then shift it bay 3
		// if char is a or b or c it should be x,y abd z respectively
		
		if(Userinput.charAt(i)>='a' && Userinput.charAt(i)<='z'){
			ans+= (char)('a'+(Userinput.charAt(i)-'a'+23)%26);
		}
	}		
		System.out.println("Answer:"+ans);
		sc.close();
}	
}
