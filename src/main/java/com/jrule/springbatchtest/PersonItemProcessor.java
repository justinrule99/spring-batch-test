package com.jrule.springbatchtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Account, Account> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    // takes acct, transforms into acct

    @Override
    public Account process(final Account account) throws Exception {
        final int accountNumber = account.getAccountNumber()+1;

        final Account transformedAccount = new Account(accountNumber);

        log.info("Converting (" + account + ") into (" + transformedAccount + ")");

        return transformedAccount;
    }

}