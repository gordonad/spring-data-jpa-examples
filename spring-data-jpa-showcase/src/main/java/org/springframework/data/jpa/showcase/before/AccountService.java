package org.springframework.data.jpa.showcase.before;

import org.springframework.data.jpa.showcase.core.Account;
import org.springframework.data.jpa.showcase.core.Customer;

import java.util.List;


/**
 * Service interface for {@link Account}s.
 * 
 * @author Oliver Gierke
 */
public interface AccountService {

    /**
     * Saves the given {@link Account}.
     * 
     * @param account Account
     * @return Account
     */
    Account save(Account account);


    /**
     * Returns all {@link Account}s of the given {@link Customer}.
     * 
     * @param customer Customer
     * @return Account List
     */
    List<Account> findByCustomer(Customer customer);
}
