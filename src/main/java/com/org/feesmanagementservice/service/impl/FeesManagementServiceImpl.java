package com.org.feesmanagementservice.service.impl;

import com.org.feesmanagementservice.entity.FeesEntity;
import com.org.feesmanagementservice.mapper.FeesMapper;
import com.org.feesmanagementservice.repository.FeesRepository;
import com.org.feesmanagementservice.request.FeesCollectionRequest;
import com.org.feesmanagementservice.response.FeesResponseDTO;
import com.org.feesmanagementservice.service.FeesManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeesManagementServiceImpl implements FeesManagementService {

    @Autowired
    private FeesRepository feesRepository;

    @Autowired
    private FeesMapper mapper;

    @Override
    public FeesResponseDTO processFeesPayment(FeesCollectionRequest feesCollectionRequest) {
        FeesEntity savedEntity = feesRepository.save(mapper.toFeesEntity(feesCollectionRequest));

        return mapper.toFeesResponseDTO(savedEntity);
    }

    public FeesResponseDTO fetchFeesCollectionDetails(Long feesCollectionId) {

        return mapper.toFeesResponseDTO(feesRepository.getReferenceById(feesCollectionId));
    }
}
