package com.jobportal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "job_posts")
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String profile;

    @Column(length = 1000)
    private String description;

    private int experience;

    private String technologies;

    // Getters
    public Long getId() { return id; }
    public String getProfile() { return profile; }
    public String getDescription() { return description; }
    public int getExperience() { return experience; }
    public String getTechnologies() { return technologies; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setProfile(String profile) { this.profile = profile; }
    public void setDescription(String description) { this.description = description; }
    public void setExperience(int experience) { this.experience = experience; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }
}
