package com.example.joii_api.repository;

import com.example.joii_api.models.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback,String> {
}
