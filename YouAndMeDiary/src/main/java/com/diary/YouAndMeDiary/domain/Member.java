package com.diary.YouAndMeDiary.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    // 회원 번호 column
    @Id @GeneratedValue
    @Column(name = "user_no")
    private Long userNo;

    // 회원 아이디 column
    @Column(name = "user_id")
    private String userId;

    // 회원 이름 column
    @Column(name = "user_name")
    private String userName;

    // 회원 이메일 column
    @Column(name = "user_email")
    private String userEmail;

    // 회원 비밀번호 column
    @Column(name = "user_password")
    private String userPassword;

    // 연결하려는 회원의 회원번호 column
    @Column(name = "connect_user_no")
    private Long connectUserNo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "image_no")
    private MemberImage memberImage;

    @OneToMany
    private List<Diary> diaryList = new ArrayList<>();
}
