package br.com.jpa.entity;

import java.util.Calendar;

public class Payment {

	private int paymentCod;
	private Calendar paymentDate;
	private float paymentValue;
	private PaymentForm paymentForm;

	public int getPaymentCod() {
		return paymentCod;
	}
	public void setPaymentCod(int paymentCod) {
		this.paymentCod = paymentCod;
	}
	public Calendar getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
	}
	public float getPaymentValue() {
		return paymentValue;
	}
	public void setPaymentValue(float paymentValue) {
		this.paymentValue = paymentValue;
	}
	public PaymentForm getPaymentForm() {
		return paymentForm;
	}
	public void setPaymentForm(PaymentForm paymentForm) {
		this.paymentForm = paymentForm;
	}

	


}
