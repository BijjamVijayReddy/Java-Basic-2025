package Polymorphism.OverRiding;


class WhatAppV1 {
    void message (){
        System.out.println("Text Message");
    }
}

class WhatApp2 extends  WhatAppV1 {

    @Override
    void message (){
        System.out.println("Text + Audio Message");
    }
}

class WhatApp3 extends WhatApp2{
    @Override
    void message (){
        System.out.println("Text + Audio + Video Message");
    }
}

public class OverRiding__002 {

    public static void main (String[] args){
        WhatApp3 overRiding = new WhatApp3();
        overRiding.message();
    }
}
