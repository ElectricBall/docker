/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Iqbal
 */
public class Helper {
    public String getValueRows(JTable table, int index){
        return table.getValueAt(table.getSelectedRow(), index).toString();
    }
    
    public String getParsedDate(String _date) throws ParseException{
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(_date);
        String formatted = new SimpleDateFormat("mm/dd/yy").format(date);
        return formatted;
    }
    
    public String parseDateToDatabase(JXDatePicker dp){
        Date date = (Date) dp.getDate();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String parsedDate = dt.format(date);
        
        return parsedDate;
    }
    
    public String hasil = "0";
    private int angka_pertama;
    private int angka_kedua;

    public void setAngka_pertama(int many) {
        this.angka_pertama = many;
    }

    public int getAngka_pertama() {
        return angka_pertama;
    }

    public void setAngka_kedua(int much) {
        this.angka_kedua = much;
    }

    public int getAngka_kedua() {
        return angka_kedua;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getHasil() {
        return hasil;
    }
    
    public void kali(int a, int b){
        int hasil = a * b;
        String total = hasil + "";
        setHasil(total);
    }
    
}
