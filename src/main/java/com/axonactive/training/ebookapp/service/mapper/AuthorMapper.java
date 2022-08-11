package com.axonactive.training.ebookapp.service.mapper;

import com.axonactive.training.ebookapp.entity.Author;
import com.axonactive.training.ebookapp.service.dto.AuthorDto;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;


@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);
    @Mapping(source = "author.status", target = "status")

    AuthorDto toDto(Author author);

    List<AuthorDto> toDtos(List<Author> authors);
}
