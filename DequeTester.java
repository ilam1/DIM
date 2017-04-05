// Dawei Huang
// APCS2 pd5
// HW29 -- Stress is the Best
// 2017-04-05

public class DequeTester{
	public static void main(String[] args) {
	// initialize Deque dimsum containing String objects
	Deque<String> dimsum = new ArrayDeque<>();
	dimsum.addLast("dumpling"); //add to the end of the Deque
	//dimsum : ["dumpling"]
	dimsum.addFirst("chopsticks"); //add to the front of the Deque
	//dimsum : ["chopsticks", "dumpling"]
	dimsum.addFirst("fried rice"); //add to the front of the Deque
	//dimsum : ["fried rice", "chopsticks", "dumpling"]
	dimsum.addLast("wonton"); //add to the end of the Deque
	//dimsum : ["fried rice", "chopsticks", "dumpling", "wonton"]
	dimsum.addFirst("spoon"); //add to the front of the Deque
	//dimsum : ["spoon", "fried rice", "chopsticks", "dumpling", "wonton"]
	dimsum.addFirst("fork"); //add to the front of the Deque
	//dimsum : ["fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton"]
	dimsum.addLast("Chinese food"); //add to the end of the Deque
	//dimsum : ["fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton", "Chinese food"]
	dimsum.addFirst("napkin"); //add to the front of the Deque
	//dimsum : ["napkin", "fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton", "Chinese food"]
	dimsum.addFirst("sushi"); //add to the front of the Deque
	//dimsum : ["sushi", "napkin", "fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton", "Chinese food"]

	System.out.println("dimsum toString: " + dimsum);
	//dimsum : ["sushi", "napkin", "fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton", "Chinese food"]
	
	System.out.println("Testing contains pudding: " + dimsum.contains("chopsticks"));
	//print "Testing contains pudding: true"
	System.out.println("Testing contains pudding: " + dimsum.contains("rice"));
	//print "Testing contains pudding: false"
	System.out.println("Peek first: " + dimsum.peekFirst());
	//print "Peek first: sushi"
	System.out.println("Removing first: " + dimsum.removeFirst());
	//print "Removing first: sushi"	
	//dimsum : ["napkin", "fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton", "Chinese food"]
	System.out.println("Removing last: " + dimsum.remove());
	//print "Removing last: Chinese food"
	//dimsum : ["napkin", "fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton"]
	System.out.println("Removing first: " + dimsum.removeFirst());
	//print "Removing first: napkin"
	//dimsum : ["fork", "spoon", "fried rice", "chopsticks", "dumpling", "wonton"]
	System.out.println("Removing first: " + dimsum.removeFirst());
	//print "Removing first: fork"
	//dimsum : ["spoon", "fried rice", "chopsticks", "dumpling", "wonton"]
	System.out.println("Removing first: " + dimsum.removeFirst());
	//print "Removing first: spoon"
	//dimsum : ["fried rice", "chopsticks", "dumpling", "wonton"]
	System.out.println("dimsum toString: " + dimsum);
	//dimsum : ["fried rice", "chopsticks", "dumpling", "wonton"]
	System.out.println(dimsum.size());
	//print 4
    }	
}