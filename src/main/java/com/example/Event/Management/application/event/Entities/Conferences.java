package com.example.Event.Management.application.event.Entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;
import java.util.Objects;

public class Conferences extends Event{
    @ManyToMany
    @JoinTable(
            name = "conference_speaker",
            joinColumns = @JoinColumn(name = "conference_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

    public Conferences() {
    }

    public Conferences(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conferences that = (Conferences) o;
        return Objects.equals(speakers, that.speakers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speakers);
    }

    @Override
    public String toString() {
        return "Conferences{" +
                "speakers=" + speakers +
                '}';
    }
}
