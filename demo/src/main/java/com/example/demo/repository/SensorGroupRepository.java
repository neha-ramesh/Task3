package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.SensorGroup;

@Repository
public interface SensorGroupRepository extends JpaRepository<SensorGroup, Long> {

    @Query("SELECT COUNT(DISTINCT s.sensorGroupName) FROM SensorGroup s " +
           "WHERE s.createdBy = :createdBy AND s.isDeleted = false")
    Long countDistinctSensorGroupsByUser(String createdBy);
}
