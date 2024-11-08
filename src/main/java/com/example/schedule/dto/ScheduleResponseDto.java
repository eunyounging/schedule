package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

@Getter

public class ScheduleResponseDto {
    private Long id;
    private String toDo;
    private String authorName;
    private String password;
    private Long writeDate;
    private Long modifyDate;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.toDo = schedule.getToDo();
        this.authorName = schedule.getAuthorName();
        this.password = schedule.getPassword();
        this.writeDate = schedule.getWriteDate();
        this.modifyDate = schedule.getModifyDate();
    }

}
