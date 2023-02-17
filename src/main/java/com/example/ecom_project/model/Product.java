package com.example.ecom_project.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection="Product")
public class Product {
@Id
    private int id;
    private String productName;
    private String productDescription;
}
