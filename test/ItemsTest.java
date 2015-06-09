import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemsTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrayInputStream;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldBeAbleToParseTheInput() {
        Items items = new Items();

        String[] actualItems={"1","book", "at","12.49"};

        assertThat(items.parseInput("1 book at 12.49"),is(actualItems));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}