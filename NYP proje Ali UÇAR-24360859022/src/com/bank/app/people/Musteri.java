package com.bank.app.people;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import java.util.ArrayList;
public class Musteri extends Kisi {
	private String musteriNumarasi;
	private ArrayList<BankaHesabi> hesaplar=new ArrayList<BankaHesabi>();
	private ArrayList<KrediKarti> krediKartlari= new ArrayList<KrediKarti>();
	public Musteri(String ad,String soyad,String email,int telefonNumarasi){
		super(ad, soyad, email, telefonNumarasi);
		//random müşteri no
		musteriNumarasi=((long)(Math.random()*Math.pow(10,13)))+"";}
		public void hesapEkle(String hesapTuru){
		if(hesapTuru.equals("Vadesiz")){
			hesaplar.add(new VadesizHesap(0.0));}
		else if(hesapTuru.equals("Yatirim")){
			hesaplar.add(new YatirimHesabi(0.0));}
		else{
			System.out.println("Geçersiz hesap türü");}}
		public void krediKartiEkle(double limit){
			KrediKarti yeniKart = new KrediKarti(limit,0.0);
			krediKartlari.add(yeniKart);}
		public void hesapSil(BankaHesabi hesap){
			if (hesap.getBakiye()>0) {
				System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");}
			else{	
				hesaplar.remove(hesap);}}
		public void krediKartiSil(KrediKarti kart){
			if(kart.getGuncelBorc()>0){
				System.out.println("Lütfen öncelikle borç ödemesi yapınız");}
			else{
			krediKartlari.remove(kart);}}
		public String toString() {
			return super.toString()+" müşteri no:"+musteriNumarasi+" hesap sayısı:"+hesaplar.size()+" kredi kartı sayısı:"+krediKartlari.size();}
		//getter
		public String getMusteriNumarasi(){
			return musteriNumarasi;}
		public ArrayList<BankaHesabi> getHesaplar(){
			return hesaplar;}
		public ArrayList<KrediKarti> getKrediKartlari(){
			return krediKartlari;}
		//setter
		public void setMusteriNumarasi(String musteriNumarasi){
		this.musteriNumarasi=musteriNumarasi;}
		public void setHesaplar(ArrayList<BankaHesabi> hesaplar){ 
		this.hesaplar=hesaplar;}
		public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari){ 
		this.krediKartlari = krediKartlari;}


		}
