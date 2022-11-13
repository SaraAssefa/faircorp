package com.emse.spring.faircorp;

import com.emse.spring.faircorp.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDao extends JpaRepository<Sensor, String>, SensorCustomDao {

}
