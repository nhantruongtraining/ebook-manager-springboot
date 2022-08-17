package com.axonactive.training.ebookapp.repository;

import com.axonactive.training.ebookapp.entity.UserEbook;
import com.axonactive.training.ebookapp.service.dto.UserEbookDto;
import com.axonactive.training.ebookapp.service.dto.UserEbookStatisticsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserEbookRepository extends JpaRepository<UserEbook, Integer> {

    // Lookup ebook by names
//    List<UserEbook> findByEbookTitleContainingIgnoreCase(String ebookTitle);

    // List all favorite ebook owned by a user
//    @Query("SELECT new com.axonactive.training.ebookapp.service.dto.UserEbookDto(e.title, u.username, ue.favorite, ue.status) " +
//            "FROM UserEbook ue , Ebook e, User u " +
//            "WHERE ue.ebook.id = e.id AND ue.user.id = u.id AND ue.favorite = TRUE AND u.id = 2 " +
//            "ORDER BY e.title")
//    List<UserEbookDto> returnAllFavorite(@Param("userId") Integer userID);

    // List of Favorite ebooks By User by Date Range
    @Query("SELECT new com.axonactive.training.ebookapp.service.dto.UserEbookStatisticsDto " +
            "(e.title, u.username, ue.favoriteDate) " +
            "FROM UserEbook ue, Ebook e, User u " +
            "WHERE ue.user.id = u.id AND ue.ebook.id = e.id " +
            "AND u.username = :username " +
            "AND ue.favorite = 'TRUE' AND ue.favoriteDate >= :startDate AND ue.favoriteDate < :endDate " +
            "ORDER BY e.title")
    List<UserEbookStatisticsDto> listFavoriteEbooksByUserByDateJPQL(@Param("username") String username,
                                                                    @Param("startDate") LocalDate startDate,
                                                                    @Param("endDate") LocalDate endDate);

    // List all UserEbook By owned by a user
    List<UserEbook> findByUserUsername(String username);


//    @Query("SELECT new com.axonactive.training.ebookapp.service.dto.UserEbookDto() " +
//    "FROM User"

}
