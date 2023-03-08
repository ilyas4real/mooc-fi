/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fora
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean save() {
        try ( PrintWriter writer = new PrintWriter(file)) {
            for (String key : this.dictionary.keySet()) {
                String value = this.dictionary.get(key);
                writer.println(key + ":" + value);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        for (String key : this.dictionary.keySet()) {
            if (this.dictionary.get(key).equals(word)) {
                return key;
            }
        }

        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }

        Iterator<String> iterator = this.dictionary.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (this.dictionary.get(key).equals(word)) {
                iterator.remove();
            }
        }
    }
}
