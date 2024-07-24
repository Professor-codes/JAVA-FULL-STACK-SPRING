package com.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageUploadService {

    public void uploadProductImage(MultipartFile productImage) {

        // IMAGE
        System.out.println("Product added > " + productImage.getOriginalFilename());

        // save image using folder or cloud
        String path = "D:\\spring-repo\\databaseconnection\\src\\main\\resources\\static\\image";

        try {
            byte b[] = productImage.getBytes();

            File file = new File(path, productImage.getOriginalFilename()); // file path, file name

            FileUtils.writeByteArrayToFile(file, b);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
