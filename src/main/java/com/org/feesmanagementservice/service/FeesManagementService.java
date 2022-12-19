package com.org.feesmanagementservice.service;

import com.org.feesmanagementservice.request.FeesCollectionRequest;
import com.org.feesmanagementservice.response.FeesResponseDTO;

public interface FeesManagementService {

    // Method used to persist the fees payment details.
    public FeesResponseDTO processFeesPayment(FeesCollectionRequest feesCollectionRequest);
}
