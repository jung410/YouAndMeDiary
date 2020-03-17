package com.diary.YouAndMeDiary.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
public class Diary {

    @Id
    @GeneratedValue
    @Column(name = "diary_no")
    private Long diaryNo;

    @Column(name = "diary_title")
    private String diaryTitle;

    @Column(name = "diary_content")
    private String diaryContent;

    @Column(name = "diary_write_date")
    private LocalDateTime diaryWriteDate;

    @Column(name = "diary_update_date")
    private LocalDateTime diaryUpdateDate;

    private String link1;

    private String link2;

    private String link3;

    @Column(name = "visited_site")
    private String visitedSite;

    private Long expenses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_no")
    private Member member;

    @OneToMany(mappedBy = "diary")
    private List<Image> imageList = new ArrayList<>();

    @OneToMany(mappedBy = "diary")
    private List<DiaryTag> tagList = new ArrayList<>();
}
