package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
	
	//jpql
	@Query("SELECT c FROM Course c WHERE c.description LIKE CONCAT(:prefix, '%')")
    List<Course> findByDescriptionStartingWith(@Param("prefix") String prefix);

    @Query("SELECT c FROM Course c WHERE c.description LIKE CONCAT('%', :suffix)")
    List<Course> findByDescriptionEndingWith(@Param("suffix") String suffix);

}
