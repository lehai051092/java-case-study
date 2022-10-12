package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HandleFile {
    public static <E> void writeToFile(String path, List<E> elements) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(elements);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <E> List<E> readDataFromFile(String path) {
        List<E> elements = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            elements = (List<E>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return elements;
    }
}
