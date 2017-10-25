package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Lenka on 25/10/2017.
 */
public class MainXML {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");

        CurrencyConvertor convertor = context.getBean(CurrencyConvertor.class);
        BigDecimal result = convertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), new BigDecimal(1));
        System.out.println("The result is: " + result);
    }
}
