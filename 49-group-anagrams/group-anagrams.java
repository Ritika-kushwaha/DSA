class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : strs) {
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}