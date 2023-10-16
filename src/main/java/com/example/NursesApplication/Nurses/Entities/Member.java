package com.example.NursesApplication.Nurses.Entities;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private memberStatus status;
    private Date renewal_date;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member() {
    }

    public Member(Long id, String name, memberStatus status, Date renewal_date, Chapter chapter) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewal_date = renewal_date;
        this.chapter = chapter;
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

    public memberStatus getStatus() {
        return status;
    }

    public void setStatus(memberStatus status) {
        this.status = status;
    }

    public Date getRenewal_date() {
        return renewal_date;
    }

    public void setRenewal_date(Date renewal_date) {
        this.renewal_date = renewal_date;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && status == member.status && Objects.equals(renewal_date, member.renewal_date) && Objects.equals(chapter, member.chapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, renewal_date, chapter);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", renewal_date=" + renewal_date +
                ", chapter=" + chapter +
                '}';
    }
}
