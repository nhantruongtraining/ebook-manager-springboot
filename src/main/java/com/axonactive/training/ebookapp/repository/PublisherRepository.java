package com.axonactive.training.ebookapp.repository;

import com.axonactive.training.ebookapp.entity.Publisher;
import com.axonactive.training.ebookapp.service.dto.PublisherStatisticsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    @Query("SELECT new com.axonactive.training.ebookapp.service.dto.PublisherStatisticsDto(p.name, COUNT(e.id)) " +
            "FROM Publisher p LEFT JOIN Ebook e ON p.id = e.publisher.id " +
            "GROUP BY p.name " +
            "ORDER BY p.name")
    List<PublisherStatisticsDto> countEbooksByPublisherJPQL();
}
