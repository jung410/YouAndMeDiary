package com.diary.YouAndMeDiary.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "tag_no")
    private Long tagNo;

    @Column(name = "tag_name")
    private String tagName;
}
