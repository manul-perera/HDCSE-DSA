import java.util.*;

public class Sele {
  
  public static void selectionsort(int []array){
    for(int i=0;i<array.length - 1; i++){
      int minindex=i;
      
      for (int j=i+1;j<array.length ;j++ ){
        if (array[j]<array[minindex]){
          minindex=j;
        } 
      }
      int temp=array[i];
      array[i]=array[minindex];
      array[minindex]=temp;
    } 
  }
  
    public static void main(String[] args) {
      int [] myarray = {64,25,12,22,11};
      
      selectionsort(myarray);
      
      for (int num: myarray){
        System.out.print(num + " ");
      } 
  }
}