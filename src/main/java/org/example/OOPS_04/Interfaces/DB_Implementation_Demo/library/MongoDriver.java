package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;

public class MongoDriver {

    public void save(User u){
        System.out.println("Saving into mongo");
    }

    public void update(int id, User u, boolean upsert){
        // upsert--> update +insert, check if no entry earlier then insert else update

        System.out.println("Update using mongo user with id " + id + "with upsert: " + upsert);

    }
}
