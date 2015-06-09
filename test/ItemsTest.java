import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
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

        String[] actualItems = {"1", "book", "at", "12.49"};

        assertThat(items.parseInput("1 book at 12.49"), is(actualItems));
    }

    @Test
    public void shouldBeAbleAddDetails() {
        Items items = new Items();
        String[] actualItems = {"1", "book", "at", "12.49"};

        ItemDetails itemDetails = items.addDetails(actualItems);
        String actualDetails=itemDetails.returnDetails();

        assertThat(actualDetails, CoreMatchers.is(equalTo(new ItemDetails(1, "bookat", 12.49).returnDetails())));

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}