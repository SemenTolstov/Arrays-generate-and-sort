import java.util.*;

public class Main {

    private static final int dimension = 100;
    private static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("Введите натуральное число:");
        scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        generator(number);

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
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
