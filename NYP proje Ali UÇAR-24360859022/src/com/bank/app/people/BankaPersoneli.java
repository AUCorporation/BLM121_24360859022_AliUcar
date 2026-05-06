package com.bank.app.people;
import java.util.ArrayList;
public class BankaPersoneli extends Kisi {
	private String personelID;
	//Musteri leri alacak arraylist
	private ArrayList<Musteri> musteriler=new ArrayList<Musteri>();
	
	public BankaPersoneli(String ad,String soyad,String email,int telefonNumarasi){
		super(ad,soyad,email,telefonNumarasi);
		this.personelID=((long)(Math.random()*Math.pow(10,13)))+"";}
		public String toString(){
			return super.toString()+" personel id:"+personelID+" personelin musteri sayısı"+musteriler.size();}
		//getter
		public String getPersonelID(){
			return personelID;}
		public ArrayList<Musteri> getMusteriler(){
			return musteriler;}
		//setter
		public void setPersonelID(String personelID){
			this.personelID=personelID;}
		public void setMusteriler(ArrayList<Musteri> musteriler){
			this.musteriler=musteriler;}
}