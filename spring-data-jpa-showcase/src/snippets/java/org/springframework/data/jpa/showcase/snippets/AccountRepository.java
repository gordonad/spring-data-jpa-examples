package org.springframework.data.jpa.showcase.snippets;

import org.springframework.data.jpa.showcase.core.Account;
import org.springframework.data.jpa.showcase.core.Customer;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository to manage {@link Account} instances.
 *
 * @author Oliver Gierke
 */
public interface AccountRepository extends CrudRepository<Account, Long>, AccountRepositoryCustom,
        QueryDslPredicateExecutor<Account> {

    /**
     * Returns all accounts belonging to the given {@link Customer}.
     *
     * @param customer Customer
     * @return Account List
     */
    List<Account> findByCustomer(Customer customer);
}
