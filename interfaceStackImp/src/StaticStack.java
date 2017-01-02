import java.util.Stack;


public class StaticStack implements InStack{
  private int stack[];
  private int top;
	
  public StaticStack(int size) {
	stack= new int[size];
	top=-1;
  }
	
  public void push(int value)
  {
	  if(top==stack.length-1){
		  System.out.println("Stack is full");
	  }
	  else
	  {
		  stack[++top]=value;
	  }
  }

	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stack[top--];}
}
