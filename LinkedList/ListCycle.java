
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SLLNode{
	int data;
	SLLNode next;
	boolean b;
	SLLNode(int d){
		data = d;
		next = null;
		b=false;
	}
};

class BeingZero{
	public SLLNode cycleStartNode(SLLNode A) {
// 	    int ans=0;
// 	    boolean f=true;
// 	    SLLNode temp=A,an=null;
// 		while(temp!=null){
// 		    if(!temp.b)
// 		    temp.b=true;
		    
// 		    if(temp.next.b){
// 		    an=temp;
// 		    break;
		        
// 		    }
		    
// 		    else
// 		    ans++;
// 		}
		
// 		if(ans==0)
// 		return null;
// 		else
// 		return an;

if(A==null||A.next==null)
return null;

SLLNode slow=A,fast=A;
while(fast!=null&&fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
        slow=A;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }

    
}
return null;

	}
}

// normal Floyds Tortoise Approach
