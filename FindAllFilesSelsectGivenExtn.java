package com.pe2;

import java.io.*;

public class FindAllFilesSelsectGivenExtn {
    public static void main(String[] args) throws Exception {
        BufferedReader br=null;
        br=new BufferedReader(new InputStreamReader(System.in));
        File directory=new File(br.readLine());
        File[] listOfFiles;
        FilenameFilter fileNameFilter = new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.lastIndexOf('.')>0) {

                    // get last index for '.' char
                    int lastIndex = name.lastIndexOf('.');

                    // get extension
                    String str = name.substring(lastIndex);

                    // match path name extension
                    if(str.equals(".txt")) {
                        return true;
                    }
                }

                return false;
            }
        };
        listOfFiles=directory.listFiles(fileNameFilter);
        File file=listOfFiles[0];
        System.out.println(file);
        try (FileInputStream fin = new FileInputStream(file)) {
            byte[] byteArray=new byte[(int)file.length()];
            fin.read(byteArray);
            String string=new String(byteArray);
            System.out.println(string);
        }
    }
}
