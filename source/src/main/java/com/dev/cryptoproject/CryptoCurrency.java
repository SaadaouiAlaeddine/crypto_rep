package com.dev.cryptoproject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoCurrency implements Serializable {


    @JsonProperty("price_usd")
    String price_usd;
    @JsonProperty("market_cap_usd")
    String market_cap_usd;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CryptoCurrency{");
        sb.append(", price_usd=").append(price_usd);
        sb.append(", market_cap_usd=").append(market_cap_usd);
        sb.append('}');
        return sb.toString();
    }


    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }
    public String getPrice_usd() {
        return price_usd;
    }

    public String getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }
}
