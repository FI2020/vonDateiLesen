/*
Ausgabe-/Eingabe-Streams Java

Aufg.1:
Schreiben Sie in eine Datei mit dem Namen input.dat einen beliebigen Text. Speichern Sie diese im Programmordner ab. Lesen Sie anschließend den Text aus der Datei aus und schließen Sie folgende Bearbeitungsschritte an diesen Vorgang an:
a.	Der Text wird in Uppercase verwandelt
b.	Jede Zeile erhält eine fortlaufende Nummer
Schreiben Sie anschließend den Text in eine zweite Datei mit dem Namen output.dat.
 */

import java.io.*;
public class VonDateiLesen {
       static int zahl=0;
    public static void main(String[] args) {
             BufferedReader br=null;
             BufferedWriter bw=null;
             File input = new File("input.dat");
             File output = new File("output.dat");
            try{
             br = new BufferedReader(new FileReader(input));
             bw= new BufferedWriter(new FileWriter(output));
             String s ="";

             while((s=br.readLine())!=null){
                 bw.write((zahl++)+" "+s.toUpperCase()+"\n");
             }
             bw.flush();
             br.close();
             bw.close();
        }catch(IOException e){
                e.printStackTrace();
            }finally {
                try {
                    br.close();
                    bw.close();
                }catch(IOException x){
                    x.printStackTrace();
                }
            }

    }
}
