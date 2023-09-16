class Solution{
  ListNode reverseList(ListNode head){
    Listnode pre=null,cur=h,n=null;
    while(cur!=null){
      n=cur.next;
      cur.next=pre;
      pre=c;
      cur=n;
    }
    return pre;
  }
}

//note this is only module which change the whole linkedList
// there are another ways to do so like using Collections like arrayList, treelist etc
// but most optimal is this method 
// where time complexity = O(n) and Space = O(1)
