package com.sivalabs.bookmarker.controller;

import com.sivalabs.bookmarker.service.ZipService;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ZipController {

    private final ZipService zipService;

    public ZipController(ZipService zipService) {
        this.zipService = zipService;
    }

    @GetMapping("/download-zip")
    public ResponseEntity<ByteArrayResource> downloadZip() {
        try {
            ByteArrayResource resource = zipService.createZipFile();
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=images.zip")
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);   
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
