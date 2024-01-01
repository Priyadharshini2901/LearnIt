package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Signup;


@Repository
public interface SignupRep extends JpaRepository<Signup,String>

{
	Signup findByUsername(String username);

}
