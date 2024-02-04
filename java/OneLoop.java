public class OneLoop {

    public static void main(String[] args) {
        int[] test = new int[20];
        for (int i = 0; i < 20; i++) {
            test[i] = i;
        }
        System.out.println(pairFind(test));
        test[19] = test[1];
        System.out.println(pairFind(test));
    }

    private static boolean pairFind(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                if (givenArray[i] == givenArray[j])
                    return true;
            }
        }
        return false;
    }
}