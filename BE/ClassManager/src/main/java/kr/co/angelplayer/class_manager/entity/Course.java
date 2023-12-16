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
public class Course {
    @Id // 해당 필드가 PK임을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 값 생성 전략을 지정할 때 사용함
    private Long courseId; // PK

    // 내가 多, 상대가 1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // FK

    // 내가 多, 상대가 1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category; // FK

    @Column(length = 30, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false) // text type을 쓰는 경우 Column으로 정의
    private String content;
    @Column(length = 255)
    private String file;

    @Column(nullable = false)
    private Long views = 0L;
    @Column(nullable = false)
    private int personnel = 0;
    @Column(nullable = false)
    private int capacity = 1;

    private LocalDateTime recruitStartTime;
    private LocalDateTime recruitEndTime;
    private LocalDateTime courseStartTime;
    private LocalDateTime courseEndTime;
    @CreatedDate // 데이터가 들어가는 시간을 자동으로 제공 / now()의 역할
    @Column(nullable = false)
    private LocalDateTime writeDate;
    private LocalDateTime editDate;
    private LocalDateTime deleteDate;
}
