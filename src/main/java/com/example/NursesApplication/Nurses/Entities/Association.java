package com.example.NursesApplication.Nurses.Entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_association")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;

    @OneToOne
    private Member president;

    @OneToMany(mappedBy = "association")
    private List<Chapter> chapters;


    public Association() {
    }

    public Association(Long id, String name, String district, Member president, List<Chapter> chapters) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.president = president;
        this.chapters = chapters;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Association that = (Association) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(district, that.district) && Objects.equals(president, that.president) && Objects.equals(chapters, that.chapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, president, chapters);
    }

    @Override
    public String toString() {
        return "Association{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", chapters=" + chapters +
                '}';
    }
}
