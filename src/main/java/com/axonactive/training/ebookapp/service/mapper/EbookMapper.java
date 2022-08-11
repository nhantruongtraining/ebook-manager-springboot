package com.axonactive.training.ebookapp.service.mapper;

import com.axonactive.training.ebookapp.entity.Ebook;
import com.axonactive.training.ebookapp.service.dto.EbookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EbookMapper {
    EbookMapper INSTANCE = Mappers.getMapper(EbookMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "category.value", target = "category")
    @Mapping(source = "language.name", target = "language")
    @Mapping(source = "publisher.name", target = "publisher")

    EbookDto toDto(Ebook ebook);
    List<EbookDto> toDtos(List<Ebook> ebooks);
}
