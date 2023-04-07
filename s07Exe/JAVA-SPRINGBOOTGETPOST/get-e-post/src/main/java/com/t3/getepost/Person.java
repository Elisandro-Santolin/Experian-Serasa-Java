package com.t3.getepost;

public class Person {
    private long id;
    private String name;
    private String city;
    private int age;

    Person (){
        id =0;
        name ="name";
        city ="city";
        age =0;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }    
}
