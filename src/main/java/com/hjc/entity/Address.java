package com.hjc.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Classname Address
 * @Description TODO
 * @Date 2019-12-26 12:02
 * @Created by Justin
 */
public class Address {

    @NotBlank
    String city;

    @Size(min = 1, max = 20)
    String province;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
