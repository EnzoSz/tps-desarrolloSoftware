package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.*;

import java.lang.ref.Cleaner;

public class PersistenceApp {
    public static void main(String[] args) {
        // Conexion con nuestra unidad de Persistencia
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Persistencia_JPA");

        // Crear una nueva instancia de EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin(); //inicia la transaccion
//            //Creamos un cliente
//            Cliente cliente1 = Cliente.builder()
//                    .nombre("Enzo")
//                    .apellido("Soliz")
//                    .dni(39953917)
//                    .build();
//            //Creamos un domicilio
//            Domicilio domicilio1 = Domicilio.builder()
//                    .nombreCalle("Belgrano")
//                    .numero(1104)
//                    .build();
//            cliente1.setDomicilio(domicilio1);
//            domicilio1.setCliente(cliente1);
//            entityManager.persist(cliente1);
            Domicilio dom = entityManager.find(Domicilio.class, 1L);
            Cliente cliente = entityManager.find(Cliente.class, 1L);
            System.out.println("Cliente de domicilio " + dom.getCliente().getNombre());
            System.out.println("Domicilio de cliente " + cliente.getDomicilio().getNombreCalle());

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
