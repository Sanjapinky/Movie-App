package com.codecool.moviereview.user;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Column(unique = true, nullable = false)
    private String email;
    @NotFound
    @Column(nullable = false)
    private String password;
    @ElementCollection
    private Set<Long> favoriteMovieIDs = new HashSet<>();
}
