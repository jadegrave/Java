package com.teamtreehouse;

import java.io.*;

public class Treets {
    public static void save(Treet[] treets) {

        // this is a try with resources block - so you don't need to use finally
        // Creates a file whichis sent to the ObjectOutputStream oos. ObjectOutputStreams can take what is in memory
        // and write it to a file in binary
        try (
                // create a file
                FileOutputStream fos = new FileOutputStream("treets.ser");  // file name -relative to code that is being executed
                ObjectOutputStream oos = new ObjectOutputStream(fos);     // use this to serialize our array of Treets
        ) {
            oos.writeObject(treets);  // write to binary file
        } catch (IOException ioe) {
            System.out.println("Problem saving Treets");
            ioe.printStackTrace();
        }

    }

    public static Treet[] load() {
        Treet[] treets = new Treet[0];

        try (
                FileInputStream fis = new FileInputStream("treets.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            treets = (Treet[]) ois.readObject();  // cast to a treet array;
        } catch (IOException ioe) {
            System.out.println("Error reading file");
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error loading treets");
            cnfe.printStackTrace();
        }
        return treets;
    }
}
