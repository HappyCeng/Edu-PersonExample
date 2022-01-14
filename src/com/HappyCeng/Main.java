package com.HappyCeng;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.BusCard;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;
import com.HappyCeng.Manager.ProcessVM;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProcessResult result = new ProcessResult();
        ProcessVM processVM = new ProcessVM();
        Person person = new Person();
        Person person1 = new Person();
        Bank bank = new Bank();
        BusCard busCard = new BusCard();

        person.setId(1);
        person.setAd("Mustafa");
        person.setSoyad("Mutlu");
        person.setTckn("12313131");

        result = processVM.kisiEkle(person);

        /*Person gizem = new Person();
        gizem.setId(2);
        gizem.setAd("Gizem");
        gizem.setSoyad("Yıldırım");
        gizem.setTckn("12313131");
        gizem.setAnneAd("Sengül");
        gizem.setBabaAd("Selahattin");

        result = processVM.kisiEkle(gizem);*/

        /*
        Bankayı oluşturmak için bir kişiy ihtiyaç var. Bu yüzden biz kişi objesiyle birlikte bank objesini gönderriyoruz.
        Burada alternatif olarak biz PersonId yi tek bir parametre olarak da gönderebilirdik.
        * */

        bank.setBankId(1);
        bank.setHesapAdi("Deneme Hesabı");
        bank.setBakiye(1000);
        result = processVM.bankaHesapEkle(person, bank);

        busCard.setBusCardId(1);
        busCard.setBusCardName("Deneme Kartı");
        busCard.setBusCardBakiye(1000);
        result = processVM.otobusKartEkle(person, busCard);

        person1 = processVM.getPersonInfo(1);

        System.out.println(person1.getId() + person1.getAd() + person1.getSoyad());

    }
}
