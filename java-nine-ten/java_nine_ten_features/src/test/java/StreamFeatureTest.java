import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamFeatureTest {

    private StreamFeature streamFeature;

    @Before
    public void setUp() {
        streamFeature = new StreamFeature();
    }

    @Test
    public void shouldGenerateRisingNumbersAsStringsByUsingIntStreamIterate() {
        final List<String> increasingNumbers = streamFeature.generateRisingNumbers(0, 4);
        assertThat(increasingNumbers).containsExactly("0", "1", "2", "3", "4");
    }

    @Test
    public void shouldTakeNumbersWhileNotZero() {
        final List<Integer> increasingNumbers = streamFeature.takeWhileNotZero(List.of(4, 3, 2, 6, 0, 9, 5));
        assertThat(increasingNumbers).containsExactly(4, 3, 2, 6);
    }

    @Test
    public void shouldDropNumbersWhileNotZero() {
        final List<Integer> increasingNumbers = streamFeature.dropNumbersWhileNotZero(List.of(4, 3, 2, 6, 0, 9, 5));
        assertThat(increasingNumbers).containsExactly(0, 9, 5);
    }
}
