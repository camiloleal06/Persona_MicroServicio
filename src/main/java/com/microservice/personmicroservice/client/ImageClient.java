package com.microservice.personmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.microservice.personmicroservice.modelo.Image;

@FeignClient(name = "image-microservice", path = "/image")
public interface ImageClient {

    @GetMapping("/{id}")
    Image getImageById(@PathVariable String id);

    @PostMapping
    Image saveImage(@RequestParam MultipartFile file);
}
