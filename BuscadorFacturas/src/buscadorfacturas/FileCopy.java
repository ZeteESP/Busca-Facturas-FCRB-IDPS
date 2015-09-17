/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorfacturas;

import java.io.*;

/**
 *
 * @author Adrián
 */
public class FileCopy {

    @SuppressWarnings("empty-statement")
    public void cmdDir() throws Exception {

        Runtime r = Runtime.getRuntime();
        String[] comando = {"cmd", "/C", "dir"};
        Process p = r.exec(comando);
        try (BufferedReader bR = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String texto;
            while ((texto = bR.readLine()) != null) {
                System.out.println(texto);
            }
        }
    }

    public FileCopy(String pathFactura, String destino) throws Exception {

        Runtime r = Runtime.getRuntime();
        String[] comando = {"cmd", "/C", "copy "+pathFactura+" "+destino};
        Process p = r.exec(comando);
//        try (BufferedReader bR = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
//            String texto;
//            while ((texto = bR.readLine()) != null) {
//                System.out.println(texto);
//            }
//        }
    }

    
    public static void main(String[] args) throws Exception {
//        FileCopy fileCopy = new FileCopy();
    }
}
