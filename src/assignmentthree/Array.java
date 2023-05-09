/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;

/*
 *
 * @author BABAR
**/


public class Array {

    Node[] arr = new Node[26];
    Node head;

    public void Insert(String T, int Y, CastLL L) {
        int i = (int) (T.charAt(0)) - 65;
        Node newnode = new Node(T, Y, L);

        if (arr[i] == null) {
            arr[i] = newnode;
        } else {
            newnode.next = arr[i];
            arr[i].prev = newnode;
            arr[i] = newnode;

        }
    }

    public Boolean Find(String value) {
        int i = (int) (value.charAt(0)) - 65;
        Node temp = arr[i];
        while (temp != null) {
            if (temp.Title.compareTo(value) == 0) {
                return true;
            }
            temp = temp.next;
        }
        System.out.println("\nTitle not found");
        return false;
    }

    public void Delete(String value) {
        int i = (int) (value.charAt(0)) - 65;
        Node temp = arr[i];
        while (temp.next != null && temp.Title.compareTo(value) != 0) {
            temp = temp.next;
        }
        if (temp == arr[i]) {
            arr[i] = temp.next;
//            temp.next.prev = null;
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
        for (int i = 0; i <= 25; i++) {
            Node temp = arr[i];
            while (temp != null) {
                str += "Tile of Movie = " + temp.Title + ", Year of Release = " + temp.Year + "\n";
                cast temp2 = temp.CastList;
                while (temp2 != null) {
                    str += " Cast name  = " + temp2.name + "\n";
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }
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
