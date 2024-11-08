package com.example.schedule.dto;

import lombok.Getter;

@Getter

public class ScheduleRequestDto {
    private String toDo;
    private String authorName;
    private String password;
    private Long writeDate;
    private Long modifyDate;
}
