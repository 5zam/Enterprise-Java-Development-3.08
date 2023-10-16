package com.example.Event.Management.application.event.Entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;

import java.util.Objects;

public class Speaker {
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="name",column=@Column(name="perm_name")),
            @AttributeOverride(name="status",column=@Column(nullable=true)),
            @AttributeOverride(name="presentationDuration",column=@Column(name="presentation_Duration"))
    })
    private personList lists;

    public Speaker() {
    }

    public Speaker(personList lists) {
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
        Speaker speaker = (Speaker) o;
        return Objects.equals(lists, speaker.lists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lists);
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "lists=" + lists +
                '}';
    }
}
