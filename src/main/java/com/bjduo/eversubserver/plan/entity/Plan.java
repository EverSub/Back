package com.bjduo.eversubserver.plan.entity;

import com.bjduo.eversubserver.global.common.entity.BaseEntity;
import com.bjduo.eversubserver.global.common.enums.PayType;
import com.bjduo.eversubserver.member.entity.Member;
import com.bjduo.eversubserver.option.entity.Option;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Entity
@Getter
@Builder
@DynamicUpdate
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
@Table(name="plan")
public class Plan extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options;

    private Integer customPrice;

    private PayType isAutoRenewal;
}
