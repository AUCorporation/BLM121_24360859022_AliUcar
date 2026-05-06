package com.bank.app.cards;

public class KrediKarti {
	private String kartNumarasi;
	private double limit,guncelBorc,kullanilabilirLimit;
	public KrediKarti(double limit,double guncelBorc){
		kartNumarasi=((long)(Math.random()*Math.pow(10,13)))+"";
		this.limit=limit;
		this.guncelBorc=guncelBorc;
		//kullanılabilir limit limit ve borca göre ayarlandı
		this.kullanilabilirLimit=limit-guncelBorc;
	}
	public String toString(){
		return "kart no:"+kartNumarasi+" limit:"+limit+" güncel borç:"+guncelBorc+" kullanılabilir limit:"+kullanilabilirLimit;}
		//getter
		public String getKartNumarasi(){
			return kartNumarasi;}
		public double getLimit(){
			return limit;}
		public double getGuncelBorc(){
			return guncelBorc;}
		public double getKullanilabilirLimit(){
			return kullanilabilirLimit;}
		//setter
		public void setKartNumarasi(String kartNumarasi){
			this.kartNumarasi=kartNumarasi;}
		//limit değişirse kullanılabilir limit güncellenir
		public void setLimit(double limit){
			this.limit=limit;
			this.kullanilabilirLimit=this.limit-this.guncelBorc;}
		//borç değişirse kullanılabilir limit güncellenecek
		public void setGuncelBorc(double guncelBorc){
			this.guncelBorc=guncelBorc;
			this.kullanilabilirLimit=this.limit-this.guncelBorc;}
		public void setKullanilabilirLimit(double kullanilabilirLimit){
			this.kullanilabilirLimit=kullanilabilirLimit;}
			
}