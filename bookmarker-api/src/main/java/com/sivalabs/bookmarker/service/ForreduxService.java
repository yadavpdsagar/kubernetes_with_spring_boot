package com.sivalabs.bookmarker.service;

import com.sivalabs.bookmarker.model.Forredux;
import com.sivalabs.bookmarker.repo.ForreduxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ForreduxService {

    private final ForreduxRepo forreduxRepository;

    @Autowired
    public ForreduxService(ForreduxRepo forreduxRepository) {
        this.forreduxRepository = forreduxRepository;
    }

    // Get all Forredux entities
    public List<Forredux> getAllForredux() {
        return forreduxRepository.findAll();
    }
}

