//Mike and Palindrome
import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner ip = new Scanner(System.in);
      String s=ip.next();
      int cnt=0;
      int h=s.length()-1;
      int l=0;
      while(l<h){
          
          if(s.charAt(l)!=s.charAt(h))
          cnt++;
          l++;
          h--;
      }
      if(cnt==1||(cnt==0&&s.length()%2==1))
      System.out.println("YES");
      else
      System.out.println("NO");
    }
}


//basic two pointer approach
