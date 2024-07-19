package com.gs.password_gen_java_spring.model;

import lombok.Data;

@Data
public class GenerateRequest {

    private int length;

    private boolean startWithLetterOrNumber;
}
