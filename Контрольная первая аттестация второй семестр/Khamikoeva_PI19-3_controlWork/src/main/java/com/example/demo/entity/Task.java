package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate completionDate;
    private boolean factOfExecution;
    private LocalDate dateOfCreation;
    private LocalDate updateDate;

    public Task(){}

    public Task(String name, String description, LocalDate completionDate, boolean factOfExecution, LocalDate dateOfCreation, LocalDate updateDate) {
        this.name = name;
        this.description = description;
        this.completionDate = completionDate;
        this.factOfExecution = factOfExecution;
        this.dateOfCreation = dateOfCreation;
        this.updateDate = updateDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public boolean isFactOfExecution() {
        return factOfExecution;
    }

    public void setFactOfExecution(boolean factOfExecution) {
        this.factOfExecution = factOfExecution;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToMany
    @JoinTable(name = "taskToCategory",
            joinColumns = @JoinColumn(name = "task_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")
    )
    private Set<Category> categories;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", completionDate=" + completionDate +
                ", factOfExecution=" + factOfExecution +
                ", dateOfCreation=" + dateOfCreation +
                ", updateDate=" + updateDate +
                ", user=" + user +
                ", categories=" + categories +
                '}';
    }
}
