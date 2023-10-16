package com.example.Event.Management.application.event.Entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Objects;

@Embeddable
public class personList {
    private String name;
    @Enumerated(EnumType.STRING)
    private GuestStatus status;
    private int presentationDuration;

    public personList() {
    }

    public personList(String name, GuestStatus status, int presentationDuration) {
        this.name = name;
        this.status = status;
        this.presentationDuration = presentationDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personList that = (personList) o;
        return presentationDuration == that.presentationDuration && Objects.equals(name, that.name) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, presentationDuration);
    }

    @Override
    public String toString() {
        return "personList{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", presentationDuration=" + presentationDuration +
                '}';
    }

}
