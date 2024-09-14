package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.good_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;

public interface DbOperations {

    User insert(User user);

    User update(int id, User user);
}
