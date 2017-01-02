public class DynStack implements InStack {
	private int stack[];
	private int top;

	public DynStack(int size) {
		stack = new int[size];
		top = -1;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stack[top--];
	}

	public void push(int value) {
		if (top == stack.length - 1) {
			int temp[] = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
			stack[++top] = value;
		} else
			stack[++top] = value;
	}

}
