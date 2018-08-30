package com.dhy.file.service;

import java.util.List;

public interface FileService {

    List<String> getFileName(String path);

    String rename(String path);


}
