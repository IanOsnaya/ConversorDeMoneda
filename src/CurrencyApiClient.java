import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyApiClient {

   public String getExchangeRates(String baseCurrency)
   {
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/e15c1dd061dfcfba2a711665/latest/" + baseCurrency)).build();
       HttpResponse<String> response = null;

           try {
               response = client.send(request, HttpResponse.BodyHandlers.ofString());
           } catch (IOException | InterruptedException e) {
               throw new RuntimeException(e);
           }
    return   response.body();
   }

}
