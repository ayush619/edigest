package com.ffi.edigest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/abc")
@Slf4j
public class Controller
{
  List<String> aa= new ArrayList<>();
  Logger logger = LoggerFactory.getLogger(Controller.class);

@GetMapping("/hello")
public String hello()
{
  logger.info("the hello world has started");
  return "Hello there";
}



@PostMapping
public void postJournalEntries(@RequestBody String abc)
{
  log.info("added".concat(" ").concat(abc));
  aa.add(abc);
}

@GetMapping
public  List<String> getJournalEntries()
{
  log.info("here is the string".concat(aa.toString()));
  return aa;
}
}
