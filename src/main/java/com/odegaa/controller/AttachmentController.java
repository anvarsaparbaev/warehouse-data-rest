package com.odegaa.controller;

import com.odegaa.models.Attachment;
import com.odegaa.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.data.warehousemarket.payload.Result;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @GetMapping("/{id}")
    public Attachment getAttachmentById(@PathVariable Integer id){
        return attachmentService.getAttachmentById(id);
    }

    @PostMapping
    public Result addAttachment(@RequestBody Attachment attachment){
        return attachmentService.addAttachment(attachment);
    }


}
