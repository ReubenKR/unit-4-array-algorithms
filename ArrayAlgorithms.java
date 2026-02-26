public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int x = 0; x < intArray.length; x++) {
         intArray[x] = (int) (Math.random() * 100);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int y = startNum;
      for (int x = 0; x < intArray.length; x++) {
         intArray[x] = x+y;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int y = intArray[0];
      for (int x = 0; x < intArray.length; x++) {
         if (intArray[x] > y) {
            y = intArray[x];
         }
      }
      return y;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for (int x = 0; x < intArray.length; x++) {
         for (int z = x + 1; z < intArray.length; x++) {
            if (intArray[x] == intArray[z]) {
               return true;
            }
         }   
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      boolean intFound = false;
      for (int x = 0; x < intArray.length; x++) {
         if (intArray[x] == intToFind) {
            intFound = true;
         }
      }
      return intFound;
   }

   // ===== UWHS ALGORITHMS =====

   

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms(20);
      arrayAlgorithms.populateArrayWithRandom();
      System.out.println(arrayAlgorithms.findMax());
      System.out.println(arrayAlgorithms.hasDuplicates());
      System.out.println(arrayAlgorithms.isInArray(12));
      ArrayAlgorithms arrayAlgorithms2 = new ArrayAlgorithms(20);
      arrayAlgorithms2.populateArrayWithSequential(2);
   }
}
