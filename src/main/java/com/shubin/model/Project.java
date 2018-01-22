package com.shubin.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "PROJECT")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rating", nullable = false)
    private Long rating;

    @Column(name = "description", length = 65535)
    private String description;

    @CreationTimestamp
    @Column(name="created_at", columnDefinition = "TIMESTAMP")
    private Instant created_at;

    @UpdateTimestamp
    @Column(name="updated_at", columnDefinition = "TIMESTAMP")
    private Instant udpated_at;

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public Instant getUdpated_at() {
        return udpated_at;
    }

    public void setUdpated_at(Instant udpated_at) {
        this.udpated_at = udpated_at;
    }
}
