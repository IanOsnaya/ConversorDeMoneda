import java.util.Map;

public class ExchangeRateResponse {

    String results;
    String base_code;
    Map<String, Double> conversion_rates;

    public ExchangeRateResponse(String baseCode, String results, Map<String, Double> conversion_rate) {
        this.base_code = baseCode;
        this.results = results;
        this.conversion_rates = conversion_rate;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
