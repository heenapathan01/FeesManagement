package com.org.feesmanagementservice.controller;

import com.org.feesmanagementservice.request.FeesCollectionRequest;
import com.org.feesmanagementservice.response.FeesResponseDTO;
import com.org.feesmanagementservice.service.impl.FeesManagementServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeesController {

    @Autowired
    private FeesManagementServiceImpl feesManagementService;

    /**
     * API to collect fees payment.
     * @param feesCollectionRequest
     * @return
     */
    @PostMapping("/payment")
    @ResponseStatus(HttpStatus.CREATED)
    public FeesResponseDTO feesPaymentProcess(@Valid @RequestBody FeesCollectionRequest feesCollectionRequest) {

        return feesManagementService.processFeesPayment(feesCollectionRequest);
    }

    /**
     * API to fetch details of fees payment.
     * @param feesCollectionId
     * @return
     */
    @GetMapping("/{id}")
    public FeesResponseDTO fetchFeesPaymentDetails(@PathVariable("id") Long feesCollectionId) {

        return feesManagementService.fetchFeesCollectionDetails(feesCollectionId);
    }

    /**
     * API to view the fees payment receipt.
     * @return
     */
    @GetMapping("/receipt")
    public ModelAndView generateFeesReceipt(){
        ModelAndView receiptView = new ModelAndView();
        return receiptView;
    }
}
