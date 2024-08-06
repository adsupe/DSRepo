package ultimate.java.progs;

public class StackCustomDemo {

	public static void main(String[] args) throws Exception {

		StackCustom stack = new StackCustom(6);
		stack.push(31);
		stack.push(34);
		stack.push(12);
		stack.push(67);
		stack.push(22);
		stack.push(2);
		
		System.out.println("Pop :"+stack.pop());
		System.out.println("Pop :"+stack.pop());
		
		System.out.println("Display Records::");
		
		stack.display();
		
		System.out.println("-----------------");
		
		System.out.println("Pop :"+stack.pop());
		System.out.println("Pop :"+stack.pop());
		System.out.println("Pop :"+stack.pop());
		
		System.out.println("Display Records::");
		
		stack.display();
		
	}

}

class StackCustom {
	private int[] stackarr;
	private int top;
	
	public StackCustom(int size) {
		top = -1;
		stackarr = new int[size];
	}
	
	public void push(int value) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full  !!");
		}
		stackarr[++top] = value;
	}
	
	public int pop() throws Exception{
		int value = 0;
		if(isEmpty()) {
			throw new Exception("Stack is empty !!");
		}
		value = stackarr[top--];
		return value;
	}
	
	private boolean isFull() {
		if(top ==(stackarr.length-1)) {
			return true;
		}
		return false;
	}
	
	private boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(stackarr[i]);
		}
	}
}