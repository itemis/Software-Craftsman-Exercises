import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.MapEntry.entry;

public class CollectionFeatureTest {

    private CollectionFeature collectionFeature;

    @Before
    public void setUp() {
        collectionFeature = new CollectionFeature();
    }

    @Test
    public void shouldProvideSomeFfmItemisEmployeesWithJavaNineListOf() {
        final List<String> someFfmItemisEmployees = collectionFeature.provideSomeFfmItemisEmployeesWithJavaNineListOf();
        assertThat(someFfmItemisEmployees).containsExactly("Christian", "Ali", "Rohit", "Sascha", "Tommaso", "Marcio");
    }

    @Test
    public void shouldProvideSomeFfmItemisEmployeesWithJavaNineSetCopyOf() {
        final List<String> someEmployees = Arrays.asList("Christian", "Ali", "Rohit", "Sascha", "Tommaso", "Marcio");
        final Set<String> someFfmItemisEmployees = collectionFeature
                .provideSomeFfmItemisEmployeesWithJavaNineSetCopyOf(someEmployees);
        assertThat(someFfmItemisEmployees).containsAll(someEmployees);
    }

    @Test
    public void shouldProvideSomeFfmItemisEmployeesWithJavaNineMapOf() {
        final Map<String, String> someFfmItemisEmployees = collectionFeature.provideSomeFfmItemisEmployeesWithJavaNineMapOf();
        assertThat(someFfmItemisEmployees).containsOnly(entry("Christian", "W"), entry("Ali", "K"), entry("Rohit", "A"), entry("Sascha", "B"));
    }

    @Test
    public void shouldProvideSomeFfmItemisEmployeesWithJavaNineMapOfEntries() {
        final Map<String, String> someFfmItemisEmployees = collectionFeature.provideSomeFfmItemisEmployeesWithJavaNineMapOfEntries();
        assertThat(someFfmItemisEmployees).containsOnly(entry("Christian", "W"), entry("Ali", "K"), entry("Rohit", "A"), entry("Sascha", "B"));
    }
}
