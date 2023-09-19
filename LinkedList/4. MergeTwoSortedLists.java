
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SLLNode{
	int data;
	SLLNode next;
	SLLNode(int d){
		data = d;
		next = null;
	}
};

class BeingZero{
	public SLLNode mergeTwoSortedLists(SLLNode a, SLLNode b) {
	    if(a==null)	return b;
	    if(b==null) return a;
	    if(a==null && b==null) return null;
	    
	    if(a.data<=b.data)
	    {
	        a.next=mergeTwoSortedLists(a.next,b);
	        return a;
	    }
	    else
	    {
	        b.next=mergeTwoSortedLists(a,b.next);
	        return b;
	    }
	    
	}
}


// Recursion Based Sorting and merging of two linked lists
