package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;
public class VadesizHesap extends BankaHesabi{
	private String hesapTürü;
	public VadesizHesap(double bakiye){
		super(bakiye);
		this.hesapTürü="vadesiz";}
	public void paraTransferi(BankaHesabi aliciHesap,BankaHesabi gonderenHesap,double miktar){
		gonderenHesap.setBakiye(gonderenHesap.getBakiye()-miktar);
            aliciHesap.setBakiye(aliciHesap.getBakiye()+miktar);}
	//borç ödenince güncel borç ve kullanılabilir limit de güncellendi
	public void krediKartiBorcOdeme(KrediKarti kart,double miktar){
		this.setBakiye(this.getBakiye()-miktar);
		kart.setGuncelBorc(kart.getGuncelBorc()-miktar);
		kart.setKullanilabilirLimit(kart.getKullanilabilirLimit()+miktar);}
		public String toString() {
        return super.toString() + ", Hesap türü: "+hesapTürü;}

		//getter
		public String getHesapTürü() {
			return hesapTürü;}
		//setter
		public void setHesapTürü(String hesapTürü){
			this.hesapTürü=hesapTürü;}	
}