import java.util.*;

public class Inse {
  
  public static void insertionsort(int[] array) {
    for(int i = 1; i < array.length; i++) {
      int current = array[i];
      int j = i - 1;

      // Move elements that are greater than 'current' one position ahead
      while(j >= 0 && array[j] > current) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = current;
    }
  }

  public static void main(String[] args) {
    int[] myarray = {64, 25, 12, 22, 11};
    insertionsort(myarray);

    for(int num : myarray) {
      System.out.print(num + " ");
    }
  }
}