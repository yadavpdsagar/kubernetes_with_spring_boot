package com.sivalabs.bookmarker.controller;

import com.sivalabs.bookmarker.model.Forredux;
import com.sivalabs.bookmarker.repo.ForreduxRepo;
import com.sivalabs.bookmarker.service.ForreduxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forredux")
public class ForreduxController {
@Autowired
    private   ForreduxService forreduxService;



    @Autowired
    public ForreduxRepo forreduxRepository ;

    @PostMapping("/save")
    public ResponseEntity<Forredux> saveForredux(@RequestBody Forredux forredux) {
        Forredux savedForredux = forreduxRepository.save(forredux);
        return ResponseEntity.ok(savedForredux);
    }

    // Endpoint to get all Forredux entities
    @GetMapping
    public List<Forredux> getAllForredux() {
        return forreduxService.getAllForredux();
    }
}
