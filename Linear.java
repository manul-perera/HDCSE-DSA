import java.util.*;

public class Linear {
  
  public static int linearSearch(int []array, int target){
    for(int i=0;i<array.length; i++){
      if (array[i]==target){
        return i;
      }
    }
    return -1;
  }
    public static void main(String[] args) {
      int [] myarray = {4,2,9,7,5,6};
      
      int result=linearSearch(myarray,6);
      if (result==-1){
        System.out.print("element not found ");
      }else{
        System.out.print("element found at index : "+result);
      }
  }
}