//A. Erasing Zeroes

import java.util.*;
public class Main{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
           int first=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    first=i;
                    break;
                }
            }
            int last=-1;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    last=i;
                    break;
                }
            }
            int tot=0;
            for(int i=first;i<=last;i++){
                if(s.charAt(i)=='0')
                tot++;
            }
            System.out.println(tot);
        }
              
          }
      }
    

// Use 2 pointer approach find first 1 occurring index and another from ending to 1st occrance of  "1" record no 
// loop through pos1 and pos2 count zeros
