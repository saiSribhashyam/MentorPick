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
    public ListNode removeElements(ListNode head, int val) {
        // complete the code
        ListNode newl=new ListNode(0);
        newl.next=head;
        
        ListNode prev=newl,curr=head;
        
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else
            prev=curr;
            
            curr=curr.next;
        }
        
        return newl.next;
        
        
        
    }
}


// Normal dummy at beginning approach
