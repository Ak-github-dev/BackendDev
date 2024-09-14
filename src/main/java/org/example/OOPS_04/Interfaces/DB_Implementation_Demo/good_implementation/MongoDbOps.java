package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.good_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;
import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library.MongoDriver;

public class MongoDbOps implements DbOperations{
    MongoDriver db = new MongoDriver();

    public User insert(User user) {
        db.save(user);
        return user;
    }

    public User update(int id, User user) {
        db.update(id, user, false);
        return user;
    }
}
