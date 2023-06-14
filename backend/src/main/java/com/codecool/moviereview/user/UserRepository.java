package com.codecool.moviereview.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
       boolean existsByEmail(String email);
       Optional<User> findByEmail(String email);
    @Query("select u.favoriteMovieIDs from User u where u.id = :userId")
    Set<Long> findFavoriteMovieIdsByUserId(@Param("userId") Long userId);
}
