class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outerlist = new ArrayList<>();

        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;

            List<String> inlist = new ArrayList<>();
            inlist.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j])
                    continue;

                if (strs[i].length() != strs[j].length())
                    continue;

                ArrayList<Character> a1 = new ArrayList<>();
                ArrayList<Character> a2 = new ArrayList<>();
                ArrayList<String> a3 = new ArrayList<>();
                for (int k = 0; k < strs[i].length(); k++) {
                    char x = strs[i].charAt(k);
                    char y = strs[j].charAt(k);
                    a1.add(x);
                    a2.add(y);
                    String z = "" + y;
                    a3.add(z);
                }
                for (int m = 0; m < a1.size(); m++) {
                    for (int n = 0; n < a2.size(); n++) {
                        char x = a1.get(m);
                        char y = a2.get(n);
                        if (x == y) {
                            a2.remove(n);
                            break;
                        }
                    }
                }
                if (a2.isEmpty()) {
                    inlist.add(strs[j]);
                    visited[j] = true;
                }
            }
            outerlist.add(inlist);
        }
        return outerlist;
    }
}