//change file name if u want to download and run
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t=ip.nextInt();
        while(t-->0){
            int n=ip.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                int nl=ip.nextInt();
                set.add(Math.abs(nl));
            }
            System.out.println(set.size());
            
        }
    }
}
