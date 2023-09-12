/*Problem Link: https://mentorpick.com/code?cid=0bc10beb-5b20-4ab7-9ac2-3513a65c2eba&cslug=klu-y21-set-map&pid=b9babb95-118c-4ed5-9efd-ff135b988662&pslug=bz-perform-set-operations&courseId=64bfd28d9c4b06352656f0bd&sectionId=undefined&type=courseV2

Verdict: ACCEPTED
*/





import java.util.*;

class Main {
    static Scanner ip =new Scanner(System.in);
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
    static void solve(){
        int n=Main.ip.nextInt();
        Set<Integer> set=new HashSet<>();
        while(n-->0){
            int op=Main.ip.nextInt();
            int opr=Main.ip.nextInt();
            switch(op){
                
                case 0:set.add(opr); break;
                case 2:set.remove(opr); break;
                case 1:System.out.print(set.contains(opr)+" "); break;
            }
        }
    }
}
