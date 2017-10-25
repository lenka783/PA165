package cz.muni.fi.pa165.config;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import cz.muni.fi.pa165.currency.CurrencyConvertorImpl;
import cz.muni.fi.pa165.currency.ExchangeRateTable;
import cz.muni.fi.pa165.currency.ExchangeRateTableImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lenka on 25/10/2017.
 */
@Configuration
public class JavaConfig {

    @Bean(name ="exchangeTable")
    public ExchangeRateTable exchangeRateTable() {
        return new ExchangeRateTableImpl();
    }
    @Bean(name = "convertor")
    public CurrencyConvertor currencyConvertor() {
        return new CurrencyConvertorImpl(exchangeRateTable());
    }
}
