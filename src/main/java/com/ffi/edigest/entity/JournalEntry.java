package com.ffi.edigest.entity;


import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document(collection = "JournalEntry")
public class JournalEntry
{
    @MongoId
    private ObjectId id;

    @NonNull
    private String title;

    @NonNull
    private String content;


    private LocalDateTime date;

}
