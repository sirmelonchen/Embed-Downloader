package de.sirmelonchen;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    static String configFilePath = "./config.properties"; // add config
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to check after the Config file:");
        String config_create = input.next();
        if (config_create.equalsIgnoreCase("yes")){
            create_config();
        }
        System.out.println("Insert here the Link to Download:");
        String url = input.next();
        addConfig("URL", url);
        Downloader.main();




    }

    static void create_config() throws IOException {
        File f = new File(configFilePath);
        if(f.exists() && !f.isDirectory()) {
            System.out.println("The config file is already existing!");
        }else{
            //Instantiating the properties file
            Properties props = new Properties();
            //Populating the properties file
            props.put("Version", "V0.1");
            props.put("Path", "./Downloads");
            //Instantiating the FileInputStream for output file
            String path = configFilePath;
            FileOutputStream outputStrem = new FileOutputStream(path);
            //Storing the properties file
            props.store(outputStrem, "Config, DO NOT CHANGE IF YOU NOT KNOW WHAT YOU DO");
            System.out.println("Properties file created......");
        }

    }

    public static String getConfig(String arg) throws IOException {
        String config = null;

        FileInputStream propsInput = new FileInputStream(configFilePath);
        Properties prop = new Properties();
        prop.load(propsInput);
        config = prop.getProperty(arg);


        return config;

    }

    public static void addConfig(String name, String data) throws IOException {
        Properties props = new Properties();
        FileInputStream propsInput = new FileInputStream(configFilePath);
        props.load(propsInput);
        //Populating the properties file
        props.setProperty(name, data);
        //Instantiating the FileInputStream for output file
        String path = configFilePath;
        FileOutputStream outputStrem = new FileOutputStream(path);
        //Storing the properties file
        props.store(outputStrem, "");
    }

    public static void delConfig(String name) throws IOException {

        Properties props = new Properties();
        FileInputStream propsInput = new FileInputStream(configFilePath);
        props.load(propsInput);
        props.remove(name);
        FileOutputStream propsOutput = new FileOutputStream(configFilePath);
        props.store(propsOutput, null);
    }
}