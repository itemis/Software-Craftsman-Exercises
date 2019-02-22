import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalFeatureTest {

    private OptionalFeature optionalFeature;

    @Before
    public void setUp() {
        optionalFeature = new OptionalFeature();
    }

    @Test
    public void shouldProvideAlternativeOptionalWithoutOr() {
        final String testName = "test_name";
        final Optional<String> optionalTestName = Optional.of(testName);
        final Optional<String> resultOptionalTestName = optionalFeature.provideAlternativeWithOr(optionalTestName);
        assertThat(resultOptionalTestName.orElse("fail")).isEqualTo(testName);
    }

    @Test
    public void shouldProvideAlternativeOptionalWithOr() {
        final Optional<String> emptyOptional = Optional.empty();
        final Optional<String> resultOptionalTestName = optionalFeature.provideAlternativeWithOr(emptyOptional);
        assertThat(resultOptionalTestName.orElse("fail")).isEqualTo("name_added_with_optional_or");
    }
}
