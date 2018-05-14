import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("my");
		ll.add("name");
		
		System.out.println(""+ll);
		ll.addFirst("first");
		ll.addLast("ENDD");
	
		ll.set(0, "Pre-frst");
		System.out.println(""+ll);
		/*
		Iterator<String> iterator = ll.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(""+iterator.next());
	    }
	    */
		
		
		
	}
}
