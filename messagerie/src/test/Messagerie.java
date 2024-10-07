package test;

import ma.projet.beans.Employe;
import ma.projet.service.EmployeService;

public class Messagerie {

    public static void main(String[] args) {
        EmployeService es = new EmployeService();

    //creation d'un employee 
        es.create(new Employe("LACHGAR", "Mohamed"));
        es.create(new Employe("RAMI", "ALI"));
        es.create(new Employe("SAFI", "Fatima"));

        //modification des clients
        Employe e = es.getByid(3);
        e.setNom("reda");
        e.setPrenom("mohammed");
        es.update(e);

        //supression d'une employee
        es.delete(es.getByid(4));

        //Liste des employes 
        for (Employe emp : es.getAll()) {
            System.out.println("" + emp.getNom());
        }
    }
}
