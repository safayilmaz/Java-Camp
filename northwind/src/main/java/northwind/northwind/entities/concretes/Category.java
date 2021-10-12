package northwind.northwind.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name="categories")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(mappedBy = "categories")
    private List<Product> products;
}
