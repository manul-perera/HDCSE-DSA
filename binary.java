import java.util.*;

public class Inse {
  
  public static int binarySearch(int []array, int target){
    int left=0;
    int right=array.length-1;
    
    while(left<=right){
      int mid=left+(right-left)/2;
      
      if (array[mid]==target){
        return mid;
      }else if (array[mid]<target){
        left = mid - 1;
        }else{
          right=mid + 1;
      }
    }
    return -1;
  }
    public static void main(String[] args) {
      int [] myarray = {2,3,5,8,9};
      
      int result= binarySearch(myarray,3);
      if (result==-1){
        System.out.print("element not found ");
      }else{
        System.out.print("element found at index : "+result);
      }
  }
}