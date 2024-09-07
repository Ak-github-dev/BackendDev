package org.example.OOPS_03.demo2;

public class Scenario2 {
}


class AA{
    public AA(){
        System.out.println("AA");
    }
}

class BB extends AA{
    public BB(){
    //private BB(){
        System.out.println("BB");
    }
}

class CC extends BB{
    public CC(){//There is no parameterless constructor available in 'org.example.OOPS_03.demo2.BB'
        System.out.println("CC");
    }
}