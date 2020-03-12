package com.diary.YouAndMeDiary.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Integer userNo;

    private String userId;

    private String userName;

    private String userEmail;

    private String userPassword;

    private Integer connectUserNo;
}
