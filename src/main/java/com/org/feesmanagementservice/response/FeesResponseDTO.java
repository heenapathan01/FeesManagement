package com.org.feesmanagementservice.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Builder
public class FeesResponseDTO {

    public Long feesCollectionId;

    public Long studentId;

    public Long feesAmount;

    public String grade;

    public String paymentMode;

    public String cardType;

    public String cardNumber;

    public String paymentReferenceNumber;

    public String feesCreditTimestamp;
}
