package com.org.feesmanagementservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Entity
@Table(name = "FEES")
@Getter
@Setter
@Data
@NoArgsConstructor
public class FeesEntity {
    @Id
    @GeneratedValue
    public Long id;

    @Column
    public Long studentId;

    @Column
    public Long feesAmount;

    @Column
    public String paymentMode;

    @Column
    public String cardNumber;

    @Column
    public String cardType;

    @Column
    public String paymentReferenceNumber;

    @Column
    public String grade;

    @Column
    public String feesPaymentTimestamp;

    @Column
    public LocalDateTime createdAt;
}
