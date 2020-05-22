package allproduct.controller.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    //@GeneratedValue
    int suk;
    String productName;
    String brand;
    long price;
    String color;
    int size;

    //TODO: int Size to create function


}
