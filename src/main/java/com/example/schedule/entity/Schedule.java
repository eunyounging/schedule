package com.example.schedule.entity;

import com.example.schedule.dto.ScheduleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Schedule {
    private Long id;
    private String toDo;
    private String authorName;
    private String password;
    private Long writeDate;
    private Long modifyDate;

    public void update(ScheduleRequestDto dto) {
        this.toDo = dto.getToDo();
        this.authorName = dto.getAuthorName();
        this.password = dto.getPassword();
        this.writeDate = dto.getWriteDate();
        this.modifyDate = dto.getModifyDate();

    }
}
