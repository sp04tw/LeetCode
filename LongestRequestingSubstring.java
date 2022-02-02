Class Solution{
  public int longestRequestingSubstring(String s){
    //s="abbaba"
    int l=0,r=s.length()-1;
    while(l<r){
      int mid=l+(r-l+1)/2;
      if(checkSubstring(s,mid)) l=mid;
      else r=mid-1;
    }
    return l;
  }
  
  publis boolean checkSubstring(String s, int mid){
    Set<String> set=new HashSet<>();
    for(int i=0;i<=s.length()-mid;i++){
      int endpoint=i+mid-1;
      String sub=s.substring(i,endpoint+1);
      if(set.contains(sub)) return true;
      set.add(sub);
    }
    return false;
  }
}
