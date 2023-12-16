package kr.co.angelplayer.class_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // JPA에서 엔티티 클래스임을 나타냄
@Getter // 해당 클래스의 모든 필드에 getter 메소드 자동 생성
@NoArgsConstructor // 해당 클래스의 기본 생성자를 자동으로 생성
public class Manager {
    @EmbeddedId
    private ManagerId id;

    @MapsId("memberId") // 복합키를 가지는 엔티티 매핑 시 사용
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // FK

    @MapsId("courseId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course; // FK
}
