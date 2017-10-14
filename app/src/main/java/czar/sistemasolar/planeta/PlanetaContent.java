package czar.sistemasolar.planeta;

import android.media.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetaContent {

    public static final List<PlanetaItem> ITEMS = new ArrayList<PlanetaItem>();

    public static final Map<String, PlanetaItem> ITEM_MAP = new HashMap<String, PlanetaItem>();

    public static final String[] NOMBRES = new String[] {
                "Mercurio",
                "Venus",
                "Tierra",
                "Marte",
                "J\u00FApiter",
                "Saturno",
                "Urano",
                "Neptuno"
    };

    public static final String[] RADIOS = new String[] {
            "2,440 Km",
            "6,052 Km",
            "6,371 Km",
            "3,390 Km",
            "69,911 Km",
            "58,232 Km",
            "25,362 Km",
            "24,622 Km"
    };

    public static final String[] DISTANCIAS = new String[] {
            "57.91x10^10 km",
            "108.2x10^10 km",
            "149.6x10^10 Km",
            "227.9x10^10 Km",
            "778.5x10^10 Km",
            "1,429x10^10 Km",
            "2,871x10^10 Km",
            "4,498x10^10 Km"
    };

    public static final String[] SUPERFICIES = new String[] {
            "7.5×10^7 km²",
            "4.60×10^8 km²",
            "510.1x10^10 Km²",
            "144.8x10^10 Km²",
            "61.42x10^13 Km²",
            "4.38x10^16 Km²",
            "8.083x10^13 Km²",
            "7.618x10^13 Km²"
    };

    public static final String[] GRAVEDADES = new String[] {
            "3.7 m/s²",
            "8.87 m/s²",
            "9.807 m/s²",
            "3.711 m/s²",
            "24.79 m/s²",
            "10.44 m/s²",
            "8.69 m/s²",
            "11.15 m/s²"
    };

    public static final String[] PERIODOS = new String[] {
            "115.88 d\u00EDas",
            "224.70 d\u00EDas",
            "365.25 d\u00EDas",
            "686.97 d\u00EDas",
            "398.9 d\u00EDas",
            "378.1 d\u00EDas",
            "369.66 d\u00EDas",
            "60,190 d\u00EDas"
    };

    public static final String[] MASAS = new String[] {
            "3.302×10^23 kg",
            "4.869×10^24 kg",
            "5.9736x10^24 Kg",
            "6.4185x10^23 Kg",
            "1.899x10^27 Kg",
            "5.688x10^26 Kg",
            "8.681x10^25 Kg",
            "1.024x10^26 Kg"
    };

    public static final String[] VOLUMENES = new String[] {
            "6.083×10^10 km³",
            "9.28x10^11 km³",
            "1.08321×10^12 Km³",
            "1.6318×10^12 Km³",
            "143.128×10^10 Km³",
            "8.27×10^20 Km³",
            "6.833×10^13 Km³",
            "6.254×10^13 Km³"
    };

    public static final String[] DENSIDADES = new String[] {
            "5.43 g/cm³",
            "5.24 g/cm³",
            "5.515 g/cm³",
            "3.9335 ± 0.0004 g/cm³",
            "1.33 g/cm³",
            "690 kg/m³",
            "1.27 g/cm³",
            "1.64 g/cm³"
    };

    static {
        for (int i = 0; i < NOMBRES.length; i++) {
            PlanetaItem planeta = new PlanetaItem();
            planeta.id = "" + (i + 1);
            planeta.nombre = NOMBRES[i];
            planeta.radio = RADIOS[i];
            planeta.distancia = DISTANCIAS[i];
            planeta.superficie = SUPERFICIES[i];
            planeta.gravedad = GRAVEDADES[i];
            planeta.periodo = PERIODOS[i];
            planeta.masa = MASAS[i];
            planeta.volumen = VOLUMENES[i];
            planeta.densidad = DENSIDADES[i];
            addItem(planeta);
        }
    }

    private static void addItem(PlanetaItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class PlanetaItem {
        public String id;
        public String nombre;
        public String radio;
        public String distancia;
        public String superficie;
        public String gravedad;
        public String periodo;
        public String masa;
        public String volumen;
        public String densidad;
        public String image;

        @Override
        public String toString() {
            return nombre;
        }
    }
}
