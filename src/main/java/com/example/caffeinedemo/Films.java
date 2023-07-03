package com.example.caffeinedemo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Films {

    private String _id;
    private int index;
    private String guid;
    private boolean isActive;
    private String balance;
    private List<String> tags;
}
