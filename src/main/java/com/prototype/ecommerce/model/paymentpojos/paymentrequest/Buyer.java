/*
 * PayU Latam - Copyright (c) 2013 - 2020
 * http://www.payu.com.co
 */
package com.prototype.ecommerce.model.paymentpojos.paymentrequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

/**
 * POJO of a buyer for a Payu payment request.
 *
 * @author Nicolas Garcia (nicolas.garcia@payulatam.com)
 * @version 1.0
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"merchantBuyerId",
		"fullName",
		"emailAddress",
		"contactPhone",
		"dniNumber",
		"shippingAddress"
})
public class Buyer implements Serializable {

	/**
	 * Serializable class  version number
	 */
	private static final long serialVersionUID = 1369164545871014928L;

	/**
	 * Buyer id.
	 */
	@JsonProperty("merchantBuyerId")
	private String merchantBuyerId;

	/**
	 * Buyer full name.
	 */
	@JsonProperty("fullName")
	private String fullName;

	/**
	 * Email.
	 */
	@JsonProperty("emailAddress")
	private String emailAddress;

	/**
	 * Contact phone number.
	 */
	@JsonProperty("contactPhone")
	private String contactPhone;

	/**
	 * Dni number.
	 */
	@JsonProperty("dniNumber")
	private String dniNumber;

	/**
	 * Shipping address of the product.
	 */
	@JsonProperty("shippingAddress")
	private PaymentAddress shippingPaymentAddress;

	/**
	 * No args constructor for use in serialization
	 */
	public Buyer() {

	}

	/**
	 * @param dniNumber              DNI number of the buyer.
	 * @param emailAddress           email of the buyer.
	 * @param merchantBuyerId        Identification number in the system for the buyer.
	 * @param fullName               Full name of the buyer.
	 * @param shippingPaymentAddress Shipping address for the product.
	 * @param contactPhone           Phone number of the buyer.
	 */
	public Buyer(String merchantBuyerId, String fullName, String emailAddress, String contactPhone, String dniNumber,
			PaymentAddress shippingPaymentAddress) {

		super();
		this.merchantBuyerId = merchantBuyerId;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.contactPhone = contactPhone;
		this.dniNumber = dniNumber;
		this.shippingPaymentAddress = shippingPaymentAddress;
	}

	@JsonProperty("merchantBuyerId")
	public String getMerchantBuyerId() {

		return merchantBuyerId;
	}

	@JsonProperty("merchantBuyerId")
	public void setMerchantBuyerId(String merchantBuyerId) {

		this.merchantBuyerId = merchantBuyerId;
	}

	@JsonProperty("fullName")
	public String getFullName() {

		return fullName;
	}

	@JsonProperty("fullName")
	public void setFullName(String fullName) {

		this.fullName = fullName;
	}

	@JsonProperty("emailAddress")
	public String getEmailAddress() {

		return emailAddress;
	}

	@JsonProperty("emailAddress")
	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;
	}

	@JsonProperty("contactPhone")
	public String getContactPhone() {

		return contactPhone;
	}

	@JsonProperty("contactPhone")
	public void setContactPhone(String contactPhone) {

		this.contactPhone = contactPhone;
	}

	@JsonProperty("dniNumber")
	public String getDniNumber() {

		return dniNumber;
	}

	@JsonProperty("dniNumber")
	public void setDniNumber(String dniNumber) {

		this.dniNumber = dniNumber;
	}

	@JsonProperty("shippingAddress")
	public PaymentAddress getShippingPaymentAddress() {

		return shippingPaymentAddress;
	}

	@JsonProperty("shippingAddress")
	public void setShippingPaymentAddress(PaymentAddress shippingPaymentAddress) {

		this.shippingPaymentAddress = shippingPaymentAddress;
	}

	@Override public String toString() {

		return "Buyer{" +
				"merchantBuyerId='" + merchantBuyerId + '\'' +
				", fullName='" + fullName + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", contactPhone='" + contactPhone + '\'' +
				", dniNumber='" + dniNumber + '\'' +
				", shippingAddress=" + shippingPaymentAddress +
				'}';
	}
}
