package com.java.pattern.behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args){
        ChatRoom cRoom = new ChatRoom("Kanishka Wedding");
        Member member1 = new Member("Anoop", "Boppidi");
        Member member2 = new Member("Sriharsha", "Vankamamidi");
        Member member3 = new Member("Kishore", "Morusu");
        cRoom.add(member1);
        cRoom.add(member2);
        cRoom.add(member3);

        cRoom.receiveMessage("Wedding is on Aug 27th");
    }
}
