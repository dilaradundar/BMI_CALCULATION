package com.example.demo.user;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
	
	@Query("SELECT u FROM Users u WHERE u.Id=?1")
	Optional<Users> findUserByID(Long userID);

	@Query("SELECT u FROM Users u WHERE (u.firstName = ?1 OR u.C_date = ?2)")
    Optional<List<Users>> findUsersByNameOrDate(String FirstName,Date CDate);
}
