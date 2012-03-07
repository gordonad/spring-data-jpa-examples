package org.springframework.data.jpa.example.repository;

import org.springframework.data.jpa.example.domain.User;

import java.util.List;


/**
 * Interface for repository functionality that ought to be implemented manually.
 *
 * @author Oliver Gierke
 */
interface UserRepositoryCustom {

    /**
     * Custom repository operation.
     *
     * @return User List
     */
    List<User> myCustomBatchOperation();
}
