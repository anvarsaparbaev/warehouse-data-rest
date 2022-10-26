package com.odegaa.repositories;

import com.odegaa.models.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> getAttachmentContentByAttachment_Id(Integer attachment_id);

}