package com.dhy.file.service.impl;

import com.dhy.file.service.FileService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<String> getFileName(String path) {

        File f = new File(path);

        List<String> fileList = new ArrayList<>();

        if (!f.exists()) {
            System.out.println(path + " not exists");
            return null;
        }
        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " [目录]");
            } else {
                System.out.println(fs.getName());
            }

            fileList.add(fs.getName());
        }

        return fileList;

    }


    @Override
    public String rename(String path) {


        return null;
    }
}
