package com.piggyBank.piggyBank.controllers;

import com.piggyBank.piggyBank.api.PiggyBankServices;
import com.piggyBank.piggyBank.bussines.CoinRules;
import com.piggyBank.piggyBank.domain.Coin;
import com.piggyBank.piggyBank.repository.PiggyBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PiggyBankController implements PiggyBankServices {

    @Autowired
    private PiggyBankRepository piggyBankRepository;
    @Autowired
    private CoinRules coinRules;

    @Override
    public void insertCoinIntoPiggy(Coin coin){
        coinRules.validateValueOfCoin(coin.getValue());
        piggyBankRepository.insertCoin(coin);
    }

    @Override
    public int totalNumberOfCoins(){
        return piggyBankRepository.getTotalCountCoins();
    }

    @Override
    public int numberOfCoinsByValue(int value){
        coinRules.validateValueOfCoin(value);
        return piggyBankRepository.getTotalCountCoinsByValue(value);
    }
}
