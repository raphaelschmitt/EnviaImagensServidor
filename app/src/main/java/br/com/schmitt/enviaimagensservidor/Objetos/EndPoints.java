package br.com.schmitt.enviaimagensservidor.Objetos;

/**
 * Created by Raphael on 04/04/2018.
 */

public class EndPoints {
    private static final String ROOT_URL = "http://192.168.0.21/MyApi/api.php?apicall=";
    public static final String UPLOAD_URL = ROOT_URL + "uploadpic";
    public static final String GET_PICS_URL = ROOT_URL + "getpics";
}
