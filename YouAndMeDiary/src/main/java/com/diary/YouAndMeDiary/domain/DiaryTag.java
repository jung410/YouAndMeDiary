package com.diary.YouAndMeDiary.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
public class DiaryTag {

    @Id
    @GeneratedValue
    @Column(name = "diary_tag_no")
    private Long diaryTagNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diary_no")
    private Diary diary;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "tag_no")
    private Tag tag;
}
