/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Noelia
 */
public class Utilidades {
    public static ArrayList<String> getMeses(){
        ArrayList<String> meses = new ArrayList<String>();
        
        for (int j = 1; j <= 12; j++) {
            meses.add(String.valueOf(j));
        }
        return meses;
    }
    public static ArrayList<String> getDias(){
        ArrayList<String> dias = new ArrayList<String>();
        for (int i = 1; i <= 31; i++) {
            dias.add(String.valueOf(i));
        }
        return dias;
    }
    
    public static String signo(String mes, String dia){
                String resultado = "";
                
                int mesE = Integer.parseInt(mes);
                int diaE = Integer.parseInt(dia);

                switch (mesE) {
                    case 1:
                        if (diaE < 20) {
                            resultado = "capricornio";
                        } else {
                            resultado = "acuario";
                        }
                        break;
                    case 2:
                        if (diaE < 20) {
                            resultado = "acuario";
                        } else {
                            if (diaE > 29) {
                                resultado = "No existe el día " + dia + " para Febrero";
                            } else {
                                resultado = "piscis";
                            }
                            break;
                        }
                    case 3:
                        if (diaE < 20) {
                            resultado = "piscis";
                        } else {
                            resultado = "aries";
                        }
                        break;
                    case 4:
                        if (diaE < 20) {
                            resultado = "aries";
                        } else {
                            if (diaE > 30) {
                                resultado = "No existe el día " + dia + " para Abril";
                            } else {
                                resultado = "tauro";
                            }
                        }
                        break;
                    case 5:
                        if (diaE < 20) {
                            resultado = "tauro";
                        } else {
                            resultado = "geminis";
                        }
                        break;
                    case 6:
                        if (diaE < 20) {
                            resultado = "geminis";
                        } else {
                            if (diaE > 30) {
                                resultado = "No existe el día " + dia + " para Junio";
                            } else {
                                resultado = "cancer";
                            }
                        }
                        break;
                    case 7:
                        if (diaE < 20) {
                            resultado = "cancer";
                        } else {
                            resultado = "leo";
                        }
                        break;
                    case 8:
                        if (diaE < 20) {
                            resultado = "leo";
                        } else {
                            resultado = "virgo";
                        }
                        break;
                    case 9:
                        if (diaE < 20) {
                            resultado = "virgo";
                        } else {
                            if (diaE > 30) {
                                resultado = "No existe el día " + dia + " para Septiembre";
                            } else {
                                resultado = "libra";
                            }
                        }
                        break;
                    case 10:
                        if (diaE < 20) {
                            resultado = "libra";
                        } else {
                            resultado = "escorpio";
                        }
                        break;
                    case 11:
                        if (diaE < 20) {
                            resultado = "escorpio";
                        } else {
                            if (diaE > 30) {
                                resultado = "No existe el día " + dia + " para Noviembre";
                            } else {
                                resultado = "sagitario";
                            }
                        }
                        break;
                    case 12:
                        if (diaE < 20) {
                            resultado = "sagitario";
                        } else {
                            resultado = "capricornio";
                        }
                        break;
                }
                return resultado;
    }
    
}
