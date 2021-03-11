package com.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 517
 * @date 2021-03-10 - 14:46
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
