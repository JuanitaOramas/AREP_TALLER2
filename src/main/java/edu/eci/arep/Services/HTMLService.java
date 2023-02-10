package edu.eci.arep.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTMLService implements RESTService {

    @Override
    public String getHeader(){
        return "HTTP/1.1 200 OK \r\n" + "Content-Type: text/html \r\n" + "\r\n"; }

    @Override
    public String getResponse() {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get("src/main/resources/index.html"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(fileContent);
    }

}


