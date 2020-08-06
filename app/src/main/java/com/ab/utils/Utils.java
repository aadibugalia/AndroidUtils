package com.ab.utils;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    public boolean validateName(int minLength, int maxLength, String name, String error, Context ctx){
        boolean ret= false;
        if(name!=null && name.length()>=minLength && name.length()<=maxLength){
            ret =true;
        }else {
            Toast.makeText(ctx, error, Toast.LENGTH_LONG).show();
        }


        return ret;
    }

    public boolean validateName(int minLength, int maxLength, String name){

        boolean ret= false;
        if(name!=null && name.length()>=minLength && name.length()<=maxLength){
            ret =true;
        }

        return ret;
    }
}
