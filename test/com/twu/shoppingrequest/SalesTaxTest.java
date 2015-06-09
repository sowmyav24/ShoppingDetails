package com.twu.shoppingrequest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SalesTaxTest {
    @Test
    public void shouldCalculateSalesTax() {
        ItemDetails itemDetailsStub = mock(ItemDetails.class);
        when(itemDetailsStub.returnDetails())
                .thenReturn("Items");

        SalesTax salesTax = new SalesTax(itemDetailsStub);

        boolean actualTax=false;

        assertThat(actualTax,is(salesTax.calculateSalesTax()));
    }
}

