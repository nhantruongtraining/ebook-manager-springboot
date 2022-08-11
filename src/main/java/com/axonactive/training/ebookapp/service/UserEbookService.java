package com.axonactive.training.ebookapp.service;

import com.axonactive.training.ebookapp.entity.UserEbook;
import com.axonactive.training.ebookapp.service.dto.UserEbookDto;

import java.util.List;
import java.util.Optional;

public interface UserEbookService {
    List<UserEbook> getAll();
    UserEbook save(UserEbook ebook);
    Optional<UserEbook> findById(Integer id);
    void deleteById(Integer id);

//    List<UserEbook> findByEbookTitleContaining(String ebookTitle);
//    List<UserEbookDto> returnAllFavorite(Integer userID);
}
