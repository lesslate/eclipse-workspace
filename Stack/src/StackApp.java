
public class StackApp {
	
	public static void main(String[] args) {
		
		Stack theStack = new Stack(4);
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.pop();
		theStack.pop();
		theStack.push(50);
		theStack.display();
		
}
}

