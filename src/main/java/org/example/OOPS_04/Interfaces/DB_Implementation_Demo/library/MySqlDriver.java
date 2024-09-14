package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;

public class MySqlDriver {

    public void insert(User u){
        System.out.println("Inserting into mysql db");
    }

    public void update(int id, User updated){
        System.out.println("Updating using sql user with id" + id);
    }
}
