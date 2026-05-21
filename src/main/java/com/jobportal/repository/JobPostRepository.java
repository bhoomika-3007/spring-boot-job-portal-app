package com.jobportal.repository;

import com.jobportal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface JobPostRepository extends JpaRepository<JobPost, Long> {

    @Query("SELECT j FROM JobPost j WHERE " +
           "LOWER(j.profile) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.technologies) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<JobPost> findByKeyword(@Param("keyword") String keyword);
}