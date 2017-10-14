package czar.sistemasolar;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import czar.sistemasolar.planeta.PlanetaContent;

/**
 * A fragment representing a single Planeta detail screen.
 * This fragment is either contained in a {@link PlanetaListActivity}
 * in two-pane mode (on tablets) or a {@link PlanetaDetailActivity}
 * on handsets.
 */
public class PlanetaDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    public static final String RADIO_MEDIO = "Radio medio:";

    public static final String DISTANCIA = "Distancia desde el sol:";

    public static final String SUPERFICIE = "Superficie:";

    public static final String GRAVEDAD = "Gravedad:";

    public static final String PERIODO = "Per\u00EDodo orbital:";

    public static final String MASA = "Masa:";

    private static final String VOLUMEN = "Volumen:";

    private static final String DENSIDAD = "Densidad:";

    public static final String NL = "\n";

    /**
     * The dummy content this fragment is presenting.
     */
    private PlanetaContent.PlanetaItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PlanetaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = PlanetaContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.nombre);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.planeta_detail, container, false);

        if (mItem != null) {
            int[][] indexes = new int[8][2];
            int idx = 0;
            StringBuilder sb = new StringBuilder();
            indexes[idx][0] = 0;
            indexes[idx][1] = RADIO_MEDIO.length();
            idx++;
            sb.append(RADIO_MEDIO).append(NL).append(mItem.radio).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + DISTANCIA.length();
            idx++;
            sb.append(DISTANCIA).append(NL).append(mItem.distancia).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + SUPERFICIE.length();
            idx++;
            sb.append(SUPERFICIE).append(NL).append(mItem.superficie).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + GRAVEDAD.length();
            idx++;
            sb.append(GRAVEDAD).append(NL).append(mItem.gravedad).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + PERIODO.length();
            idx++;
            sb.append(PERIODO).append(NL).append(mItem.periodo).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + MASA.length();
            idx++;
            sb.append(MASA).append(NL).append(mItem.masa).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + VOLUMEN.length();
            idx++;
            sb.append(VOLUMEN).append(NL).append(mItem.volumen).append(NL).append(NL);
            indexes[idx][0] = sb.length();
            indexes[idx][1] = sb.length() + DENSIDAD.length();
            idx++;
            sb.append(DENSIDAD).append(NL).append(mItem.densidad);


            SpannableStringBuilder str = new SpannableStringBuilder(sb.toString());
            for (int i = 0; i < indexes.length; i++) {
                str.setSpan(new StyleSpan(Typeface.BOLD), indexes[i][0], indexes[i][1], Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }


            ((TextView) rootView.findViewById(R.id.planeta_detail)).setText(str);
        }

        return rootView;
    }
}
