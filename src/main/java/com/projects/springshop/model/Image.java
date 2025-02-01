package com.projects.springshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    private String downloadUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Blob getImage() {
        return this.image;
    }
    public String getFileName() {
        return this.fileName;
    }
    public String getFileType() {
        return this.fileType;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    public void setImage(Blob image){
        this.image = image;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Long getId() {
        return this.id;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
}
