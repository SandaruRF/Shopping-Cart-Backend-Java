package com.projects.springshop.service.image;

import com.projects.springshop.dto.ImageDto;
import com.projects.springshop.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> savedImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
