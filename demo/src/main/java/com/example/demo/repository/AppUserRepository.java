package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    @Query("SELECT COUNT(u) FROM AppUser u WHERE u.parentName = :parentName")
    long countTotalCustomersByParentName(@Param("parentName") String parentName);

    @Query("SELECT COUNT(u) FROM AppUser u WHERE u.parentName = :parentName AND u.isActive = true")
    long countActiveCustomersByParentName(@Param("parentName") String parentName);

    @Query("SELECT COUNT(u) FROM AppUser u WHERE u.parentName = :parentName AND u.isActive = false")
    long countInactiveCustomersByParentName(@Param("parentName") String parentName);
}
