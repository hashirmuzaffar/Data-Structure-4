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


public class DLinkedList {

    Node head;

    public void Insert(String T, int Y, CastLL i) {
        Node newnode = new Node(T, Y, i);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }
    }

    public Node Find(String value) {
        Node temp = head;
        while (temp != null) {
            if (temp.Title.compareTo(value) == 0) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Title not found");
        return null;
    }

    public void Delete(String value) {
        Node temp = head;

        while (temp.next != null && temp.Title.compareTo(value) != 0) {
            temp = temp.next;
        }
        if (temp == head) {
            head = temp.next;
            temp.next.prev = null;
        } else if (temp.next == null) {
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

        }
    }

    @Override
    public String toString() {
        String str = "";
        Node temp = head;

        while (temp != null) {
            str += "Tile = " + temp.Title + ", Year = " + temp.Year + "\n";
            cast temp2 = temp.CastList;
            while (temp2 != null) {
                str += "Name  = " + temp2.name + "\n";
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return str;
    }

    public Boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

}
