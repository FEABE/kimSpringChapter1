package com.example.kimspringchapter1.member;

public interface MemberReopsitory {
    void save(Member member);
    Member findById(Long memberId);
}
