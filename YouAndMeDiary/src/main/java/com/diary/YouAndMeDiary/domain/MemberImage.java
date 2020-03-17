package com.diary.YouAndMeDiary.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
public class MemberImage {

    @Id
    @GeneratedValue
    @Column(name = "image_no")
    private Long imageNo;

    @Column(name = "ori_file_name")
    private String oriFileName;

    @Column(name = "sto_file_name")
    private String stoFileName;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "image_upload_date")
    private LocalDateTime imageUploadDate;

    @OneToOne(mappedBy = "memberImage", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_no")
    private Member member;
}
