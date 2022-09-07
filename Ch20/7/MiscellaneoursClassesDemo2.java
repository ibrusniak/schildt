import java.util.Base64;


public class MiscellaneoursClassesDemo2 {

    public static void main(String[] args) {
        
        Base64.Encoder encoder = Base64.getEncoder();

        String encoded = encoder.encodeToString("Input_Кирилица".getBytes());
        System.out.println(encoded);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encoded);

        String st = "";
        for (int i = 0; i < decodedBytes.length; i++) {
            st += String.valueOf((char)decodedBytes[i]);
        }

        System.out.println(st);
    }
}

