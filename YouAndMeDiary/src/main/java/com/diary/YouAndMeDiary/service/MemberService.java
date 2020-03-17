package com.diary.YouAndMeDiary.service;

import com.diary.YouAndMeDiary.domain.Member;
import com.diary.YouAndMeDiary.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member member){
        memberRepository.save(member);
        return member.getUserNo();
    }

    public Member findOne(Long id){
        return memberRepository.findOne(id);
    }
}
