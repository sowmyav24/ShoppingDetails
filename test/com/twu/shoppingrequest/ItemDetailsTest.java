package com.twu.shoppingrequest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemDetailsTest {

    @Test
    public void shouldReturnItemNameString(){
       ItemDetails itemDetails = new ItemDetails(1,"bookat",12.49);

        String actualMessage = itemDetails.returnDetails();

        assertThat(actualMessage, is(equalTo("bookat")));
    }

    @Test
    public void shouldCalculateSalesTax(){
        ItemDetails itemDetails = new ItemDetails(1,"bookat",12.49);

        SalesTax salesTaxStub = mock(SalesTax.class);
        when(salesTaxStub.checkIfSalesTaxIsApplicable())
                .thenReturn(true);

        double actualTax = itemDetails.calculateTax();

        assertEquals(1.249,actualTax,0.05);
    }
}