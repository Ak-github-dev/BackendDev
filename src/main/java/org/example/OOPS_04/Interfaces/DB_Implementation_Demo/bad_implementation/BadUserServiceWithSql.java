package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.bad_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;
import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library.MySqlDriver;

public class BadUserServiceWithSql {
    MySqlDriver db;

    public User saveUser(User u){
        db.insert(u);
        return u;
    }

    public User update(int id, User updated){
        db.update(id, updated);
        return updated;
    }
}
