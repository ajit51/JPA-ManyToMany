package com.example.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByFeeLessThan(double fee);

}
