import java.util.*;

public class Bubble {
  
  public static void bubblesort(int []array){
    for(int i=0;i<array.length - 1; i++){
      for (int j=0;j<array.length - 1 - i;j++ ){
        if (array[j]>array [j+1]){
          int temp=array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
        } 
      }
    } 
  }
  
    public static void main(String[] args) {
      int [] myarray = {5,1,6,2,3};
      
      bubblesort(myarray);
      
      for (int num: myarray){
        System.out.print(num + " ");
      } 
  }
}