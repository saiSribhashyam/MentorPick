import java. util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int testcases=s.nextInt();
        while(testcases-- !=0)
        {
            
            int size=s.nextInt();
            int [] arr =new int[size], ans=new int[size];
            Arrays.fill(ans,-1);
            for(int i=0;i<size;i++)
                arr[i]=s.nextInt();
            Stack<Integer> stk=new Stack<>();
            for(int i=0;i<size;i++)
            {
                int curr=arr[i];
                while(!stk.empty() && arr[stk.peek()]<curr)
                {
                    ans[stk.peek()]=curr;
                    stk.pop();
                }
                stk.push(i);
            }
            for(int i=0;i<size;i++)
            System.out.print(ans[i]+" ");
            
        System.out.println();
        }
    }
}
