package br.com.conversordemoeda.conversormoeda.service;

import java.util.Map;

public class MoedaResponse {
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }


}
