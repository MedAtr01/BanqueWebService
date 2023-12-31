package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreattion;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreattion) {
        this.code = code;
        this.solde = solde;
        this.dateCreattion = dateCreattion;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreattion(Date dateCreattion) {
        this.dateCreattion = dateCreattion;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreattion() {
        return dateCreattion;
    }
}
