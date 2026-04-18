package com.backend.jobportal.spring_boot_job_portal_app.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhoomika.jobportal.spring_boot_job_portal_app.model.JobPostModel;

public interface JobPostRepository extends MongoRepository<JobPostModel, String> {
}
