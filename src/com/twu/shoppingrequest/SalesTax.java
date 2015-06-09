package com.twu.shoppingrequest;

import java.util.ArrayList;

public class SalesTax {
    private double salestax;
    private ItemDetails itemDetails;
    ArrayList<String> exemptedList = new ArrayList<>();

    SalesTax(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
        exemptedList.add("book");
        exemptedList.add("music");
        exemptedList.add("medicine");
    }

    public boolean checkIfSalesTaxIsApplicable() {
        boolean applicable=false;
        for (String s : exemptedList)
            if (s.equals(itemDetails.returnDetails())) {
                applicable=true;
            }
        return applicable;
    }
}
