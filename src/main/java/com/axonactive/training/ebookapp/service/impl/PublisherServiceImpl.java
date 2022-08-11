package com.axonactive.training.ebookapp.service.impl;

import com.axonactive.training.ebookapp.entity.Publisher;
import com.axonactive.training.ebookapp.repository.EbookRepository;
import com.axonactive.training.ebookapp.repository.PublisherRepository;
import com.axonactive.training.ebookapp.service.PublisherService;
import com.axonactive.training.ebookapp.service.dto.PublisherStatisticsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    EbookRepository ebookRepository;

    @Override
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Optional<Publisher> findById(Integer id) {
        return publisherRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public List<PublisherStatisticsDto> getPublisherStatisticsJPQL() {
        return publisherRepository.countEbooksByPublisherJPQL();
    }


}
