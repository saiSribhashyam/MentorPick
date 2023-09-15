//	978B - File Name

import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner ip = new Scanner(System.in);
      int n=ip.nextInt();
      String s=ip.next();
      int cnt=0;
      for(int i=0;i<n-2;i++){
          if(s.charAt(i)=='x'&&s.charAt(i+1)=='x'&&s.charAt(i+2)=='x')
          cnt++;
      }
      
      System.out.println(cnt);
    }
}

//Use Normal linear loop approach 
//if there are 3 consecutive 'x' then increase the count 
//print the count
