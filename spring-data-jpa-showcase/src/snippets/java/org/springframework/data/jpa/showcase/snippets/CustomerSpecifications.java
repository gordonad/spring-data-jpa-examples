package org.springframework.data.jpa.showcase.snippets;

import org.joda.time.LocalDate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.showcase.core.Account;
import org.springframework.data.jpa.showcase.core.Customer;

import javax.persistence.criteria.*;
import java.util.Date;

/**
 * Collection of {@link Specification} implementations.
 *
 * @author Oliver Gierke
 */
public class CustomerSpecifications {

    /**
     * All customers with an {@link Account} expiring before the given date.
     *
     * @param date LocalDate
     * @return Customer Specification
     */
    public static Specification<Customer> accountExpiresBefore(final LocalDate date) {

        return new Specification<Customer>() {

            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                Root<Account> accounts = query.from(Account.class);
                Path<Date> expiryDate = accounts.<Date>get("expiryDate");
                Predicate customerIsAccountOwner = cb.equal(accounts.<Customer>get("customer"), root);
                Predicate accountExpiryDateBefore = cb.lessThan(expiryDate, date.toDateMidnight().toDate());

                return cb.and(customerIsAccountOwner, accountExpiryDateBefore);
            }
        };
    }
}
