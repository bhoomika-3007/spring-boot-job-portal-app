package com.jobportal.controller;

import com.jobportal.model.JobPost;
import com.jobportal.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class JobPostController {

    @Autowired
    private JobPostRepository repository;

    @GetMapping("/job-posts")
    public List<JobPost> getAllJobPosts() {
        return repository.findAll();
    }

    @GetMapping("/job-posts/{keyword}")
    public List<JobPost> searchJobPosts(@PathVariable String keyword) {
        return repository.findByKeyword(keyword);
    }

    @PostMapping("/create-job-post")
    public JobPost createJobPost(@RequestBody JobPost jobPost) {
        return repository.save(jobPost);
    }
}