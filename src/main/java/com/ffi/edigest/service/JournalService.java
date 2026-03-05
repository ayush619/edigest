package com.ffi.edigest.service;


import com.ffi.edigest.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface JournalService
{

    ResponseEntity<JournalEntry> saveJournal(JournalEntry journalEntry);

    ResponseEntity<JournalEntry> updateJournal(JournalEntry journalEntry);

    ResponseEntity<JournalEntry> deleteJournal(JournalEntry journalEntry);

    ResponseEntity<JournalEntry> getJournal(ObjectId id);

    ResponseEntity<List<JournalEntry>> getAllJournal();

}
