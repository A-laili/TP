/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.Date;
import ma.project.beans.Employe;
import ma.project.beans.Message;
import ma.project.service.EmployeService;
import ma.project.service.MessageService;

/**
 *
 * @author Asmaa
 */
public class Messagerie {
    
     public static void main(String[] args) {
         //Teste Employe
EmployeService es = new EmployeService();
//Création des employes
es.create(new Employe("LACHGAR", "Mohamed"));
es.create(new Employe("RAMI", "ALI"));
es.create(new Employe("SAFI", "Fatima"));
//Modification d’un employe
Employe e = es.getById(3);
    if (e != null) {
e.setNom("ALAOUI");
e.setPrenom("Manale");
es.update(e);
}
//Suppression d’un employe
//es.delete(es.getById(2));
//Liste des employes
for(Employe emp : es.getAll())
    System.out.println(""+emp.getNom());
     

    MessageService ms = new MessageService();
    ms.create(new Message("Réunion", "Réunion de fin d’année", new Date(), es.getById(1), es.getById(2)));
    ms.create(new Message("Réunion", "Réunion de fin d’année", new Date(),
    es.getById(1), es.getById(3)));
    ms.create(new Message("Stage", "Stage àMarrakech", new Date(),
    es.getById(2), es.getById(1)));
    ms.create(new Message("Stage", "Stage àMarrakech", new Date(),
    es.getById(2), es.getById(3)));
    //Les message reçus par l’employé 3
    for (Message m : ms.getAll()) {
    if(m.getEmpRecepteur().getId() == 3)
    System.out.println(""+m.getSujet());
}
     }
}