package com.org.feesmanagementservice.mapper;

import com.org.feesmanagementservice.entity.FeesEntity;
import com.org.feesmanagementservice.request.FeesCollectionRequest;
import com.org.feesmanagementservice.response.FeesResponseDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FeesMapper {

    public FeesEntity toFeesEntity(FeesCollectionRequest request) {

        FeesEntity entity = new FeesEntity();

        entity.setFeesAmount(request.getFeesAmount());
        entity.setCardNumber(request.getCardNumber());
        entity.setGrade(request.getGrade());
        entity.setFeesPaymentTimestamp(request.getFeesCreditTimestamp());
        entity.setPaymentMode(request.getPaymentMode());
        entity.setStudentId(request.getStudentId());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setCardType(request.getCardType());

        return entity;
    }

    public FeesResponseDTO toFeesResponseDTO(FeesEntity entity){

        return FeesResponseDTO.builder()
                .feesAmount(entity.getFeesAmount())
                .feesCollectionId(entity.getId())
                .grade(entity.getGrade())
                .cardNumber(entity.getCardNumber())
                .feesCreditTimestamp(entity.getFeesPaymentTimestamp())
                .paymentMode(entity.getPaymentMode())
                .cardType(entity.getCardType())
                .studentId(entity.getStudentId())
                .feesAmount(entity.getFeesAmount())
                .build();
    }
}
