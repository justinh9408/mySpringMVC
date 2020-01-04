package com.hjc.entity;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019-12-26 12:01
 * @Created by Justin
 */

public class User {


    @Size(min = 2, max = 20)
    String name;   //用户名

    @Min(value = 18, message = "年龄太小")
    Integer age;  //年龄

    @org.hibernate.validator.constraints.NotBlank
    @Email(message = "邮箱格式错误")
    String email;  //邮箱

    String password;

    @NotNull
    @Valid
    Address address;

    public User() {
    }

    public User(String name, Integer age, String email, String password, Address address, Date birth) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
        this.birth = birth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getPassword() {
        return password;
    }

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date birth;

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }


    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                ", birth=" + birth +
                '}';
    }
}
