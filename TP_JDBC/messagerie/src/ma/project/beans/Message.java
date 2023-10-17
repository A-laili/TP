/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.beans;

import java.util.Date;

/**
 *
 * @author Asmaa
 */
public class Message {
    private String objet;
    private String sujet;
    private Date date;
    private Employe EmpEmetteur;
    private Employe EmpRecepteur;

    public Message(String objet, String sujet, Date date, Employe EmpEmetteur, Employe EmpRecepteur) {
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.EmpEmetteur = EmpEmetteur;
        this.EmpRecepteur = EmpRecepteur;
    }

    public Message(String objet, String sujet, Date date) {
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
    }

    public Employe getEmpEmetteur() {
        return EmpEmetteur;
    }

    public void setEmpEmetteur(Employe EmpEmetteur) {
        this.EmpEmetteur = EmpEmetteur;
    }

    public Employe getEmpRecepteur() {
        return EmpRecepteur;
    }

    public void setEmpRecepteur(Employe EmpRecepteur) {
        this.EmpRecepteur = EmpRecepteur;
    }
    
    /**
     *
     * @param objet
     * @param sujet
     * @param date
     */
  
   
    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Message() {
    }

    public String getObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
