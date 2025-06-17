package com.ramesh.spring.jwt.model;

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
@Table(name="ADDRESSES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private Long addressId;

    @NotBlank
    @Size(min=5, message="street must be at least 5 chars")
    private String street;

    @NotBlank
    private String houseNumber;

    @NotBlank
    @Size(min=2, message="state name must be atleast 2 chars")
    private String state;

    @NotBlank
    @Size(min=5, max=5, message = "must be 5 chars")
    private String zipcode;

    public Address(String street, String houseNumber, String state, String zipcode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.state = state;
        this.zipcode = zipcode;
    }

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();
}
