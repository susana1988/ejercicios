/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofile;

import java.io.File;

/**
 *
 * @author -
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dirPublico = System.getProperty("user.home");
        String dirPrivado = System.getProperty("user.dir");

        System.out.println(dirPublico);
        System.out.println(dirPrivado);

        File directorio = new File(dirPublico);
        StringBuilder linea = new StringBuilder();
        linea.append("");

        for (File file : directorio.listFiles()) {
            if (file.isDirectory()) {
                linea.append("<DIR>\t");
            }
            if (file.isFile()) {
                linea.append(String.valueOf(file.length())).append("\n");
            }
            linea.append(file.getName()).append("\n");

        }
        System.out.println(linea);

    }

}
