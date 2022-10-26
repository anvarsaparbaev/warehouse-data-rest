package com.odegaa.repositories;

import com.odegaa.models.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}