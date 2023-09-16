//the code is to find the intersection point of two linkes lists
// means our function has to return the first common element of 2 lists

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class BeingZero {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        if(h1==null || h2==null)    return null;
        int l1=0,l2=0;
        ListNode t=h1;
        while(t!=null){
            l1++;
            t=t.next;
        }
        t=h2;
        while(t!=null)
        {
            l2++;
            t=t.next;
        }
        int jumps=Math.abs(l1-l2);
        ListNode t2=null;
        if(l1>=l2){
        t=h1; t2=h2;}
        else
        {t=h2;t2=h1;}
        while(jumps-->0)
        t=t.next;
        
        while(t!=t2){
            t=t.next;
            t2=t2.next;
        }
        
		return t2;
    }
}


// the code follows the approach of
// stp1 : Find Lengths of Both lists
 // stp2 : Find the abs difference of two lengths
 //  stp3 : jump the difference in longest list
 //   step 4 : compare the list nodes until equal
