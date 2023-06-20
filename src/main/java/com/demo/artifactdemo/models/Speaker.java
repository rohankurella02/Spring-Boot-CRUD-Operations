package com.demo.artifactdemo.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity(name = "speakers")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speaker_id")
    private Long speakerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

//    @Lob
//    @Type(type = "org.hibernate.type.BinaryType")
//    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;

//    public byte[] getSpeaker_photo() {
//        return speaker_photo;
//    }
//
//    public void setSpeaker_photo(byte[] speaker_photo) {
//        this.speaker_photo = speaker_photo;
//    }

    public Long getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(Long speakerId) {
        this.speakerId = speakerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeakerBio() {
        return speakerBio;
    }

    public void setSpeakerBio(String speakerBio) {
        this.speakerBio = speakerBio;
    }

    @Column(name = "speaker_bio")
    private String speakerBio;

}
