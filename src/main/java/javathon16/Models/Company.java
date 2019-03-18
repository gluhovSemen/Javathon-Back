package javathon16.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int maxBonus;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Client> clients;

    private Company(){}

    public Company(Long id, String name, int maxBonus){
        this.id = id;
        this.name = name;
        this.maxBonus = maxBonus;
        this.clients = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBonus() {
        return maxBonus;
    }

    public void setMaxBonus(int maxBonus) {
        this.maxBonus = maxBonus;
    }

    public Set<Client> getClients(){ return clients; }

    public void addClient(Client client){ clients.add(client); }

}
