package com.test.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Resource {

    String string1 = "Deepak";

    {
        System.out.println("string = " + string1);
    }

@GetMapping("/{name}")
public String test(@PathVariable(value = "name") String name){
    return name;
}


}
