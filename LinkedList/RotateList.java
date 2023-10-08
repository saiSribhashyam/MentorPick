
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
	public SLLNode rotateRight(SLLNode h, int k) {
		if(h==null)return h;
		if(h.next==null||k==0)return h;
		SLLNode c=h;
		int len=1;
		while(c.next!=null)
		{
		    c=c.next;
		    len++;
		}
		
		c.next=h;
		k=k%len;
		k=len-k;
		while(k-->0){
		    c=c.next;
		}
		
		h=c.next;
		c.next=null;
		
		return h;
	    
	
	}
}
