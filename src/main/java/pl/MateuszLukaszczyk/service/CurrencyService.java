package pl.MateuszLukaszczyk.service;

import java.util.Map;
import java.util.Optional;

import pl.MateuszLukaszczyk.Exceptions.ApiRequestException;
import pl.MateuszLukaszczyk.Model.Currency;

public class CurrencyService {

    Currency currency = new Currency();

    public Double getDoubleResponseEntity(String code) {
        final Map<String, Double> curencyMap = currency.getCurencyMap();
        final Optional<String> optionalKey = getOptionalKey(code, curencyMap);
        final String key = optionalKey.orElseThrow(() -> new ApiRequestException("Sorry '" + code + "' doesn't exist"));
        return curencyMap.get(key);
    }

    private Optional<String> getOptionalKey(String code, Map<String, Double> curencyMap) {
        return curencyMap.keySet()
                .stream()
                .filter(key -> key.equals(code))
                .findFirst();
    }
}
