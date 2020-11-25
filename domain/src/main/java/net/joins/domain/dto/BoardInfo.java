package net.joins.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class BoardInfo {

    private Long bno;
    private String title;
    private Long userSeq; //userId? userSeq?
    private String userName;
    private String content;

    private Timestamp regdate;
    private Timestamp updatedate;


}