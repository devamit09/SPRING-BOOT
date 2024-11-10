package com.example.demo.model;

public class BankDetails {

	private int accountNo;

	private String accHolderName;

	private int adharCardNo;

	private String panCardNo;

	private int amount;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getAdharCardNo() {
		return adharCardNo;
	}

	public void setAdharCardNo(int adharCardNo) {
		this.adharCardNo = adharCardNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankDetails [accountNo=" + accountNo + ", accHolderName=" + accHolderName + ", adharCardNo="
				+ adharCardNo + ", panCardNo=" + panCardNo + ", amount=" + amount + "]";
	}

}
