package com.example.Event.Management.application.event.Entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tbl_guests")
public class Guest {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="name",column=@Column(name="perm_name")),
            @AttributeOverride(name="status",column=@Column(name="perm_status")),
            @AttributeOverride(name="presentationDuration",column=@Column(nullable=true))
    })
    private personList lists;

    public Guest() {
    }

    public Guest(personList lists) {
        this.lists = lists;
    }

    public personList getLists() {
        return lists;
    }

    public void setLists(personList lists) {
        this.lists = lists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(lists, guest.lists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lists);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "lists=" + lists +
                '}';
    }
}
