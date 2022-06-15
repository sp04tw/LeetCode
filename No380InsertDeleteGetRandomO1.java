class RandomizedSet {

    Map<Integer,Integer> map;
    List<Integer> list;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,map.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index=map.get(val);
        //replace indexe element to last element
        list.set(index,list.get(list.size()-1));
        map.put(list.get(list.size()-1),index);
        //remove last element
        list.remove(list.size()-1);
        //remove val in map
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand=new Random();
        int randInt=rand.nextInt(list.size());
        //System.out.println(randInt);
        return list.get(randInt);
    }
    
    
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
