
package com.prototype.ecommerce.model.paymentpojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "language",
        "command",
        "merchant",
        "transaction",
        "test"
})
public class Payment implements Serializable {

    private static final long serialVersionUID = 2642396999832998338L;

    @JsonProperty("language")
    private String language;

    @JsonProperty("command")
    private String command;

    @JsonProperty("merchant")
    private Merchant merchant;

    @JsonProperty("transaction")
    private Transaction transaction;

    @JsonProperty("test")
    private Boolean test;

    /**
     * No args constructor for use in serialization
     */
    public Payment() {

    }

    /**
     * @param test
     * @param merchant
     * @param language
     * @param command
     * @param transaction
     */
    public Payment(String language, String command, Merchant merchant, Transaction transaction, Boolean test) {

        super();
        this.language = language;
        this.command = command;
        this.merchant = merchant;
        this.transaction = transaction;
        this.test = test;
    }

    @JsonProperty("language")
    public String getLanguage() {

        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {

        this.language = language;
    }

    @JsonProperty("command")
    public String getCommand() {

        return command;
    }

    @JsonProperty("command")
    public void setCommand(String command) {

        this.command = command;
    }

    @JsonProperty("merchant")
    public Merchant getMerchant() {

        return merchant;
    }

    @JsonProperty("merchant")
    public void setMerchant(Merchant merchant) {

        this.merchant = merchant;
    }

    @JsonProperty("transaction")
    public Transaction getTransaction() {

        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {

        this.transaction = transaction;
    }

    @JsonProperty("test")
    public Boolean getTest() {

        return test;
    }

    @JsonProperty("test")
    public void setTest(Boolean test) {

        this.test = test;
    }

    @Override
    public String toString() {

        return new ToStringBuilder(this).append("language", language).append("command", command)
                .append("merchant", merchant).append("transaction", transaction).append("test", test).toString();
    }

}
