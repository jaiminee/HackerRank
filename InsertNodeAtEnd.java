
public class InsertNodeAtEnd {
	public static void main(String[] args) {
		InsertNodeAtEnd ob = new InsertNodeAtEnd();
		ListNodeInsert l1 = new ListNodeInsert(4);
		//l1.head = l1;
		//System.out.println(l1.head.value);
		l1.next = new ListNodeInsert(7);
		l1.next.next = new ListNodeInsert(8);
		ListNodeInsert ln = ob.insertAtEnd(l1,5);
		ListNodeInsert lnF = ob.insertAtFront(l1,2);
		while(lnF!=null) {
			System.out.println(lnF.value);
			lnF = lnF.next;
		}
	}
	public ListNodeInsert insertAtEnd(ListNodeInsert l, int data) {
		if(l== null) {
			l = new ListNodeInsert(data);
			return l;
		}
		else {
			ListNodeInsert temp = l;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new ListNodeInsert(data);
			//temp.value = data;
			return temp;
		}
	}
	public ListNodeInsert insertAtFront(ListNodeInsert l, int data) {
		if(l== null) {
			l = new ListNodeInsert(data);
			return l;
		}
		else {
			ListNodeInsert newHead = new ListNodeInsert(data);
			newHead.next = l;
			//System.out.println(l.head.value);
			l= newHead;
			return l;
		}
	}
}
class ListNodeInsert{
	int value;
	ListNodeInsert next;
	//ListNodeInsert head;
	ListNodeInsert(int value){
		this.value = value;
	}
}