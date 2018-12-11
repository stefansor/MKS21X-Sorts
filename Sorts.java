import java.util.ArrayList;
public class Sorts{
  public static void selectionSort(int[] ary){
    for(int i = 0; i < ary.length; i++){
      int smallest = ary[i];//saves value of first term to compare to
      int swap = 0;//saved value of item that will be swapped
      for(int j = i + 1; j < ary.length; j++){
        if(ary[j] < smallest){
          smallest = ary[j];//saving first value
          swap = ary[i];//saving items value
          ary[j] = swap;//swapping
          ary[i] = smallest;
        }
      }
    }
  }

  public static void bubbleSort(int[] data){
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < data.length - i - 1; j++){
        int first = data[j]; //saving values that are being checked
        int second = data[j + 1];
        if(first > second){//comparing values to see if swap is needed
          data[j] = second;//swapping
          data[j + 1]= first;
          //System.out.println(printArray(data));
        }
      }
    }
  }
  public static void insertionSort(int[] ary){
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int l = 0; l < ary.length; l++){
      nums.add(ary[l]);
    }
    for(int i = 1; i < nums.size(); i++){
      int current = nums.remove(i);
      for(int j = i - 1; j > 0; j--){
        if(current > nums.get(j)){
          nums.add(j + 1, current);
        }
        if(current < nums.get(0)){
          nums.add(0, current);
        }
      }
    }
    for(int k = 0; k < ary.length; k++){
      ary[k] = nums.get(k);
    }
  }


  /* Courtesy of Lauren Pehlivanian*/
  public static String printArray(int[] ary) {
      String output = "[";
      for(int i=0; i<ary.length-1; i++) {
        output += ary[i] + ", ";
      }
      return output += ary[ary.length-1] + "]";
  }

}
