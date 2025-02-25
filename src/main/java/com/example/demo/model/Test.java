package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String language;

    @ManyToOne
    @JoinColumn(name = "administrator_id")
    private Administrateur administrator;

    @ManyToOne
    @JoinColumn(name = "domaine_id")
    private Theme domaine;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToMany
    @JoinTable(name = "test_competency", joinColumns = @JoinColumn(name = "test_id"), inverseJoinColumns = @JoinColumn(name = "competency_id"))
    private List<Competency> competencies;

    @ManyToMany
    @JoinTable(name = "candidate_test", joinColumns = @JoinColumn(name = "test_id"), inverseJoinColumns = @JoinColumn(name = "candidate_id"))
    private List<Condidats> candidates;

    // getters and setters
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Administrateur getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrateur administrator) {
        this.administrator = administrator;
    }

    public Theme getDomaine() {
        return domaine;
    }

    public void setDomaine(Theme domaine) {
        this.domaine = domaine;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Competency> getCompetencies() {
        return competencies;
    }

    public void setCompetencies(List<Competency> competencies) {
        this.competencies = competencies;
    }

    public List<Condidats> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Condidats> candidates) {
        this.candidates = candidates;
    }
}
