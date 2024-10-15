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
            entityManager.getTransaction().begin();

            Factura factura =  Factura.builder()
                    .numero(12)
                    .total(5555)
                    .build();
            entityManager.persist(factura);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception

        }
    }
}
