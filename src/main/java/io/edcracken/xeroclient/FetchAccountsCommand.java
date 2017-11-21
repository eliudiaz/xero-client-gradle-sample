package io.edcracken.xeroclient;

import com.xero.api.XeroClient;
import com.xero.model.Account;
import com.xero.model.ManualJournal;
import io.edcracken.xeroclient.utils.FlipTableConverters;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class FetchAccountsCommand implements CommandLineRunner {

    private final XeroClient client;

    @Override
    public void run(String... args) throws Exception {

        List<Account> accounts = client.getAccounts();
        log.info("Journals: ");
        System.out.println(FlipTableConverters.fromIterable(client.getManualJournals(), ManualJournal.class));
        log.info("Accounts: ");
        System.out.println(FlipTableConverters
                .fromIterable(accounts, Account.class));

    }
}
