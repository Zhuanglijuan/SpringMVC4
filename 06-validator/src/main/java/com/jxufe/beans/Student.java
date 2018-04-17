package com.jxufe.beans;

import javax.validation.constraints.*;

/**
 * Created by Zhuang on 2018/4/15.
 */
public class Student {

    @NotNull(message = "姓名不能为空")
    @Size(min = 3,max = 6,message = "姓名长度为{min}-{max}个字符")
    private String name;

    @Min(value = 0,message = "成绩不能小于{value}")
    @Max(value = 100,message = "成绩不能大于{value}")
    private double score;

    @NotNull(message = "手机号不能为空")
    @Pattern(regexp = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$",message = "手机号格式不正确")
    private String mobile;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
