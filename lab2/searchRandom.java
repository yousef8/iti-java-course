import java.util.Random;
import java.util.concurrent.TimeUnit;

class SearchRandom {
  public static void main(String args[]) {
    long start = System.nanoTime();
    Random rand = new Random();

    int arr[] = new int[1000];

    for(int i = 0; i < 1000; ++i){
      arr[i] = rand.nextInt();
    }

    int min = arr[0];
    int max = arr[0];

    for(int i =0; i < 1000; ++i){
      if(arr[i] > max) max = arr[i];
      if(arr[i] < min) min = arr[i];
    }

    long end = System.nanoTime();
    long timeElapsedIntSeconds = TimeUnit.SECONDS.convert(end-start, TimeUnit.NANOSECONDS);
    double timeElapsedDoubleSeconds =  (double)(end-start)/1_000_000_000;

    System.out.println("The minimum number is : " + min);

    System.out.println("The maximum number is : " + max);
    
    System.out.println("Execution Time : " + timeElapsedDoubleSeconds + " seconds");
    System.out.println("Execution Time : " + timeElapsedIntSeconds + " seconds");

    return ;
  }
}



