package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi{
	private String hesapTürü;
	
	public YatirimHesabi(double bakiye){
		super(bakiye);
		this.hesapTürü="yatırım";}
	public void paraEkle(double miktar){
		this.setBakiye(this.getBakiye()+miktar);}
	public void paraCek(double miktar){
		this.setBakiye(this.getBakiye()-miktar);}
		
		public String toString(){
			return super.toString()+" hesap türü:"+hesapTürü;}
		
		
		//getter
		public String getHesapTürü() {
			return hesapTürü;}
		//setter
		public void setHesapTürü(String hesapTürü){
			this.hesapTürü=hesapTürü;}
}