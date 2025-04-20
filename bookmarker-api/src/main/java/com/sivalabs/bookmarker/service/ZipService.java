package com.sivalabs.bookmarker.service;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class ZipService {

    public ByteArrayResource createZipFile() throws Exception {
        // Hard-coded file paths
        List<String> filePaths = Arrays.asList(
                "E:\\test\\image\\the guns of august.jpg",
                "E:\\test\\image\\the rose bargain.jpg",
                "E:\\test\\image\\The story of young girl.jpg",
                "E:\\test\\image\\unbroken.jpg",
                "E:\\test\\image\\why on earth.jpg",
                "E:\\test\\image\\_af160359-c38f-4730-86f2-e91327ce22b1.jfif",
                "E:\\test\\image\\_b776cf66-09f2-4264-9aa5-ad760535b311.jfif"
        );

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ZipOutputStream zos = new ZipOutputStream(baos)) {

            for (String filePath : filePaths) {
                File file = new File(filePath);
                if (file.exists()) {
                    try (FileInputStream fis = new FileInputStream(file)) {
                        ZipEntry zipEntry = new ZipEntry(file.getName());
                        zos.putNextEntry(zipEntry);

                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = fis.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }
                        zos.closeEntry();
                    }
                }
            }
            zos.finish();
            return new ByteArrayResource(baos.toByteArray());
        }
    }



}
