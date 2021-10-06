package hrms.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "Positions")
public class Positions {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "jobTitle")
    private String jobTitle;

    @Column(name = "jobDescription")
    private String jobDescription;

    public Positions (){

    }
    public Positions(int id, String jobTitle, String jobDescription) {
        this.setId(id);
        this.setJobTitle(jobTitle);
        this.setJobDescription(jobDescription);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
