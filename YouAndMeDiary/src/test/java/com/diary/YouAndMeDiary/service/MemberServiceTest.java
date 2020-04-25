package com.diary.YouAndMeDiary.service;

import com.diary.YouAndMeDiary.domain.Member;
import com.diary.YouAndMeDiary.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

    @Test
//     public void 회원가입() throws Exception {
//         Member member = new Member();
//         member.setUserId("test1");
//         member.setUserName("테스터");
//         member.setUserEmail("test@test.test");
//         member.setUserPassword("123123");

//         Long saveId = memberService.join(member);

//         assertEquals(member, memberRepository.findOne(saveId));
//     }
}
