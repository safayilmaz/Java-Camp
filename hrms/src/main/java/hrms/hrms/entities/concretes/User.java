package hrms.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;
    @Column(name = "userId")
    int userId;
}
