package com.backend.jobportal.spring_boot_job_portal_app.interfaces;
import java.util.List;

import com.bhoomika.jobportal.spring_boot_job_portal_app.model.JobPostModel;

public interface SearchRepository {
    List<JobPostModel> findByText(String text);
}
