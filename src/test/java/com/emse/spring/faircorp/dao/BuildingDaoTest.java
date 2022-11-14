package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Building;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BuildingDaoTest {
    @Autowired
    private BuildingDao buildingDao;

    @Test
    public void ShouldFindABuilding() {
        {
            Building building = buildingDao.getReferenceById(1L);
            Assertions.assertThat(building.getId()).isEqualTo(1L);
            Assertions.assertThat(building.getName()).isEqualTo("Building 1");
            Assertions.assertThat(building.getRooms().size()).isEqualTo(1);

        }
    }
}
