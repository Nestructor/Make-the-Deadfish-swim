import java.util.Arrays;

public class Kata {

    private int[] array;
    private int number;

    public Kata() {
        array = new int[0];
        number = 0;
    }

    public int[] of(String commands) {
        return generateArray(commands);
    }

    private int[] generateArray(String commands) {
        commands.chars()
                .forEach(x -> checkCommand((char) x));
        return array;
    }

    private void addItemToArray(int number) {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = number;
    }

    private void checkCommand(char command) {
        if(command == 'o') addItemToArray(number);
        if(command == 'd') number--;
        if(command == 's') number *= number;
        if(command == 'i') number++;
    }

}