package com.bank.app.accounts;

public class BankaHesabi {
	private String iban;
	private double bakiye;
	
	public BankaHesabi(double bakiye){
		this.bakiye=bakiye;
		//random iban
		iban="TR"+((long)(Math.random()*Math.pow(10,13)));}
	
	public String toString(){
		return "iban:"+iban+" bakiye:"+bakiye;}
		
		//getter
		public String getIban(){
			return iban;}
		public double getBakiye(){
			return bakiye;}
		//setter
		public void setIban(String iban){
			this.iban=iban;}
		public void setBakiye(double bakiye){
			this.bakiye=bakiye;}
}