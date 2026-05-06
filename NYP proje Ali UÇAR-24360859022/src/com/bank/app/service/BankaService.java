package com.bank.app.service;

import com.bank.app.people.Musteri;
import com.bank.app.accounts.BankaHesabi;
import com.bank.app.cards.KrediKarti;
//çıktılar bu formatlarda olacak
public class BankaService{
	public void musteriOzetiGoster(Musteri musteri) {
		System.out.println("Müşteri Özeti:\n"+musteri.toString()+"\nHesaplar:");
		for(BankaHesabi hesap : musteri.getHesaplar()) {
            System.out.println(" - " + hesap.toString());}
        System.out.println("Kredi Kartları:");
        for(KrediKarti kart : musteri.getKrediKartlari()) {
            System.out.println(" - " + kart.toString());}}}