package cz.muni.fi.pa165.currency;

import javax.inject.Named;
import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Lenka on 25/10/2017.
 */
//@Named        //Task 06
public class ExchangeRateTableImpl implements ExchangeRateTable {
    /**
     * Returns exchange rate for given currencies pair. Exchange rate is amount
     * of units in target currency which corresponds to one unit in source
     * currency.
     * <p>
     * <p>If source currency is EUR and target currency is CZK and current
     * exchange rate is 25 CZK for 1 EUR, 25 is returned<p>
     *
     * @param sourceCurrency source currency
     * @param targetCurrency target currency
     * @return exchange rate for given currencies pair or null if exchange rate
     * for given pair is not known.
     * @throws IllegalArgumentException        when sourceCurrency or targetCurrency is
     *                                         null
     * @throws ExternalServiceFailureException when lookup for current exchange
     *                                         rate failed.
     */
    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {
        return sourceCurrency.equals(Currency.getInstance("EUR")) && targetCurrency.equals(Currency.getInstance("CZK"))
                ? new BigDecimal("27") : null;
    }
}
