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
public class Member {
    @Id // 해당 필드가 PK임을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 값 생성 전략을 지정할 때 사용함
    // GenerationType.IDENTITY : auto-increment
    private Long memberId; // PK

    @Column(length = 12) // String의 길이를 제한
    private String nickname;
    @Column(length = 10, nullable = false)
    private String role = "user"; // 기본 값이 있는 경우 지정
    @Column(length = 12, nullable = false)
    private String provider;
    @Column(length = 100)
    private String email;
    @Column(length = 50, nullable = false)
    private String clientId;

    @CreatedDate // 데이터가 들어가는 시간을 자동으로 제공 / now()의 역할
    @Column(nullable = false)
    private LocalDateTime registDate;
}
