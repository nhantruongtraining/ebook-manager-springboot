package com.axonactive.training.ebookapp.service;

import com.axonactive.training.ebookapp.entity.Publisher;
import com.axonactive.training.ebookapp.service.dto.PublisherStatisticsDto;

import java.util.List;
import java.util.Optional;

public interface PublisherService {
    List<Publisher> getAll();
    Publisher save(Publisher publisher);
    Optional<Publisher> findById(Integer id);
    void deleteById(Integer id);

    List<PublisherStatisticsDto> getPublisherStatisticsJPQL();
}
