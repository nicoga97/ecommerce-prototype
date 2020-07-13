
package com.prototype.ecommerce.model.paymentpojos.refundrequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "apiKey",
        "apiLogin"
})
public class RefundMerchant implements Serializable {

    private final static long serialVersionUID = 1922099477006501024L;

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("apiLogin")
    private String apiLogin;

    /**
     * No args constructor for use in serialization
     */
    public RefundMerchant() {

    }

    /**
     * @param apiKey
     * @param apiLogin
     */
    public RefundMerchant(String apiKey, String apiLogin) {

        super();
        this.apiKey = apiKey;
        this.apiLogin = apiLogin;
    }

    @JsonProperty("apiKey")
    public String getApiKey() {

        return apiKey;
    }

    @JsonProperty("apiKey")
    public void setApiKey(String apiKey) {

        this.apiKey = apiKey;
    }

    @JsonProperty("apiLogin")
    public String getApiLogin() {

        return apiLogin;
    }

    @JsonProperty("apiLogin")
    public void setApiLogin(String apiLogin) {

        this.apiLogin = apiLogin;
    }

    @Override
    public String toString() {

        return new ToStringBuilder(this).append("apiKey", apiKey).append("apiLogin", apiLogin).toString();
    }

}