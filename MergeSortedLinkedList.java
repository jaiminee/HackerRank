import java.util.ArrayList;
import java.util.TreeMap;

public class MergeSortedLinkedList {

		public static void main(String[] args) {
			
			ArrayList<ListNode> listOfResult = new ArrayList<ListNode>();
			MergeSortedLinkedList ob = new MergeSortedLinkedList();

			ListNode l1 = new ListNode(4);
			l1.next = new ListNode(7);
			l1.next.next = new ListNode(8);
			ListNode l2 = new ListNode(2);
			l2.next = new ListNode(5);
			l2.next.next = new ListNode(6);
			l2.next.next.next = new ListNode(9);
			
			ListNode ln = ob.mergeTwoLists(l1,l2);
			while(ln!=null) {
				System.out.println(ln.value);
				ln = ln.next;
			}
		}
		public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1 == null) {
	        	
	        	return l2;
	        }
	        else if(l2 == null) {
	        	
	        	return l1;
	        }
	        else if(l1.value < l2.value) {
	        
	        	ListNode temp = l1.next;
	        	l1.next = mergeTwoLists(temp,l2);
	        	
	        	return l1;
	        }
	        else if(l2.value < l1.value) {
	        	
	        	ListNode temp2 = l2.next;
	        	l2.next = mergeTwoLists(l1,temp2);
	        	
	        	return l2;
	        }
	        else {
	        	return null;
	        }
	    }
}
class ListNode{
	int value;
	ListNode next;
	ListNode(int value){
		this.value = value;
	}
}