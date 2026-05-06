package com.bank.app.people;
public class Kisi{
		private String ad,soyad,email;
		private int telefonNumarasi;
		
		public Kisi(String ad,String soyad,String email,int telefonNumarasi){
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.telefonNumarasi=telefonNumarasi;
		}
		public String toString(){
			return "ad:"+ad+" soyad:"+soyad+" email:"+email+" telefon no:"+telefonNumarasi;
			}
			//getter
		public String getAd() {
			return ad;}
		public String getSoyad(){
			return soyad;}
		public String getEmail(){
			return email;}
		public int getTelNo(){
			return telefonNumarasi;}
			//setter
		public void setAd(String ad) {
			this.ad=ad;}
		public void setSoyad(String soyad){
			this.soyad=soyad;}
		public void setEmail(String email){
			this.email=email;}
		public void setTelNo(int telefonNumarasi){
			this.telefonNumarasi=telefonNumarasi;}	
			}
