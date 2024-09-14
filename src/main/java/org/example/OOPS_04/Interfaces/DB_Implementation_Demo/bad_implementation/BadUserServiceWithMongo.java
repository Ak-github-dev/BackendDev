package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.bad_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;
import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library.MongoDriver;

public class BadUserServiceWithMongo {
    MongoDriver db;

    public User saveUser(User u){
        db.save(u);
        return u;
    }

    public User update(int id,User updated){
        db.update(id, updated, false);
        return updated;
    }
}
