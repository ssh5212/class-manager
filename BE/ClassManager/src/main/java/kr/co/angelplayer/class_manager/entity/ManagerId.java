package kr.co.angelplayer.class_manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable // ??? 복합키
@NoArgsConstructor
@EqualsAndHashCode // ??? 동등성 비교? 복합키 구분
public class ManagerId implements Serializable {
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "course_id")
    private Long courseId;

    @Builder
    public ManagerId(Long memberId, Long courseId) {
        this.memberId = memberId;
        this.courseId = courseId;
    }
}
