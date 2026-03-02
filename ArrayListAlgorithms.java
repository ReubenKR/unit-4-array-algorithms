import java.util.ArrayList;

public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   ArrayList<Integer> intArrayList = new ArrayList<Integer>(); 

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0; i < ((int) Math.random()*99 + 1); i++) {
         intArrayList.add((int) Math.random()*99 + 1);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int j = startNum;
      for (int i = 0; i < ((int) Math.random()*99 + 1); i++) {
         intArrayList.add(i+j);
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
   int highest = intArrayList.get(0);
      for (int i = 0; i < intArrayList.size(); i++) {
         if (highest>intArrayList.get(i)) {
            highest = intArrayList.get(i);
         }
      }
   return highest;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for (int i = 0; i < intArray.size(); i++) {
         for (int j = i + 1; j < intArray.size(); j++) {
            if (intArrayList.get(i) == intArrayList.get(j)) {
               return true;
            }
         }   
      }
      return false;
   }

   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      
   }

   
   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      
   }
}
