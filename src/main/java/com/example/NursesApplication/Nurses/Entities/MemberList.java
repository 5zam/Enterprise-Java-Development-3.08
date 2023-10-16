package com.example.NursesApplication.Nurses.Entities;


import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Embeddable
public class MemberList {
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    public MemberList() {
    }

    public MemberList(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberList that = (MemberList) o;
        return Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members);
    }

    @Override
    public String toString() {
        return "MemberList{" +
                "members=" + members +
                '}';
    }
}
