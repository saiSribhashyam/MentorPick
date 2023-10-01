class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int arr[][], int n, int m)
    {
        ArrayList<Integer> al= new ArrayList<>();
        
        // Top boundary
        for(int j=0; j<m; j++){
            al.add(arr[0][j]);
        }
        
        // Right boundary
        for(int i=1; i<n; i++){
            al.add(arr[i][m-1]);
        }
        
        // Bottom boundary
        if(n > 1){
            for(int j=m-2; j>=0; j--){
                al.add(arr[n-1][j]);
            }
        }
        
        // Left boundary
        if(m > 1){
            for(int i=n-2; i>0; i--){
                al.add(arr[i][0]);
            }
        }
        
        return al;
    }
}
