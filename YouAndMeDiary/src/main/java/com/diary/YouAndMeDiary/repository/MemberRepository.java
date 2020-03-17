package com.diary.YouAndMeDiary.repository;

import com.diary.YouAndMeDiary.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    /**
     * 회원가입 메서드
     * @param member
     */
    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long saveId) {
        return em.find(Member.class, saveId);
    }
}
