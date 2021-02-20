import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final int dimension = 100;
    public static void main(String[] args) {
        generator(100);

    }

    public static void generator(Integer number) {
        Set<Integer> size = new HashSet<>();
        Integer[][] array = new Integer[number][];
        for(int i = 0; i < number; i++) {
            if (!size.contains(i)) {
            array[i] = new Integer[(int)(Math.random() * dimension)];
            size.add(i);
            } else {
                number++;
                continue;
            }
            for (int j = 0; j < array[i].length; j++) {
                (array[i])[j] = (int) (Math.random() * dimension);
            }
            if((i + 1) % 2 == 0) {
                Arrays.sort(array[i]);
            } else {
                Arrays.sort(array[i], Collections.reverseOrder());
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
