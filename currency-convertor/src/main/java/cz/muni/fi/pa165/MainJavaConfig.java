package cz.muni.fi.pa165;

import cz.muni.fi.pa165.config.JavaConfig;
import cz.muni.fi.pa165.currency.CurrencyConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Lenka on 25/10/2017.
 */
public class MainJavaConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        CurrencyConvertor convertor = (CurrencyConvertor) context.getBean("convertor");

        BigDecimal result = convertor.convert(
                Currency.getInstance("EUR"),
                Currency.getInstance("CZK"),
                new BigDecimal("1")
        );
        System.out.println("The resul is: " + result);
    }
}
