package com.ithema.filter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFilter implements Converter<String , Date> {
    private SimpleDateFormat format = new SimpleDateFormat();
    @Override
    public Date convert(String source) {
        if (source == null) { return null;}
        try{format.applyPattern("yyyy-MM-dd");return format.parse(source);}catch(Exception e){}
        try{format.applyPattern("yyyy/MM/dd");return format.parse(source);}catch(Exception e){}
        try{format.applyPattern("yyyy.MM.dd");return format.parse(source);}catch(Exception e){}
        try{format.applyPattern("yyyy:MM:dd");return format.parse(source);}catch(Exception e){
            throw new NullPointerException("不支持的日期格式！");
        }
    }
}
