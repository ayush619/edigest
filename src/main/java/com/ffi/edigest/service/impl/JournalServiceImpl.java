package com.ffi.edigest.service.impl;

import com.ffi.edigest.entity.JournalEntry;
import com.ffi.edigest.repository.JournalRepo;
import com.ffi.edigest.service.JournalService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.List;
import java.util.Optional;

@Service
public class JournalServiceImpl implements JournalService
{

    @Autowired
    JournalRepo journalRepo;

    @Override
    public ResponseEntity<JournalEntry> saveJournal(JournalEntry journalEntry)
    {
       JournalEntry journalEntry1 = journalRepo.save(journalEntry);
//       journalRepo.insert(journalEntry);
        return ResponseEntity.status(HttpStatus.CREATED).body(journalEntry1);
    }

    @Override
    public ResponseEntity<JournalEntry> updateJournal(JournalEntry journalEntry) {
        Optional<JournalEntry> oldJE = journalRepo.findById(journalEntry.getId());
        if(oldJE.isPresent())
        {
            JournalEntry ob = oldJE.get();
            
        }

    }

    @Override
    public ResponseEntity<JournalEntry> deleteJournal(JournalEntry journalEntry) {
        return null;
    }

    @Override
    public ResponseEntity<JournalEntry> getJournal(ObjectId id) {
        return null;
    }

    @Override
    public ResponseEntity<List<JournalEntry>> getAllJournal() {
        return null;
    }
}
