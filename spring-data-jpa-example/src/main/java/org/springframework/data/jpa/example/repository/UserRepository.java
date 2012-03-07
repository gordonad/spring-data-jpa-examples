package org.springframework.data.jpa.example.repository;

import org.springframework.data.jpa.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Repository interface for {@link User} instances. Provides basic CRUD operations due
 * to the extension of {@link JpaRepository}. Includes custom implemented
 * functionality by extending {@link UserRepositoryCustom}.
 *
 * @author Oliver Gierke
 */
public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {

    /**
     * Find the user with the given username. This method will be translated
     * into a query using the {@link javax.persistence.NamedQuery} annotation at
     * the {@link User} class.
     *
     * @param username
     * @return User
     */
    User findByTheUsersName(String username);


    /**
     * Find all users with the given lastname. This method will be translated
     * into a query by constructing it directly from the method name as there is
     * no other query declared.
     *
     * @param lastname String
     * @return User List
     */
    List<User> findByLastname(String lastname);


    /**
     * Returns all users with the given firstname. This method will be
     * translated into a query using the one declared in the {@link Query}
     * annotation declared one.
     *
     * @param firstname String
     * @return User List
     */
    @Query("select u from User u where u.firstname = ?")
    List<User> findByFirstname(String firstname);
}
