import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

public class HttpTwoFeatureTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089);

    public static final String TEST_URL = "/something";

    @Test
    public void shouldFetchSomething() throws InterruptedException, IOException, URISyntaxException {
        wireMockRule.stubFor(get(urlEqualTo(TEST_URL)).willReturn(aResponse().withStatus(200).withBody("something")));

        final HttpTwoFeature httpTwoFeature = new HttpTwoFeature();
        final String something = httpTwoFeature.fetchSomethingWithHttpTwo();

        verify(getRequestedFor(urlEqualTo(TEST_URL)).withHeader("Content-Type", equalTo("text")));
        assertEquals("something", something);
    }
}
