package com.docjpa.laba2.JPA.S.repo;

import com.docjpa.laba2.JPA.S.models.ListDocs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ListDocRepository extends JpaRepository<ListDocs, Integer> {
    @Query("select u from ListDocs u where u.author.id_user = :id group by u.author.id_user, u.author.fsm_sub")
    ListDocs findByName(@Param("id") int id); //create list or users query

}
