import java.util.Random;
import java.util.concurrent.TimeUnit;

class SearchSortedRandom {
  public static int binarySearch(int arr[], int size, int value_to_find){
    int binaryStart = 0, binaryEnd = size - 1;

      while (binaryStart <= binaryEnd)
      {
        int mid = (binaryStart + binaryEnd) / 2;

        if (arr[mid] == value_to_find)
        {
          return mid;
        }

        if (value_to_find < arr[mid])
        {
          binaryEnd = mid - 1;
        }
        else
        {
          binaryStart = mid + 1;
        }
      }
      return -1;
  }


  public static void main(String args[]) {
    Random rand = new Random();
    int size = 1000;

    int arr[] = new int[size];
    
    // Populate the Array
    for(int i = 0; i < size; ++i){
      arr[i] = rand.nextInt(100);
    }

    // Bubble Sort
    for (int i = 0; i < size - 1; ++i){
        for (int j = 0; j < size -1 - i; ++j){
          if (arr[j+1] < arr[j]) {
            int tmp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = tmp;
          }
        }
      }

    long start = System.nanoTime();
    int idx = binarySearch(arr, 1000, 5);
    
    long end = System.nanoTime();
    if (idx == -1){
      System.out.println("Didn't find the value");
    }
    else {
      System.out.println("Found the value [" + arr[idx] + "] at index [" + idx + "]");
    }


    long timeElapsedSeconds = TimeUnit.SECONDS.convert(end-start, TimeUnit.NANOSECONDS);

    System.out.println("Execution Time : " + timeElapsedSeconds + " seconds");
    System.out.println("Execution Time : " + (double)(end-start)/1_000_000_000 + " seconds");

    return ;
  }
}


