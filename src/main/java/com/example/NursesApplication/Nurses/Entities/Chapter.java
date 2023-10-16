package com.example.NursesApplication.Nurses.Entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_chapter")

public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @Embedded
    private MemberList members;

    public Chapter() {
    }

    public Chapter(Long id, String name, Association association, MemberList members) {
        this.id = id;
        this.name = name;
        this.association = association;
        this.members = members;
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

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public MemberList getMembers() {
        return members;
    }

    public void setMembers(MemberList members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(id, chapter.id) && Objects.equals(name, chapter.name) && Objects.equals(association, chapter.association) && Objects.equals(members, chapter.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, association, members);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", association=" + association +
                ", members=" + members +
                '}';
    }
}
