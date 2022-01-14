package com.HappyCeng.Manager;

import com.HappyCeng.Entity.Bank;
import com.HappyCeng.Entity.Person;
import com.HappyCeng.Entity.ProcessResult;

public class BankManager {

    public static ProcessResult addBank(Bank bank){ //file işleminin yapılması lazım. şuan eklenmiyor.
        ProcessResult result = new ProcessResult();
        FileProcess fileProcess = new FileProcess();

        String fileFormat = "";

        try {
            fileFormat = fileProcess.BankFormatGenerator(bank);
            result.setSuccess(true);
        } catch (Exception e){
            result.setSuccess(false);
            result.setResultMessage("Error 1002 : " + e);
        }

        return result;
    }
}
