class Solution {
	    
	    public int evalRPN(String[] tokens) {
	        Stack<Integer> stack=new Stack<>();
	        for(int i=0;i<tokens.length;i++){
	            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")) {
	            		if(tokens[i].equals("+")) {
	            			int a=stack.peek();
		            		stack.pop();
		            		int b=stack.peek();
		            		stack.pop();
		            		stack.push((b+a));
	            		}
	            		else if(tokens[i].equals("-")) {
	            			int a=stack.peek();
		            		stack.pop();
		            		int b=stack.peek();
		            		stack.pop();
		            		stack.push((b-a));
	            		}
	            		else if(tokens[i].equals("*")) {
	            			int a=stack.peek();
		            		stack.pop();
		            		int b=stack.peek();
		            		stack.pop();
		            		stack.push((b*a));
	            		}
	            		else if(tokens[i].equals("/")) {
	            			int a=stack.peek();
		            		stack.pop();
		            		int b=stack.peek();
		            		stack.pop();
		            		stack.push((b/a));
	            		}
	            }
	            else {
	            		stack.push(Integer.parseInt(tokens[i]));
	            }
	        }
	        return stack.peek();
	    }
	
	}