package com.axonactive.training.ebookapp.entity;

import com.axonactive.training.ebookapp.security.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    private LocalDateTime uploadDate;

    @Column
    private String coverImage;

    @Column
    private boolean favorite;

    @CreatedDate
//    @LastModifiedDate
    private LocalDate favoriteDate;

    @Column
    @Enumerated(EnumType.STRING)
    private UserEbookStatus status;

    @ManyToOne
    @JoinColumn
    private Ebook ebook;

    @ManyToOne
    @JoinColumn
    private User user;

}
