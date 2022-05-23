Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Select random product from app and add to the basket
-----------------------------------------------
* "3" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" Id'li elemente tıkla
* "2" kadar bekle
* "//*[@text='Mağaza']" xpath'li elementi bul ve "Mağaza" degerini iceriyor mu kontrol et
* "2" kadar bekle
* "//*[@text='Kategoriler']" xpath'li elemente tıkla
* "2" kadar bekle
* "//*[@text='Markalar']" xpath'li elementi bul ve "Markalar" degerini iceriyor mu kontrol et
* "2" kadar bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][2]" xpath'li elemente tıkla
* "2" kadar bekle
* "//*[@text='Pantolon']" xpath'li elemente tıkla
* "2" kadar bekle
* Sayfayı aşağı doğru kaydır
* "2" kadar bekle
* Sayfayı aşağı doğru kaydır
* "2" kadar bekle
* Rastgele product secimi yap
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/imgFav" Id'li elemente tıkla
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/btnLogin" Id'li elementi bul ve "Giriş Yap" degerini iceriyor mu kontrol et
* "2" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etEposta" Id'li elemente "batuhanaci@hotmail.com" değerini yaz
*"2" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etPassword" Id'li elemente "abcd1234" değerini yaz
*"2" kadar bekle
*Geri Butonuna Tıkla
*"2" kadar bekle
*Geri Butonuna Tıkla
*"2" kadar bekle
*Rastgele product secimi yap
*"2" kadar bekle
*Rastgele beden secimi yap
*"2" kadar bekle
*"//*[@text='SEPETE EKLE']" xpath'li elemente tıkla
*"2" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etEposta" Email gir
*"2" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etPassword" Sifre gir
*"2" kadar bekle
*"com.ozdilek.ozdilekteyim:id/btnLogin" Id'li elemente tıkla
*"3" kadar bekle
