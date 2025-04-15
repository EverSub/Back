package com.bjduo.eversubserver.option.entity;

import com.bjduo.eversubserver.global.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@DynamicUpdate
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
@Table(name="option")
public class Option extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "price_yearly",nullable = false)
    private Integer priceYearly;

    @Column(name = "price_monthly", nullable = false)
    private Integer priceMonthly;

    @Column(nullable = false)
    private LocalDate birth;

    @Column(nullable = false)
    private String description;

    private String username;

    private String password;

}
