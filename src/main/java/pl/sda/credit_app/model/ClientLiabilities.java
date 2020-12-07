package pl.sda.credit_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "client_liabilities")
public class ClientLiabilities {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private double credit_cards_debt;

    @Column
    private double bank_account_debt;

    @Column
    private double child_suport;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
