package normal.search;
import java.lang.*;
public class MAXIMUM_LINEAR{
  public int MaximumArray(int[]a,int start,int end){
    if(start==end){
      return a[start];
    }else{
      int max=MaximumArray(a,start+1,end);
      return Math.max(a[start],max);
    }
  }
  public int MaximumLinked(Node h){
    if(h.next==null){
      return (int)h.ele;
    }else{
      int max=MaximumLinked(h.next);
      return Math.max((int)h.ele,max);
    }
  }
}