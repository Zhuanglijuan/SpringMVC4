package com.jxufe.editors;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Zhuang on 2018/4/17.
 */
public class MyDateEidtor extends PropertiesEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf = getSimpleDateFormat(text);
        try {
           Date date =  sdf.parse(text);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private SimpleDateFormat getSimpleDateFormat(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        if (Pattern.matches("^\\d{4}-\\d{1,2}-\\d{2}$", source)) { // yyyy-MM-dd
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        }  else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) { // yyyy/MM/dd
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        }  else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) { // yyyyMMdd
            sdf = new SimpleDateFormat("yyyyMMdd");
        } else if (Pattern.matches("^\\d{4}\\.\\d{2}\\.\\d{2}$", source)) { // yyyy.MM.dd
            sdf = new SimpleDateFormat("yyyy.MM.dd");
        }else{
            throw new TypeMismatchException("",Date.class);
        }
        return sdf;
    }


}
