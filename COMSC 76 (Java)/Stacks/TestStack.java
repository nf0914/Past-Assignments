/**
 * Niklas Feil-Ho
 * Uses a stack and implements methods to merge two stacks or reverse a stack.
 * @author Balaji Srinivasan
 */
public class TestStack {
	/**
	 * makeStack: Given an array of Integer objects, create and return a stack with
	 * the same objects. The first item in the array will be at the bottom of the
	 * stack, the last item at the top.
	 *
	 * @param1 arr the Integer array
	 * @return the new stack
	 */
	public static Stack<Integer> makeStack(Integer[] arr) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		return stack;
	}
    /**
     * Given two stacks containing Integer objects in increasing order
     * from the bottom up, create a third stack such that the Integer objects
     * are in increasing order from the bottom up. If an item appears n times in
     * the two given stacks, it will appear n times in the new stack.
     *
     * @param s1 the first stack
     * @param s2 the second stack
     * @return the new stack, with the items from the two given stacks merged.
     */
    public static <E extends Comparable<E>> Stack<E> merge(Stack<E> s1, Stack<E> s2) {
        // TODO: Implement this function.
    	Stack<E> reversedStack1 = s1.clone();
    	Stack<E> reversedStack2 = s2.clone();
    	
    	Stack<E> mergedStack = new Stack<>();
    	
    	while (!reversedStack1.isEmpty() && !reversedStack2.isEmpty()) {
    		if (reversedStack1.peek().compareTo(reversedStack2.peek()) > 0) {
    			mergedStack.push(reversedStack1.pop()); 
    			//push popped integer from reversedStack1 if reversedStack1's peek is larger than reversedStack2
    		} else {
    			mergedStack.push(reversedStack2.pop()); //push popped integer from reversedStack2
    		}
    	}
    	while (!reversedStack1.isEmpty()) {
    		mergedStack.push(reversedStack1.pop()); //push rest of reversedStack1 if reversedStack2 is empty
    	}
    	while (!reversedStack2.isEmpty()) {
    		mergedStack.push(reversedStack2.pop()); //push rest of reversedStack2 if reversedStack1 is empty
    	}
    	
    	return reverse(mergedStack);
        //throw new UnsupportedOperationException("Not implemented.");
    }

    /**
     * Given a stack of Integer objects, create and return a stack with
     * the same objects in reverse order.
     *
     * @param1 s1 the input stack
     * @return the new stack, with the items in reverse order
     */
    public static <E extends Comparable<E>> Stack<E> reverse(Stack<E> s1) {
        // TODO: Implement this function.
    	Stack<E> clonedStack1 = s1.clone();
    	
    	Stack<E> reversedStack = new Stack<>();
    	
    	while (!clonedStack1.isEmpty()) {
    		reversedStack.push(clonedStack1.pop()); //push integer that was popped from cloned stack
    	}
    	return reversedStack;
    	
        //throw new UnsupportedOperationException("not implemented.");
    }
    public static void main(String[] args) {
    	Integer[] arr1 = {1,2,3,4,};
    	Integer[] arr2 = {2,3,4,5};
    	
    	//use makeStack() to test by converting arrays into Stacks
    	Stack<Integer> Stack1 = makeStack(arr1);
    	Stack<Integer> Stack2 = makeStack(arr2);
    	
    	System.out.println("stack 1: " + Stack1);
    	System.out.println("stack 2: " + Stack2);
    	
    	Stack<Integer> reversedStack1 = reverse(Stack1);
    	Stack<Integer> reversedStack2 = reverse(Stack2);
    	System.out.println("Reversed Stack 1: " + reversedStack1);
    	System.out.println("Reversed Stack 2: " + reversedStack2);
    	
    	Stack<Integer> mergedStack = merge(Stack1, Stack2);
    	
    	System.out.println("Merged Stack: " + mergedStack);
    }
}
