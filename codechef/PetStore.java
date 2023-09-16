/* package codechef; // don't place package name! */
//https://www.codechef.com/problems/PETSTORE
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
		for(;t-->0;){
		    int n=ip.nextInt();
		    
		    Map<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        int x=ip.nextInt();
		        map.put(x,map.getOrDefault(x,0)+1);
		    }
		    if(n%2!=0)
		    System.out.println("NO");
		    else{
		        boolean b=true;
		        for(Map.Entry<Integer,Integer> ent:map.entrySet())
		        {
		            if(ent.getValue()%2!=0)
		            {
		                b=false;
		                break;
		            }
		        }
		        if(b)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    
		  
		}
	}
}


// Normal map approach which finds the frequency of type if length or map contains any odd values returns NO else Prints YES
