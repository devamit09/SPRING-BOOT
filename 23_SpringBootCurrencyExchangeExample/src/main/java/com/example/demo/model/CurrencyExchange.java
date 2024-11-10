package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CurrencyExchange {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String from1;
	
	private String to1;
	
	private float rate1;
	
	private int quantity;
	
	@Transient
	private double totalAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom1() {
		return from1;
	}

	public void setFrom1(String from1) {
		this.from1 = from1;
	}

	public String getTo1() {
		return to1;
	}

	public void setTo1(String to1) {
		this.to1 = to1;
	}

	public float getRate1() {
		return rate1;
	}

	public void setRate1(float rate1) {
		this.rate1 = rate1;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from1=" + from1 + ", to1=" + to1 + ", rate1=" + rate1 + ", quantity="
				+ quantity + ", totalAmount=" + totalAmount + "]";
	}

	

	
	

}
