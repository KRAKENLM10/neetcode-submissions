class MinStack {
		Stack<Integer> minstack;
	    public MinStack() {
	    		minstack=new Stack<>();
	    		
	    }
	    
	    public void push(int val) {
	        minstack.push(val);
	    }
	    
	    public void pop() {
	    		if(!minstack.isEmpty()) {
	    			minstack.pop();
	    		}
	    		else {
	    			System.out.println("null");
	    		}
	    }
	    
	    public int top() {
	        return minstack.peek();
	    }
	    
	    public int getMin() {
	    		int min= Integer.MAX_VALUE;
	        for(int i=0;i<minstack.size();i++) {
	        		min=Math.min(min, minstack.get(i));
	        }
	        return min;
	    }
	}