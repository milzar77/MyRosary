package com.example.myrosarioprayer.support;

import android.content.Context;
import android.content.res.AssetManager;
import com.example.myrosarioprayer.R;

import java.io.*;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class RosarioResourceLoader {

    private static Context context;

    public static void init(Context current) {
        context = current;
    }

    public static Context getContext() {
        return context;
    }


    private static Properties properties;
    public static Properties findResource(String path){

        try{
            /*AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(path);
            properties.load(inputStream);*/

            InputStream io = RosarioResourceLoader.class.getClassLoader()
                    .getResourceAsStream(path);
            properties.load(io);

        }catch (Exception e){
            System.out.print(e.getMessage());
        }

        return properties;
    }


    public static final String getProperty(String key) {
        return properties.getProperty(key);
    }

}
