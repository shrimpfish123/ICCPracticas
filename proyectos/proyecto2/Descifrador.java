public class Descifrador {

    public String descifraNulo(String original, int n) {
        String mensaje = "";
        String palabra = "";
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (c == ' ') {
                if (palabra.length() > n) {
                    mensaje += palabra.charAt(n);
                }
                palabra = "";
            } else {
                palabra += c;
            }
        }
        if (palabra.length() > n) {
            mensaje += palabra.charAt(n);
        }
        return mensaje;
    }

    public String descifraNulo(String original) {
        int n = 0;
        for (int i = original.length() - 1; i >= 0; i--) {
            if (original.charAt(i) == ' ') {
                n++;
            } else {
                break;
            }
        }
        return descifraNulo(original.trim(), n);
    }

    public boolean contieneNombre(String mensaje, String nombre) {
        String limpio = "";
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (Character.isLetter(c)) {
                limpio += Character.toLowerCase(c);
            }
        }

        String nombreLimpio = "";
        for (int i = 0; i < nombre.length(); i++) {
            nombreLimpio += Character.toLowerCase(nombre.charAt(i));
        }

        return limpio.contains(nombreLimpio);
    }

    public String descifraPalabrasMarcadas(String m, String e) {
        String palabra1 = "", palabra2 = "";
        String mensaje = "";
        int i = 0, j = 0;

        while (i < m.length() && j < e.length()) {
            char c1 = m.charAt(i);
            char c2 = e.charAt(j);

            if (c1 != ' ') {
                palabra1 += c1;
                i++;
            } else {
                i++;
            }

            if (c2 != ' ') {
                palabra2 += c2;
                j++;
            } else {
                if (!palabra1.equals(palabra2)) {
                    mensaje += palabra2 + " ";
                }
                palabra1 = "";
                palabra2 = "";
                j++;
            }
        }

        if (!palabra1.equals(palabra2) && palabra2.length() > 0) {
            mensaje += palabra2;
        }

        return mensaje.trim();
    }

    public String descifraLetrasMarcadas(String m, String e) {
        String resultado = "";
        int min = Math.min(m.length(), e.length());
        for (int i = 0; i < min; i++) {
            if (m.charAt(i) != e.charAt(i)) {
                resultado += e.charAt(i);
            }
        }
        return resultado;
    }
}
