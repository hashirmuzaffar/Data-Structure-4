/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;

/**
 *
 * @author 22816
 */
class cast {

    String name;
    cast next;
    cast prev;

    public cast(String name) {
        this.name = name;
    }
}

public class CastLL {

    cast head;

    public void Insert(String T) {
        cast newnode = new cast(T);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }
    }

    @Override
    public String toString() {
        String str = "";
        cast temp = head;
        while (temp != null) {
            str += "Name = " + temp.name + "\n";
            temp = temp.next;
        }
        return str;
    }
}
