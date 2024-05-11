//프로그래머스 입국심사
class Solution {
    
    static long completePerson(int[] time,long mid){
        long person = 0;
        for(int t:time){
            person += mid / t;
        }
        return person;
        
    }
    public long solution(int n, int[] times) {
      long l = 0;
      long r =  1_000_000_000L * n;
      long ans = -1;
        
      while(l<=r){
          long mid = (l+r) /2;
          if(completePerson(times,mid) < n){
              l = mid + 1;
          } else {
              r = mid -1;
              ans = mid;
          }
      }  
      return ans;
        
    }
}
