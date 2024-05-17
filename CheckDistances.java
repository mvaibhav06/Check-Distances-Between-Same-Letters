class CheckDistances {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,List<Integer>> temp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            List<Integer> list = new ArrayList<>();
            if(temp.containsKey(ch)){
                list = temp.get(ch);
            }
            list.add(i);
            temp.put(ch,list);
        }
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i=0; i<distance.length; i++){
            char ch = alphabets[i];
            if(temp.containsKey(ch)){
                List<Integer> a = temp.get(ch);
                int diff = a.get(1)-a.get(0);
                if(diff-1 != distance[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
