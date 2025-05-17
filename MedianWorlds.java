import java.util.*;

public class MedianWorls {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] data = {70, 80, 80, 90, 100};
        Arrays.sort(data);
        int total = 0;
        for (int val : data) {
                total += val ;
        }
        double mean = (double) total / data.length;
        
        double median ;
        if (data.length % 2 = = 0) {
                median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2.0;
        } else {
                median = data[data.length / 2];
        }
        Map <Integer,Integer > frekuensi = new HashMap<>();
        for (int val : data) frekuensi.put(val,frekuensi.getOrDefault(val , 0 ) + 1);
        int mode = data[0] ;
        int totalfrek = 0 ;
        
        for (int target : frekuensi.keySet()) {
                if (frekuensi.get(target) > totalfrek) {
                        totalfrek = frekuensi.get(target) ;
                        mode = target ;
                }
        }
        
    }
}
