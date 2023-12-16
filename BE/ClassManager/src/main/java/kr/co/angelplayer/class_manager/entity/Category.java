package kr.co.angelplayer.class_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity // JPA에서 엔티티 클래스임을 나타냄
@Getter // 해당 클래스의 모든 필드에 getter 메소드 자동 생성
@NoArgsConstructor // 해당 클래스의 기본 생성자를 자동으로 생성
@EntityListeners(AuditingEntityListener.class) // 엔티티 라이프사이클 이벤트를 감지하고 처리하기 위한 리스너를 등록하는데 사용
// AuditingEntityListener : 엔티티의 생성일자와 수정일자를 자동으로 관리
public class Category {
    @Id // 해당 필드가 PK임을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 값 생성 전략을 지정할 때 사용함
    private Long categoryId;

    @Column(length = 5, nullable = false)
    private String type = "study";
    @Column(length = 20, nullable = false)
    private String subject;
}
