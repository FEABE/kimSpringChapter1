package com.example.kimspringchapter1.member;
//오늘 하자
public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
