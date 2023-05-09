/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;

/**
 *
 * @author BABAR
 */
public class Node {

    String Title;
    int Year;
    cast CastList;
    Node prev;
    Node next;

    public Node(String Title, int Year, CastLL i) {
        this.Title = Title;
        this.Year = Year;
        this.CastList = i.head;
    }
}
