package pl.MateuszLukaszczyk.Model;

import java.util.HashMap;

public class Currency {

    public Currency(){
    }

    HashMap<String, Double> currencyMap = new HashMap<>();

    public void addingCurrency(){
        currencyMap.put("PLN", 3.55);
        currencyMap.put("EUR", 4.55);
        currencyMap.put("USD", 5.55);
    }

    public HashMap<String, Double> getCurencyMap() {
        return currencyMap;
    }

    public void setCurencyMap(HashMap<String, Double> currencyMap) {
        this.currencyMap = currencyMap;
    }



}
