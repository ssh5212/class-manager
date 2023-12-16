package kr.co.angelplayer.class_manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable // 복합키를 가진 엔티티 클래스임을 알려줌
@NoArgsConstructor
@EqualsAndHashCode // 객체 동등성 비교 시 사용 -> 현재는 복합키 구분을 위해서 사용
public class ApprovalId {
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "course_id")
    private Long courseId;

    // 빌더 생성 필요
    @Builder
    public ApprovalId(Long memberId, Long courseId) {
        this.memberId = memberId;
        this.courseId = courseId;
    }
}
