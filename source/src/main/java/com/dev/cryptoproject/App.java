package com.dev.cryptoproject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @Author: Alaeddine Saadaoui
 * @ProjectName: Cryptocurrency project
 *
 */
public class App
{
    private static final String apiURL="https://api.coinmarketcap.com/v1/ticker/";
    public static void processCryptoCurrencyName(String cryptoName)
    {
        String cryptoServiceEndpoint=apiURL+cryptoName+"/";
        Client client=ClientBuilder.newClient();;
        WebTarget target=client.target(cryptoServiceEndpoint);;
        Response response=target.request(MediaType.APPLICATION_JSON).get();
        if(response.getStatus()!=Response.Status.OK.getStatusCode())
        {
            System.out.println("the provided crypto-currency does not exist");
        }
        else
        {
            List<CryptoCurrency> cryptList=response.readEntity(new GenericType<ArrayList<CryptoCurrency>>(){});
            System.out.println("The provided crypto-currency: "+cryptoName);
            System.out.println("Price(USD): $"+cryptList.get(0).getPrice_usd());
            System.out.println("Market Cap (USD): $"+cryptList.get(0).getMarket_cap_usd());
        }

        response.close();
        client.close();

    }
    public static void main( String[] args )
    {
        if(args.length!=1||(args.length==1&&args[0].equals("default")))
          System.out.println( "Usage: docker run -rm cryptoapp [crypto-currency name]" );
        else
            processCryptoCurrencyName(args[0]);
    }
}
