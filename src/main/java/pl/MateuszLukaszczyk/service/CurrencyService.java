package pl.MateuszLukaszczyk.service;

import java.util.Map;
import java.util.Optional;

import org.graalvm.compiler.api.replacements.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import pl.MateuszLukaszczyk.Exceptions.ApiRequestException;
import pl.MateuszLukaszczyk.Model.Currency;

public class CurrencyService {

    @Autowired
    Currency currency;

    public Double getDoubleResponseEntity(String code) {
        final Map<String, Double> curencyMap = currency.getCurrencyMap();
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
