/* Tugas Selection Sort array java 
NAMA : Salman Alfariji
NIM : 20200040033
KELAS : TI 20 A REGULLER 
TUGAS SESI 9 ALGODATA
 */

/**
 *
 * @SALMAN09
 */
import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {13, 6, 17, 23, 31, 35,42, 47, 50}; 

    int min = arr[0];
    int index = 0;
    int swappingProcess = 0;

    long startTime = System.nanoTime();

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if ( arr[j] < min ) {
          min = arr[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(arr) + " - Total Swap : " + swappingProcess);
      }
      if ( min < arr[i] ) {
        arr[index] = arr[i];
        arr[i] = min;
      }
      min = arr[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Total waktu diperlukan : " + timeElapsed + " nano detik");



  }

}