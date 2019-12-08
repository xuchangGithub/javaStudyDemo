package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    public Integer id;
    public String name;
    public Long classNameId;

}
