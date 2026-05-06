package com.bank.app.main;

import com.bank.app.people.Musteri;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import com.bank.app.service.BankaService;

public class Main {
	public static void main(String[] args){
		BankaService banka=new BankaService();
			//kendi bilgilerimle yeni Musteri(numaram int e sığmadı kısalttım)
		Musteri musteri1 = new Musteri("Ali","Uçar","24360859022@ogr.btu.edu.tr",5523623);
			//kendime iki hesap tipinden birer hesap tanımladım
		musteri1.hesapEkle("Vadesiz");
        musteri1.hesapEkle("Yatirim");
        VadesizHesap vadesiz= (VadesizHesap) musteri1.getHesaplar().get(0);
        YatirimHesabi yatirim= (YatirimHesabi) musteri1.getHesaplar().get(1);
        //setBakiye metodu ile ilk bakiye verip para yatırdım
		vadesiz.setBakiye(5000.0);
		yatirim.paraEkle(2000.0);
		//para transferi
		vadesiz.paraTransferi(yatirim, vadesiz,1500.0);
		//yeni kredi kartı tanımladım
		musteri1.krediKartiEkle(10000.0);
		KrediKarti kredikart=musteri1.getKrediKartlari().get(0);
        kredikart.setGuncelBorc(2500.0);
        kredikart.setKullanilabilirLimit(7500.0);
        //özet
        banka.musteriOzetiGoster(musteri1);
        //borç ödeme
        vadesiz.krediKartiBorcOdeme(kredikart, 1000.0);
        //hesap silme
        musteri1.hesapSil(vadesiz);
        vadesiz.paraTransferi(yatirim, vadesiz, vadesiz.getBakiye());
        musteri1.hesapSil(vadesiz);
        //tekrar özet
        banka.musteriOzetiGoster(musteri1);
	}}