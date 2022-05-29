package app.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue
    private Integer phone_id;

    @NotNull
    private String assigned_ip;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Integer getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(Integer phone_id) {
        this.phone_id = phone_id;
    }

    public String getAssigned_ip() {
        return assigned_ip;
    }

    public void setAssigned_ip(String assigned_ip) {
        this.assigned_ip = assigned_ip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
