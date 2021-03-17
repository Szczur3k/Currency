package pl.MateuszLukaszczyk.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Currency {

    Map<String, Double> currencyMap = new HashMap<>();

    public Currency(){
        addingCurrency();
    }

    public void addingCurrency(){
        currencyMap.put("PLN", 3.55);
        currencyMap.put("EUR", 4.55);
        currencyMap.put("USD", 5.55);
    }

}