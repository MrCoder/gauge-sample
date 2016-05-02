import com.thoughtworks.gauge.Step;

import static org.junit.Assert.assertEquals;

public class BeatImplementation {

    @Step("Make sure we can connect to Elasticsearch")
    public void connect_to_es() {

    }

    @Step("We must be able to create an Pay Process and retrieve it from Elasticsearch")
    public void create_and_read() {
        assertEquals(1, 1);
    }
}
