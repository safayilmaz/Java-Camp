package hrms.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "Employers")
public class Employer extends User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "userId")
    private int userId;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "domain")
    private String domain;

    public Employer (){

    }

    public Employer(int id, int userId, String companyName, String email, String password, String domain) {
        this.setId(id);
        this.setUserId(userId);
        this.setCompanyName(companyName);
        this.setEmail(email);
        this.setPassword(password);
        this.setDomain(domain);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
