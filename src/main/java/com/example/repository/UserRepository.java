/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.UserDo;

/**
 * @author Harry.Lee
 *
 */
public interface UserRepository extends JpaRepository<UserDo, Long> {

}