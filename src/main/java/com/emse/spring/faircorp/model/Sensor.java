package com.emse.spring.faircorp.model;

import com.emse.spring.faircorp.PowerSource;

import javax.persistence.*;

    @Entity // (1).
    @Table(name = "SP_SENSOR") // (2).
    public class Sensor {
        @Id // (3).
        @GeneratedValue
        private Long id;

        @Column(nullable=false, length=255)  // (4).
        private String name;

        private String description;

        @Column(name = "power") // (4).
        private Integer defaultPowerInWatt;

        @Transient // (5).
        private Integer notImportant;

        @Enumerated(EnumType.STRING) // (6).
        private PowerSource powerSource;

        public Sensor() { // (7).
        }

        public Sensor(Long id, String name, String description, Integer defaultPowerInWatt, Integer notImportant, PowerSource powerSource) { //8
            this.id = id;
            this.name = name;
            this.description = description;
            this.defaultPowerInWatt = defaultPowerInWatt;
            this.notImportant = notImportant;
            this.powerSource = powerSource;
        }

        public Long getId() { // (9).
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDefaultPowerInWatt() {
            return defaultPowerInWatt;
        }

        public void setDefaultPowerInWatt(Integer defaultPowerInWatt) {
            this.defaultPowerInWatt = defaultPowerInWatt;
        }

        public Integer getNotImportant() {
            return notImportant;
        }

        public void setNotImportant(Integer notImportant) {
            this.notImportant = notImportant;
        }

        public PowerSource getPowerSource() {
            return powerSource;
        }

        public void setPowerSource(PowerSource powerSource) {
            this.powerSource = powerSource;
        }
    }

