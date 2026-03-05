package com.ffi.edigest.controller;


import com.ffi.edigest.entity.JournalEntry;
import com.ffi.edigest.repository.JournalRepo;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/JEC")
@Slf4j
public class UserController
{
    @Autowired
    JournalRepo journalRepo;
    List<JournalEntry> journalEntry = new ArrayList<>();

    @GetMapping
    public List<JournalEntry> getJournalEntries()
    {
        return journalRepo.findAll();
    }

    @PostMapping("/{id}")
    public void saveJournalEntry(@PathVariable String id, @RequestBody JournalEntry abc)
    {
        abc.setDate(LocalDateTime.now());
        log.info(id);
        log.info(abc.toString());

        journalRepo.save(abc);
        journalRepo.findAll().forEach(System.out::println);
    }

    @GetMapping("/{id}")
    public JournalEntry getJournlaEntry(@PathVariable ObjectId id)
    {
        return journalRepo.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deteleJournlaEntry(@PathVariable ObjectId id)
    {
        journalRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public void deteleJournlaEntry(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry)
    {
        JournalEntry old = journalRepo.findById(id).orElse(null);
        log.info(newEntry.toString());
        if(old != null)
        {
            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
            old.setDate(LocalDateTime.now());
        }
        log.info(old.toString());
    journalRepo.save(old);
    }

}


