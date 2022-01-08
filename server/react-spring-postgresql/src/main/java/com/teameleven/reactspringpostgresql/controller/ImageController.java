package com.teameleven.reactspringpostgresql.controller;

import com.teameleven.reactspringpostgresql.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

@RestController
@RequestMapping("api/images")
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping(path = "/uploadSingle", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> uploadSingle(@RequestParam("file") MultipartFile file) {
        var url =  this.imageService.uploadImage(file);
        return new ResponseEntity<>(url, HttpStatus.CREATED);
    }

    @PostMapping(path = "/uploadMultiple", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<String>> uploadMultiple(@RequestParam("files") MultipartFile[] file) {
        var urls =  this.imageService.uploadImages(file);
        return new ResponseEntity<>(urls, HttpStatus.CREATED);
    }
}
