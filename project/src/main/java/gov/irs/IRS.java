package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

    private static IRS singleTonInstance;

    private IRS() {
    }

    public static IRS getSingleTonInstance() {
        if (singleTonInstance == null) {
            singleTonInstance = new IRS();
        }
        return singleTonInstance;
    }

    private final List<TaxPayer> taxPayers = new ArrayList<>();

    public void register(TaxPayer taxPayer) {
        taxPayers.add(taxPayer);
    }

    public double computeTotalMonthlyTaxToCollect() {

        return taxPayers.stream()
                .map(TaxPayer::computeMonthlyTaxToPay)
                .mapToDouble(d -> d)
                .sum();

    }

}
