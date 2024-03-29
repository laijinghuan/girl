package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;

    @Min(value = 18, message = "未成年禁止入内")
    private Integer age;

    @NotNull(message = "金额必传")
    //@NotEmpty 用在集合类上面
    //@NotBlank 用在String上面
    //@NotNull    用在基本类型上
    private Double money;

    public Girl() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMoney(Double money){this.money = money;}

    public Integer getId() {
        return id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public Double getMoney(){ return money;}

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
