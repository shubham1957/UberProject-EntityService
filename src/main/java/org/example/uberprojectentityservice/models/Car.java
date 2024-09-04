package org.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseModel{

    @Column(nullable = false,unique = true)
    private String plateNumber;

    private String brand;

    private String model;

    @ManyToOne
    private Color color;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    @OneToOne
    private Driver driver;
}
