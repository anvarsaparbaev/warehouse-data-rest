package com.odegaa.service;

import com.odegaa.models.Attachment;
import com.odegaa.repositories.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.data.warehousemarket.payload.Result;

import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    public Result addAttachment(Attachment attachment){
        attachmentRepository.save(attachment);
        return new Result("Successfull saved",true);
    }

    public Attachment getAttachmentById(Integer id){
        Optional<Attachment> byId = attachmentRepository.findById(id);
        return byId.orElse(null);
    }


}
