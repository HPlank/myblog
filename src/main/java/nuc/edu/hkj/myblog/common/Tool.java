package nuc.edu.hkj.myblog.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tool {

    public static Date getNowTime() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date1 = new Date();
        String s = simpleDateFormat.format(date1);
        Date date = simpleDateFormat.parse(s);
        return date;
    }

}
