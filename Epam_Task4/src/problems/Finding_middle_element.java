package problems;
import java.util.*;

class Node1
    {
        int data;
        Node1 next;
        Node1(int d)
        { 
               data = d; 
               next = null;
         }
    }
public class Finding_middle_element
{
    Node1 head;  // head of list
  
    
  public void addToTheLast(Node1 node) {
  if (head == null) {
   head = node;
  } else {
   Node1 temp = head;
   while (temp.next != null)
    temp = temp.next;
   temp.next = node;
  }
 }
	  
     /* Driver program to test above functions */
    public static void main(String args[])
    {

         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			Finding_middle_element llist = new Finding_middle_element();
			int a1=sc.nextInt();
			Node1 head= new Node1(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node1(a));
			}
          
        GFG gfgobj = new GFG(); 
		System.out.println(gfgobj.getMiddle(llist.head));
        		
			t--;
		}
	}
}


/**
 * This function returns the middle element in linked list
 * @author Mounika Reddy
 *
 */
class GFG
{
   
	/**
	 *  Function to find middle element a linked list
	 * @param head
	 * @return middle element in linked list
	 */
    int getMiddle(Node1 head)
   {
         Node1 fastPointer=head;
         Node1 slowPointer=head;
         while(fastPointer!=null && fastPointer.next!=null){
             fastPointer=fastPointer.next.next;
             slowPointer=slowPointer.next;
         }
         return slowPointer.data;
   }
}