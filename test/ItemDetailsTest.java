import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemDetailsTest {

    @Test
    public void shouldReturnWelcomeString(){
       ItemDetails itemDetails = new ItemDetails(1,"bookat",12.49);

        String actualMessage = itemDetails.returnDetails();

        assertThat(actualMessage, is(equalTo("1bookat12.49")));
    }

}