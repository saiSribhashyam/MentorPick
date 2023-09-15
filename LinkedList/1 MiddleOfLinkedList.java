//Middle of the Linked List (Difficulty - easy)

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) 
	{
		this.val = val; 
		next = null;
	}
}

class BeingZero {
    public ListNode middleNode(ListNode h) {
        // complete the function
        ListNode s=h,f=h;
        
        if(h==null)
        return null;
        while(f!=null&&f.next!=null){  //for returning the second mid value
            s=s.next;
            f=f.next.next;
        }
        
        return s;
    }
}
