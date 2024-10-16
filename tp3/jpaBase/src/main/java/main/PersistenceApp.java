package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.*;

public class PersistenceApp {
    public static void main(String[] args) {
        // Conexion con nuestra unidad de Persistencia
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Persistencia_JPA");

        // Crear una nueva instancia de EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin(); //inicia la transaccion

            //Crea una factura
//            Factura factura =  Factura.builder()
//                    .numero(12)
//                    .total(5555)
//                    .build();
//            entityManager.persist(factura); //persistimos en la bases de datos la factura
            entityManager.flush();

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            entityManager.getTransaction().rollback();
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
