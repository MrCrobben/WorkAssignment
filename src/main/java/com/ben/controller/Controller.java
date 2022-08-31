package com.ben.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public interface Controller {


    @GetMapping("/cleardb")
    public String clearDb();
    @GetMapping("/clearByParam")
    public String clearByParam(@RequestParam String drzava, @RequestParam String datumOd, @RequestParam String datumDo);
    @GetMapping("/getstat")
    public String getStat(@RequestParam String drzava, @RequestParam String datumOd, @RequestParam String datumDo);
}
