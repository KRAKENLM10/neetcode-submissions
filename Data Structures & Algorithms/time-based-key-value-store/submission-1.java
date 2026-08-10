class TimeMap {
	
	Map<String, ArrayList<String[] >> map;
	
    public TimeMap() {
    		map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
    		if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
    		String []s= {value,(""+timestamp)};
        map.get(key).add(s);
    }
    
    public String get(String key, int timestamp) {
    		if (!map.containsKey(key)) {
            return "";
        }
    	String ans="";
        int i=0;
        int j=map.get(key).size()-1;
        while(i<=j) {
        		int m=i+(j-i)/2;
        		int x=Integer.parseInt(map.get(key).get(m)[1]);
        		
        		if(x<=timestamp) {
                    ans=map.get(key).get(m)[0];
        			i=m+1;
        		}
        		else {
        			j=m-1;
        		}
        }
        return ans;
    }
}
