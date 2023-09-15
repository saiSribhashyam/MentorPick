/* package codechef; // don't place package name! */

//https://www.codechef.com/problems/SRTARR

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ip = new Scanner(System.in);
		int t=ip.nextInt();
		while(t-->0){
		 int n=ip.nextInt();
		 String s=ip.next();
	
		     int c=0;
		     for(int i=0;i<n-1;i++){
		         if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
		         c++;
		     }
		     System.out.println(c);
		 
		 
		}
	}
}


//normal approach that checks for no of "10" substrings in given string
