import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class Kata_ {

    private Kata kata;
    private final int[] array;
    private final String value;

    public Kata_(String value, int[] array) {
        this.array = array;
        this.value = value;
    }

    @Before
    public void setUp() {
        kata = new Kata();
    }

    @Test
    public void execute() {
        assertThat(kata.of(value)).isEqualTo(array);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {"", new int[]{}},
                {"i", new int[]{}},
                {"iio", new int[]{2}},
                {"iioo", new int[]{2, 2}},
                {"iiosdo", new int[]{2, 3}},
                {"iiowwsdo3O2d", new int[]{2, 3}},
        };
    }
}
