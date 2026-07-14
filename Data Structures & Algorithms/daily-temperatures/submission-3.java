class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer_arr=new int [temperatures.length];
        Stack<int []> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[i]>stack.peek()[0]){
                int [] arr=stack.pop();
                answer_arr[arr[1]]=i-arr[1];
            }
            stack.push(new int []{temperatures[i],i});
        }
        return answer_arr;
    }
}
