class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
         Arrays.sort(arr);
         ArrayList<Integer> al=new ArrayList<Integer>();
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                if(l==arr[i])
                continue;
                else{
                al.add(arr[i]);
                l=arr[i]    ;
                }
            }
        }
        
        if(al.isEmpty())
        al.add(-1);
        return al;
    }
}

// Find duplicate elements Space Optimized Solution 
