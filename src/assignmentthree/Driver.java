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
public class Driver {

    public static void main(String[] args) {
        DLinkedList[] arr = new DLinkedList[25];
        Array DL = new Array();
        //DLinkedList DL = new DLinkedList();

        CastLL castlistone = new CastLL();
        castlistone.Insert("Millie Bobby Brown");
        castlistone.Insert("Lious Partridge");
        castlistone.Insert("Henry Cavil");
        DL.Insert("Enola Holmes", 2021, castlistone);

        CastLL castlisttwo = new CastLL();
        castlisttwo.Insert("Chris Hemsworth");
        castlisttwo.Insert("Kristen Stewart");
        castlisttwo.Insert("Charliz theron");
        castlisttwo.Insert("Sam Calfin");
        DL.Insert("Snow White and the Huntsman", 2012, castlisttwo);

        CastLL castlistthree = new CastLL();
        castlistthree.Insert("Macaulay Culkin");
        castlistthree.Insert("Joe Picsi");
        DL.Insert("Home alone", 2002, castlistthree);

        CastLL castlistfour = new CastLL();
        castlistfour.Insert("Rayn Goslin");
        castlistfour.Insert("Rachel Mcadems");
        DL.Insert("The Notebook", 1987, castlistfour);

       
        System.out.print(DL);
        System.out.println("\n"+DL.Find("The Notebook"));
        DL.Delete("The Notebook");
        System.out.println(DL.Find("The Notebook"));
        
        //System.out.print(DL);
        //System.out.println(DL.isEmpty());
    }

}
