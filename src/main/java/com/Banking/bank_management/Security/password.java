package com.Banking.bank_management.Security;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class password {
    public static String encoding(String p){
        String str = Base64.getEncoder().encodeToString(p.getBytes());
        return str;
    }
    public static String decoding(String p){
        byte[] b = p.getBytes();
        String str = Arrays.toString(Base64.getDecoder().decode(b));
        return str;
    }
}
