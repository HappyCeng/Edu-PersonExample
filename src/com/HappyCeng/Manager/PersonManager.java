package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

public class PersonManager {

    public static ProcessResult addPerson(Person person){
        ProcessResult result = new ProcessResult();
        FileProcess fileProcess = new FileProcess();

        String fileFormat = "";//denemekkjkjk

        try {
            fileFormat = fileProcess.PersonFormatGenerator(person);
            fileProcess.saveFilePerson(fileFormat);
            result.setSuccess(true);
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1002 : " + e);
        }

        return result;
    }

    public static Person getPerson(int id){ //buraya person id eklenecek ve kişiye göre sorgulama yapılacak.
        Person person = new Person();
        FileProcess fileProcess = new FileProcess();

        String personInfo; //"1#12313131#Mustafa#Mutlu#null#null#";
        int index = 0,index2 = 0;

        try{
            personInfo = fileProcess.readFilePerson(id);

            index = personInfo.indexOf("#");
            person.setId(Integer.parseInt(personInfo.substring(0,index)));
            index2 = personInfo.indexOf("#",index+1);
            person.setTckn(personInfo.substring(index+1,index2));
            index = personInfo.indexOf("#",index2+1);
            person.setAd(personInfo.substring(index2+1,index));
            index2 = personInfo.indexOf("#", index+1);
            person.setSoyad(personInfo.substring(index+1,index2));
            index = personInfo.indexOf("#",index2+1);
            person.setAnneAd(personInfo.substring(index2+1,index));
            index2 = personInfo.indexOf("#",index+1);
            person.setBabaAd(personInfo.substring(index+1, index2));

        } catch (Exception e){

        }

        return person;

    }

}
