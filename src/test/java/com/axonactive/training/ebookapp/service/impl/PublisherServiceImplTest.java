package com.axonactive.training.ebookapp.service.impl;

import com.axonactive.training.ebookapp.service.PublisherService;
import com.axonactive.training.ebookapp.service.dto.PublisherStatisticsDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class PublisherServiceImplTest {
    @Autowired
    PublisherService publisherService;

    @Test
    void testGetPublisherStatisticsJPQL_shouldReturnNoData_whenTableFirstCreated() {
        List<PublisherStatisticsDto> publisherStatisticsList = publisherService.getPublisherStatisticsJPQL();
        assertEquals(0, publisherStatisticsList.size());
    }
}