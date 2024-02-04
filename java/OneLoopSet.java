import java.util.HashSet;
import java.util.Set;
public class OneLoopSet {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
        	array[i] = i;
        }
        System.out.println(pairFind(array));
        array[19] = array[5];
        System.out.println(pairFind(array));
    }
    
    public static boolean pairFind(int[] givenArray) {
    		Set<Integer> set = new HashSet<Integer>();
    		for (int i = 0; i < givenArray.length; i++) {
    			if (!(set.add(givenArray[i])))
    				return true;
    		}
    	return false;
    }
}