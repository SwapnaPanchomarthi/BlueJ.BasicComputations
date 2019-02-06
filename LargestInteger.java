 
import java.util.Scanner;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        //finding array length
        int n = integers.length; 
      
        // Initialize maximum element 
        int max = integers[0]; 
        //comparing each integer from array by running loop with conditional statement
      
        for (int i = 1; i < n; i++) 
        if (integers[i] > max) 
           { max = integers[i]; }
  

        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        //finding array length
        int n = integers.length; 
        int max = integers[0];
        for (int i=1; i<n; i++)
        {
            Math.max(max, integers[i]);
          
            max=integers[i];
        }  
        
        return max;
    }
}
