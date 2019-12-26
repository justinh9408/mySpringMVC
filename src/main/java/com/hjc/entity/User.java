package com.hjc.entity;

import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019-12-26 12:01
 * @Created by Justin
 */
public class User {


    @Size(min = 1, max = 20)
    String name;   //用户名

    @Min(value = 18)
    Integer age;  //年龄

    @org.hibernate.validator.constraints.NotBlank
    @Email(message = "邮箱格式错误")
    String email;  //邮箱

    @NotNull
    @Valid
    Address address;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
