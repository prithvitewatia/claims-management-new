package com.claimsmanagement.claimsmanagement.core.claim.web;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class ClaimView {
    private Long claimId;
    private String description;
    private LocalDate claimRaisedDate;
    private LocalDate claimSettledDate;
    private Integer claimAmount;
    private String claimStatus;
    private String remarks;
}
