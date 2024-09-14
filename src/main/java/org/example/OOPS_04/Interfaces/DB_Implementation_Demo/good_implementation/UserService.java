package org.example.OOPS_04.Interfaces.DB_Implementation_Demo.good_implementation;

import org.example.OOPS_04.Interfaces.DB_Implementation_Demo.User;

public class UserService {
    static DbOperations db = new MySqlDbOps();

    public User saveUser(User u){
        return db.insert(u);
    }

    public User update(int id,User updated){
        return db.update(id, updated);
    }

    public static void main(String[] args) {
        db.insert(new User());
        db.update(1, new User());
    }
}
