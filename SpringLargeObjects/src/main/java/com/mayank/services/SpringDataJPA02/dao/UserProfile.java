package com.mayank.services.SpringDataJPA02.dao;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Arrays;

@Entity
public class UserProfile
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String name;
    public Integer age;
    @Lob
    public byte[] profileImage;
    @Lob
    public char[] resume;

    public UserProfile(String name, Integer age, byte[] profileImage, char[] resume) {
        this.name = name;
        this.age = age;
        this.profileImage = profileImage;
        this.resume = resume;
    }

    public UserProfile() {
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", profileImage=" + Arrays.toString(profileImage) +
                ", resume=" + Arrays.toString(resume) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public byte[] getProfileImage() {
        return profileImage;
    }

    public char[] getResume() {
        return resume;
    }
}
