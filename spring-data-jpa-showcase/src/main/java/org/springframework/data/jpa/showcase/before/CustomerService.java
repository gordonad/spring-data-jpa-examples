package org.springframework.data.jpa.showcase.before;

import org.springframework.data.jpa.showcase.core.Customer;

import java.util.List;


/**
 * Service interface for {@link Customer}s.
 * 
 * @author Oliver Gierke
 */
public interface CustomerService {

    /**
     * Returns the {@link Customer} with the given id or {@literal null} if no
     * {@link Customer} with the given id was found.
     * 
     * @param id Long
     * @return Customer
     */
    Customer findById(Long id);


    /**
     * Saves the given {@link Customer}.
     * 
     * @param customer Customer
     * @return Customer
     */
    Customer save(Customer customer);


    /**
     * Returns all customers.
     * 
     * @return Customer List
     */
    List<Customer> findAll();


    /**
     * Returns the page of {@link Customer}s with the given index of the given
     * size.
     * 
     * @param page int
     * @param pageSize int
     * @return Customer List
     */
    List<Customer> findAll(int page, int pageSize);


    /**
     * Returns the page of {@link Customer}s with the given lastname and the
     * given page index and page size.
     * 
     * @param lastname String
     * @param page int
     * @param pageSize int
     * @return Customer List
     */
    List<Customer> findByLastname(String lastname, int page, int pageSize);
}
