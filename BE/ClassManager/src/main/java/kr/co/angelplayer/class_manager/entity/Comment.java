package kr.co.angelplayer.class_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity // JPA에서 엔티티 클래스임을 나타냄
@Getter // 해당 클래스의 모든 필드에 getter 메소드 자동 생성
@NoArgsConstructor // 해당 클래스의 기본 생성자를 자동으로 생성
@EntityListeners(AuditingEntityListener.class) // 엔티티 라이프사이클 이벤트를 감지하고 처리하기 위한 리스너를 등록하는데 사용
// AuditingEntityListener : 엔티티의 생성일자와 수정일자를 자동으로 관리
public class Comment {
    @Id // 해당 필드가 PK임을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 값 생성 전략을 지정할 때 사용함
    private Long commentId; // PK

    // 내가 多, 상대가 1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    // FK이기 때문에 다른 엔티티에 있는 속성 값을 가져와야 하기 때문에 Type이 아니라 엔티티를 작성해야 함
    private Article article; // FK

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // FK

    @Column(length = 255, nullable = false)
    private String content;

    @CreatedDate // 데이터가 들어가는 시간을 자동으로 제공 / now()의 역할
    @Column(nullable = false)
    private LocalDateTime writeDate;
    private LocalDateTime editDate;
    private LocalDateTime deleteDate;
}
