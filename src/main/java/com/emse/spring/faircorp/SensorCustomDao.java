package com.emse.spring.faircorp;

import com.emse.spring.faircorp.model.Sensor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SensorCustomDao {
    @Query("select s from Sensor s where s.name = :search_text")
    List<Sensor> findBySiteText(@Param("search_text") String searchText);
}
