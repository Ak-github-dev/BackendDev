package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.good_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;
import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.library.MySqlDriver;

public class MySqlDbOps implements DbOperations{

    MySqlDriver db = new MySqlDriver();

    @Override
    public User insert(User user) {
        db.insert(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        db.update(id, user);
        return user;
    }
}
