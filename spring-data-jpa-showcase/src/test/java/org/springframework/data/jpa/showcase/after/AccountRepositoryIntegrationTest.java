package org.springframework.data.jpa.showcase.after;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.showcase.core.AbstractShowcaseTest;
import org.springframework.data.jpa.showcase.core.Account;
import org.springframework.data.jpa.showcase.core.Customer;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * @author Oliver Gierke
 */
@ContextConfiguration("classpath:application-context-after.xml")
public class AccountRepositoryIntegrationTest extends AbstractShowcaseTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void findsCustomersAccounts() {

        Customer customer = customerRepository.findOne(1L);
        List<Account> accounts = accountRepository.findByCustomer(customer);

        assertFalse(accounts.isEmpty());
        assertThat(accounts.get(0).getCustomer(), is(customer));
    }
}
