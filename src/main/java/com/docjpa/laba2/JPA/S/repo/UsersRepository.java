package com.docjpa.laba2.JPA.S.repo;


import com.docjpa.laba2.JPA.S.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.fsm_sub = :name group by u.id_user")
    User findByName(@Param("name") String name);
}
