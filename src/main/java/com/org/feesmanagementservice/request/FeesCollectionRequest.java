package com.org.feesmanagementservice.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class FeesCollectionRequest implements Serializable {

    @ApiModelProperty("StudentId")
    @NotNull(message = "StudentId should not be null.")
    public Long studentId;

    @ApiModelProperty("Fees amount paid")
    @NotNull(message = "Fees amount should not be null.")
    public Long feesAmount;

    @ApiModelProperty("grade for which fees is paid")
    @NotNull(message = "Grade should not be null.")
    public String grade;

    @ApiModelProperty("Fees payment mode")
    @NotNull(message = "Fees payment mode should not be null.")
    public String paymentMode;

    @ApiModelProperty("Type of card used for fees payment")
    @NotNull(message = "card type should not be null.")
    public String cardType;

    @ApiModelProperty("CardNumber used for doing fees payment")
    @NotNull(message = "cardNumber should not be null.")
    public String cardNumber;

    @ApiModelProperty("Reference number of fees payment")
    @NotNull(message = "Reference number of fees should not be null.")
    public String paymentReferenceNumber;

    @ApiModelProperty("Timestamp of fees payment")
    @NotNull(message = "Timestamp of fees payment should not be null.")
    public String feesCreditTimestamp;
}
