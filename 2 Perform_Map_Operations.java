/*

Dont try to run this without changing the file name to Main.java

*/
import java.util.*;

class Main {
    static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
       int t=ip.nextInt();
       while(t-->0){
           Solution sol=new Solution();
           sol.solve();
           System.out.println();
       }
    }
}

class Solution{
    public static void solve(){
        int n=Main.ip.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        while(n-->0){
            int op=Main.ip.nextInt();
            if(op==0){
                int a=Main.ip.nextInt();
                int b=Main.ip.nextInt();
                map.put(a,b);
            }
            else if(op==1)
            {
                int a=Main.ip.nextInt();
                System.out.print(map.containsKey(a)+" ");
            }
            else if(op==2){
                int a=Main.ip.nextInt();
                System.out.print(map.get(a)+" ");
            }
            else if(op==3)
            System.out.print(map.size()+" ");
            else if(op==4)
            {
                int a=Main.ip.nextInt();
                map.remove(a);
            }
        }
    }
}
