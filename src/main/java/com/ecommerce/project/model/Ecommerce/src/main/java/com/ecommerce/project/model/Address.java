package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 3, message = "Street name must atleast 3 character")
    private String street;

    @NotBlank
    @Size(min = 3, message = "Building name must atleast 3 character")
    private String buildingName;

    @NotBlank
    @Size(min = 3, message = "City name must atleast 3 character")
    private String city;

    @NotBlank
    @Size(min = 3, message = "State name must atleast 3 character")
    private String state;

    @NotBlank
    @Size(min = 3, message = "Country name must atleast 3 character")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Street name must atleast 6 character")
    private String pinCode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();

    public Address(String street, String buildingName, String city, String state, String country, String pinCode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
