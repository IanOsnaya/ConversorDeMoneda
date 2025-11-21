import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        CurrencyApiClient client = new CurrencyApiClient();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        System.out.println("Por favor ingrese la conversion que quiere realizar: ");
        Scanner telcado = new Scanner(System.in);
        String menu = ("""
                ****************************************
                1.- Dolares a Pesos Mexicanos
                2.- Pesos Mexicanos a Dong Vietnamita
                3.- Pesos Mexicanos a Yen Japones
                4.-Don Vietnamita a Yen Japones
                5.- Euros a Pesos Mexicanos
                6.- Euros a Dong Vietnamita
                7.- Dolares a Yen Japones
                8. Salir
                ****************************************
                 """);

        int opcion = 0;

      while (opcion != 8) {
          System.out.println(menu);
          opcion = telcado.nextInt();
          switch (opcion) {
              case 1: {
                  String base = "USD";
                  String objetivo = "MXN";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 2: {
                  String base = "MXN";
                  String objetivo = "VND";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 3: {
                  String base = "MXN";
                  String objetivo = "JPY";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 4: {
                  String base = "VND";
                  String objetivo = "JPY";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 5: {
                  String base = "EUR";
                  String objetivo = "MXN";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 6: {
                  String base = "EUR";
                  String objetivo = "VND";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 7: {
                  String base = "USD";
                  String objetivo = "JPY";
                  String jsonResponse = client.getExchangeRates(base);
                  ExchangeRateResponse dataConversion = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
                  Map<String, Double> tasas = dataConversion.getConversion_rates();
                  Double tasa = tasas.get(objetivo);
                  System.out.println("Ingresa el monto a convertir: ");
                  double moneda = telcado.nextDouble();
                  double monto = moneda * tasa;
                  System.out.println("El monto es de: $" + monto + " " + objetivo);
                  break;
              }
              case 8: {
                  System.out.println("Gracias por usar el conversor de moneda, que tenga un excelente dia.");
                  break;
              }
              default:{
                  System.out.println("Opcion no valida, intente de nuevo.");
              }
          }
      }
    }
}
