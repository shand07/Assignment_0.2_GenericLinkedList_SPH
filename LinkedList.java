/**
 * 
 * @author shand
 *
 */
public class LinkedList {
	
	Node head;
	int length;
	Node tail;
	
	
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	/**
	 * 
	 * @return
	 */
	
	public Node getList()
	{
		return head;
	}
	/**
	 * 
	 * @param aNode
	 */
	
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	

}
