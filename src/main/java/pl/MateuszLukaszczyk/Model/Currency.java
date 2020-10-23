package pl.MateuszLukaszczyk.Model;

import java.util.HashMap;
import java.util.Map;

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

    public Map<String, Double> getCurencyMap() {
        return currencyMap;
    }

    public void setCurencyMap(HashMap<String, Double> currencyMap) {
        this.currencyMap = currencyMap;
    }
}