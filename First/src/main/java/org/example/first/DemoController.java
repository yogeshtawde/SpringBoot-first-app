package org.example.first;


import org.example.first.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{


    @Autowired
    private DemoService service;


    @GetMapping("/hello")
    public ResponseEntity<String> greeting()
    {
        String resMsg = service.sayHeloo();
        return  new ResponseEntity<>(resMsg, HttpStatus.OK);
    }


}

