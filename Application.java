
/**
 * 
 * @author shand
 *
 */
public class Application 
{

	public static void main(String[] args) 
	{
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		
		Node bNode=new Node();
		bNode.setData("Hi");
		myList.addNode(bNode);
		bNode = new Node();
		bNode.setData(0);
		myList.addNode(bNode);
		
		Node tempnode2=myList.getList();
		do 
		{
			System.out.println(tempnode2.data);
			tempnode2=tempnode2.nextNode;
		} while (tempnode2!=null);
	
}
	
}
