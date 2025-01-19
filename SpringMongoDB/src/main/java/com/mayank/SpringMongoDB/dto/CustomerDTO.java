package com.mayank.SpringMongoDB.dto;

public class CustomerDTO
{
        private String id;
        private String name;
        private String location;
        private Integer age;

    public CustomerDTO(String name, String location, Integer age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
