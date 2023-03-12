package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvFontAdapter extends RecyclerView.Adapter<C9617c> {
    public double abc0;
    public int abc1002;
    public double abc1003;
    public ArrayList<Integer> abc1005;
    public double abc1006;
    public double abc1007;
    public int[] abc1008;
    public double abc1009;
    public double abc3;
    public float abc4;
    private Context context;
    private List<Typeface> list;
    private InterfaceC9616b onItemClickListner;
    private int selectedIndex;
    private int strokeWidth;
    public String abc1000 = "a";
    public int[] abc1001 = new int[15];
    public String abc1 = "值越大越模糊，0<";
    public double abc1004 = 0.5759541609739999d;
    public String[] abc2 = new String[13];

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFontAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9615a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15876a;

        public View$OnClickListenerC9615a(int i) {
            this.f15876a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvFontAdapter logoRvFontAdapter;
            if (LogoRvFontAdapter.this.onItemClickListner != null) {
                LogoRvFontAdapter.this.selectedIndex = this.f15876a;
                LogoRvFontAdapter logoRvFontAdapter2 = LogoRvFontAdapter.this;
                logoRvFontAdapter2.abc1000 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
                logoRvFontAdapter2.abc1007 = logoRvFontAdapter2.abc1007 > 0.198347903270382d ? 0.2653740306189951d : 0.6154829448586168d;
                if (logoRvFontAdapter2.abc1008 != null) {
                    int i = 0;
                    while (true) {
                        int[] iArr = LogoRvFontAdapter.this.abc1008;
                        if (i >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i] = 3;
                        i++;
                    }
                }
                LogoRvFontAdapter logoRvFontAdapter3 = LogoRvFontAdapter.this;
                String[] strArr = logoRvFontAdapter3.abc2;
                if (strArr != null) {
                    strArr[0] = null;
                    logoRvFontAdapter3.abc1009 = 0.9838217793744665d;
                    if (logoRvFontAdapter3.abc1008 == null) {
                        logoRvFontAdapter3.abc1008 = new int[10];
                    }
                    logoRvFontAdapter3.abc1003 = logoRvFontAdapter3.abc1003 > 0.3618648150530891d ? 0.9736282346131802d : 0.8330074486467748d;
                }
                logoRvFontAdapter3.abc1000 = "s the ";
                int[] iArr2 = logoRvFontAdapter3.abc1001;
                if (iArr2 != null) {
                    iArr2[8] = 6;
                }
                logoRvFontAdapter3.abc1009 += 0.04697435633906366d;
                logoRvFontAdapter3.notifyDataSetChanged();
                LogoRvFontAdapter logoRvFontAdapter4 = LogoRvFontAdapter.this;
                logoRvFontAdapter4.abc1004 = logoRvFontAdapter4.abc1004 < 0.9005428018063893d ? 0.26574036586507577d : 0.5497140774166626d;
                ArrayList<Integer> arrayList = logoRvFontAdapter4.abc1005;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoRvFontAdapter.this.abc1005.remove(0);
                }
                LogoRvFontAdapter logoRvFontAdapter5 = LogoRvFontAdapter.this;
                logoRvFontAdapter5.abc1004 *= 0.31199284271369787d;
                logoRvFontAdapter5.abc3 = 0.0771291448173268d;
                int i2 = 0;
                while (true) {
                    logoRvFontAdapter = LogoRvFontAdapter.this;
                    int i3 = logoRvFontAdapter.abc1002;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    logoRvFontAdapter.abc1003 = 0.6755098153243052d;
                    i2++;
                }
                logoRvFontAdapter.abc1003 = 0.5674275288297949d;
                logoRvFontAdapter.abc1006 += 0.16403637125425707d;
                logoRvFontAdapter.onItemClickListner.mo9186a(this.f15876a, (Typeface) LogoRvFontAdapter.this.list.get(this.f15876a));
                LogoRvFontAdapter logoRvFontAdapter6 = LogoRvFontAdapter.this;
                logoRvFontAdapter6.abc1002 = logoRvFontAdapter6.abc1002 >= 3 ? 5 : 6;
                if (!TextUtils.isEmpty(logoRvFontAdapter6.abc1000)) {
                    int length = LogoRvFontAdapter.this.abc1000.length();
                    LogoRvFontAdapter.this.abc1000 = LogoRvFontAdapter.this.abc1000 + length;
                }
                LogoRvFontAdapter logoRvFontAdapter7 = LogoRvFontAdapter.this;
                if (logoRvFontAdapter7.abc1003 > 0.8128428031078958d) {
                    logoRvFontAdapter7.abc1003 = 0.328248938798813d;
                }
                logoRvFontAdapter7.abc3 = logoRvFontAdapter7.abc3 < 0.6804965539185328d ? 0.522683689343004d : 0.2560925522082802d;
                int[] iArr3 = logoRvFontAdapter7.abc1001;
                if (iArr3 != null) {
                    iArr3[1] = 0;
                }
                logoRvFontAdapter7.abc1002 = 3;
                if (logoRvFontAdapter7.abc1005.size() < 3) {
                    LogoRvFontAdapter.this.abc1005.add(4);
                }
            }
            LogoRvFontAdapter logoRvFontAdapter8 = LogoRvFontAdapter.this;
            int[] iArr4 = logoRvFontAdapter8.abc1008;
            if (iArr4 != null) {
                iArr4[2] = 0;
            }
            logoRvFontAdapter8.abc1004 = 0.0715205773974299d;
            if (iArr4 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr5 = LogoRvFontAdapter.this.abc1008;
                    if (i4 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                        break;
                    }
                    iArr5[i4] = 2;
                    i4++;
                }
            }
            LogoRvFontAdapter logoRvFontAdapter9 = LogoRvFontAdapter.this;
            if (logoRvFontAdapter9.abc0 > 0.7704441639697421d) {
                logoRvFontAdapter9.abc0 = 0.4152914254247865d;
                logoRvFontAdapter9.abc1009 = -logoRvFontAdapter9.abc1009;
                int[] iArr6 = logoRvFontAdapter9.abc1008;
                if (iArr6 != null) {
                    iArr6[8] = 9;
                }
                logoRvFontAdapter9.abc1007 = 0.9511449477285929d;
            }
            logoRvFontAdapter9.abc1004 = logoRvFontAdapter9.abc1004 < 0.034853262573412924d ? 0.6284062886072663d : 0.3702660232330235d;
            ArrayList<Integer> arrayList2 = logoRvFontAdapter9.abc1005;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoRvFontAdapter.this.abc1005.remove(0);
            }
            LogoRvFontAdapter.this.abc1007 *= 0.7158866497568641d;
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFontAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9616b {
        /* renamed from: a */
        void mo9186a(int i, Typeface typeface);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvFontAdapter$c */
    /* loaded from: classes3.dex */
    public class C9617c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MaterialCardView f15878a;

        /* renamed from: b */
        public TextView f15879b;

        public C9617c(@NonNull View view) {
            super(view);
            this.f15878a = (MaterialCardView) view.findViewById(R.id.mcv_card);
            this.f15879b = (TextView) view.findViewById(R.id.tv_font);
        }
    }

    public LogoRvFontAdapter(List<Typeface> list, Context context) {
        this.list = null;
        this.abc0 = 0.48777294855947373d;
        this.abc1002 = 8;
        this.abc1003 = 0.3856378485586267d;
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.abc1005 = arrayList;
        this.selectedIndex = -1;
        this.abc1006 = 0.42433106942274645d;
        this.abc3 = 0.7619446325089244d;
        this.abc1007 = 0.48724251926241513d;
        this.abc1008 = new int[16];
        this.abc4 = 0.8155972f;
        this.abc1009 = 0.9561774518273608d;
        this.list = list;
        if (arrayList.size() > 6) {
            this.abc1005.add(0);
        }
        if (this.abc1001 != null) {
            int i = 0;
            while (true) {
                int[] iArr = this.abc1001;
                if (i >= (iArr.length <= 3 ? iArr.length : 3)) {
                    break;
                }
                iArr[i] = 4;
                i++;
            }
        }
        if (this.abc1006 > 0.23706322274749037d) {
            this.abc1006 = 0.26765485279831003d;
        }
        this.abc0 = 0.6212966469129559d;
        int i2 = this.abc1002 + 9;
        this.abc1002 = i2;
        if (i2 > 0) {
            this.abc1002 = 7;
        }
        double abs = Math.abs(this.abc1003);
        this.context = context;
        this.abc1003 = abs * 0.5922892307977643d;
        int[] iArr2 = this.abc1001;
        if (iArr2 != null) {
            iArr2[0] = 0;
        }
        ArrayList<Integer> arrayList2 = this.abc1005;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc3 > 0.5393953859139939d) {
            this.abc3 = 0.8257863877546883d;
            this.abc1009 = 0.7639803128218259d;
            ArrayList<Integer> arrayList3 = this.abc1005;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1005.remove(0);
            }
            if (this.abc1005.size() > 5) {
                this.abc1005.add(2);
            }
        }
        this.abc1009 = this.abc1009 < 0.8032297362636226d ? 0.07819918343417309d : 0.7887301334694784d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1009 -= 0.9899671428064762d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void setData(List<Typeface> list) {
        this.list = list;
        this.abc1006 *= 0.8344223057425534d;
        if (this.abc1008 == null) {
            this.abc1008 = new int[10];
        }
        this.abc1006 = 0.44214011125103503d;
        this.abc3 = 0.5297237270352798d;
        if (this.abc1005.size() < 4) {
            this.abc1005.add(9);
        }
        this.abc1003 = this.abc1003 > 0.0857560995849409d ? 0.8560489932126887d : 0.39848982127014243d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        notifyDataSetChanged();
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        this.abc1003 = 0.15331946248341943d;
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[0] = 0;
        }
        this.abc3 = this.abc3 < 0.56706217371688d ? 0.05147550717192151d : 0.2629853752888305d;
        this.abc1006 = Math.abs(this.abc1006);
        this.abc1002 = 7;
        int[] iArr2 = this.abc1008;
        if (iArr2 != null) {
            iArr2[4] = 0;
        }
    }

    public void setOnItemClickListner(InterfaceC9616b interfaceC9616b) {
        this.onItemClickListner = interfaceC9616b;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[4] = 0;
        }
        this.abc1003 = -this.abc1003;
        this.abc1 = "糊（";
        this.abc1007 = Math.abs(this.abc1007);
        ArrayList<Integer> arrayList = this.abc1005;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1005.remove(0);
        }
        this.abc1006 = 0.8683197007299664d;
    }

    public void setSelectedIndex(int i) {
        this.selectedIndex = i;
        this.abc1004 = 0.6159874834465059d;
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[6] = 4;
        }
        this.abc1009 = 0.7394656679236961d;
        String[] strArr = this.abc2;
        if (strArr != null) {
            strArr[9] = null;
            this.abc1002 = 6;
            this.abc1000 = "im";
            if (iArr == null) {
                this.abc1001 = new int[10];
            }
        }
        this.abc1003 = Math.abs(this.abc1003);
        this.abc1009 += 0.5202982603730844d;
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        notifyDataSetChanged();
        if (this.abc1005.size() > 6) {
            this.abc1005.add(1);
        }
        this.abc1006 -= 0.14077270211644388d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc0 = 0.6912602257074766d;
        if (this.abc1001 != null) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.abc1001;
                if (i2 >= (iArr2.length <= 3 ? iArr2.length : 3)) {
                    break;
                }
                iArr2[i2] = 8;
                i2++;
            }
        }
        if (this.abc1002 < 0) {
            this.abc1002 = 4;
        }
        this.abc1003 -= 0.765349194493234d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9617c c9617c, int i) {
        this.abc1004 = 0.7578837315287179d;
        int i2 = 0;
        if (this.abc1002 < 0) {
            this.abc1002 = 0;
        }
        this.abc1004 = 0.7578837315287179d > 0.3485497173158212d ? 0.3530520687692502d : 0.17690819228733634d;
        if (this.abc3 > 0.7925607730628446d) {
            this.abc3 = 0.16946546790238326d;
            if (this.abc1005.size() > 3) {
                this.abc1005.add(2);
            }
            this.abc1004 -= 0.6454645095644328d;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[0] = 4;
        }
        int i3 = 0;
        while (true) {
            int i4 = this.abc1002;
            if (i4 > 3) {
                i4 = 3;
            }
            if (i3 >= i4) {
                break;
            }
            this.abc1002 = 2;
            i3++;
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        c9617c.f15879b.setTypeface(this.list.get(i));
        this.abc1006 *= 0.5474923473629706d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1006 = this.abc1006 > 0.29764238904454376d ? 0.8466604977833683d : 0.5842378216902616d;
        this.abc3 = this.abc3 < 0.4151302396003389d ? 0.7608963428048895d : 0.07199052579658816d;
        this.abc1000 = "ritten ";
        this.abc1004 = 0.7670487002352392d - 0.4923790551292927d;
        if (this.selectedIndex == i) {
            c9617c.f15879b.setTextColor(-1);
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1004 = 0.20838037990446523d + 0.9762291557151357d;
            if (this.abc0 > 0.22477926712902463d) {
                this.abc0 = 0.7508115838566097d;
                int[] iArr2 = this.abc1001;
                if (iArr2 != null) {
                    iArr2[1] = 0;
                }
                if (this.abc1003 < 0.7719562753330222d) {
                    this.abc1003 = 0.8461271545417304d;
                }
                this.abc1007 = 0.9071923572443099d;
            }
            this.abc1003 = 0.34559532256135495d;
            int[] iArr3 = this.abc1008;
            if (iArr3 != null) {
                iArr3[6] = 0;
            }
            if (iArr3 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr4 = this.abc1008;
                    if (i5 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                        break;
                    }
                    iArr4[i5] = 7;
                    i5++;
                }
            }
            c9617c.f15878a.setCardBackgroundColor(-13421773);
            this.abc1000 = "cei";
            ArrayList<Integer> arrayList = this.abc1005;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1005.remove(0);
            }
            this.abc1009 = Math.abs(this.abc1009);
            this.abc0 = Math.abs(this.abc0);
            int[] iArr5 = this.abc1008;
            if (iArr5 != null) {
                iArr5[0] = 0;
            }
            if (this.abc1003 > 0.2149283791781913d) {
                this.abc1003 = 0.4909124873687649d;
            }
            int i6 = 0;
            while (true) {
                int i7 = this.abc1002;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                int[] iArr6 = this.abc1001;
                if (iArr6 != null) {
                    iArr6[0] = 0;
                }
                i6++;
            }
            c9617c.f15878a.setStrokeWidth(0);
            int[] iArr7 = this.abc1008;
            if (iArr7 != null) {
                iArr7[2] = 0;
            }
            this.abc1007 = -this.abc1007;
            if (iArr7 != null) {
                iArr7[7] = 8;
            }
            if (!TextUtils.isEmpty(this.abc1)) {
                int length = this.abc1.length();
                this.abc1007 = this.abc1007 > 0.8898938988898913d ? 0.419841244325044d : 0.48887989473398563d;
                this.abc1009 += 0.8651594379559419d;
                this.abc1002 = -this.abc1002;
                this.abc1 += length;
                ArrayList<Integer> arrayList2 = this.abc1005;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc1005.remove(0);
                }
                this.abc1006 = Math.abs(this.abc1006);
                if (this.abc1009 > 0.08730884417086804d) {
                    this.abc1009 = 0.8168742118886542d;
                }
            }
            this.abc1004 = this.abc1004 > 0.8115886631476762d ? 0.2582339553557036d : 0.2609363035015748d;
            this.abc1009 = 0.8506721500944184d;
            this.abc1007 *= 0.5976382174908648d;
        } else {
            c9617c.f15879b.setTextColor(-10066330);
            this.abc1000 = " many w";
            if (this.abc1008 != null) {
                int i8 = 0;
                while (true) {
                    int[] iArr8 = this.abc1008;
                    if (i8 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                        break;
                    }
                    iArr8[i8] = 4;
                    i8++;
                }
            }
            if (this.abc1006 > 0.46101918329608105d) {
                this.abc1006 = 0.8501034674278661d;
            }
            if (!TextUtils.isEmpty(this.abc1)) {
                int length2 = this.abc1.length();
                this.abc1002 = this.abc1002 > 9 ? 5 : 9;
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1009 -= 0.053929322678161196d;
                this.abc1 += length2;
                this.abc1004 = 0.7896400412528782d;
                this.abc1006 *= 0.8020574299269188d;
                if (this.abc1001 != null) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr9 = this.abc1001;
                        if (i9 >= (iArr9.length > 3 ? 3 : iArr9.length)) {
                            break;
                        }
                        iArr9[i9] = 5;
                        i9++;
                    }
                }
            }
            int[] iArr10 = this.abc1001;
            if (iArr10 != null) {
                iArr10[4] = 0;
            }
            this.abc1007 = 0.27847218774174554d;
            int[] iArr11 = this.abc1008;
            if (iArr11 != null) {
                iArr11[7] = 8;
            }
            c9617c.f15878a.setCardBackgroundColor(-1);
            if (this.abc1002 > 0) {
                this.abc1002 = 9;
            }
            this.abc1009 += 0.6954525221941183d;
            int[] iArr12 = this.abc1008;
            if (iArr12 != null) {
                iArr12[5] = 0;
            }
            if (this.abc4 < 0.66399723d) {
                this.abc4 = 0.7362541f;
                if (iArr12 == null) {
                    this.abc1008 = new int[10];
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1000 = "ll, ";
            }
            int i10 = 0;
            while (true) {
                int i11 = this.abc1002;
                if (i11 > 3) {
                    i11 = 3;
                }
                if (i10 >= i11) {
                    break;
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                i10++;
            }
            if (this.abc1001 != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr13 = this.abc1001;
                    if (i12 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i12] = 6;
                    i12++;
                }
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            if (this.strokeWidth == 0) {
                this.strokeWidth = DeUtils.m768b(this.context, 2.0f, 5);
                int[] iArr14 = this.abc1008;
                if (iArr14 != null) {
                    iArr14[8] = 0;
                }
                this.abc1009 = 0.8489844421526902d;
                if (iArr14 != null) {
                    while (true) {
                        int[] iArr15 = this.abc1008;
                        if (i2 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                            break;
                        }
                        iArr15[i2] = 9;
                        i2++;
                    }
                }
                this.abc4 = ((double) this.abc4) < 0.3189572d ? 0.23371905f : 0.0029904246f;
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
                this.abc1007 = 0.8734990456340626d;
                this.abc1000 = "is";
            }
            this.abc1007 -= 0.5480495100999392d;
            if (this.abc1004 < 0.49111768479329454d) {
                this.abc1004 = 0.962296077625245d;
            }
            this.abc1006 -= 0.9842396807921302d;
            this.abc0 = 0.9914575264044432d;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1009 *= 0.47845797628981157d;
            this.abc1002 -= 2;
            c9617c.f15878a.setStrokeWidth(this.strokeWidth);
            this.abc1006 = -this.abc1006;
            double d = this.abc1007 - 0.6346656395924879d;
            this.abc1007 = d;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1 = "nt";
            double d2 = this.abc1009 > 0.38062767384886764d ? 0.7778477598032745d : 0.5205691071262218d;
            this.abc1009 = d2;
            this.abc1007 = d < 0.2476357538065571d ? 0.28692147737572116d : 0.8074214905049836d;
            this.abc1009 = d2 + 0.727582480471043d;
        }
        int[] iArr16 = this.abc1008;
        if (iArr16 != null) {
            iArr16[9] = 7;
        }
        this.abc1009 = -this.abc1009;
        this.abc1003 = 0.0754767361419093d;
        this.abc4 = Math.abs(this.abc4);
        double d3 = this.abc1004 + 0.17251534516846734d;
        this.abc1004 = d3;
        this.abc1002 *= 5;
        if (d3 < 0.3344774847080262d) {
            this.abc1004 = 0.6751124019325835d;
        }
        c9617c.itemView.setOnClickListener(new View$OnClickListenerC9615a(i));
        this.abc1004 = this.abc1004 > 0.14607321477811297d ? 0.9676129650752137d : 0.863065115253747d;
        if (this.abc1002 < 0) {
            this.abc1002 = 8;
        }
        this.abc1007 = this.abc1007 > 0.08412207795197701d ? 0.084179705536081d : 0.18123302564451704d;
        this.abc1 = "ithub";
        double d4 = this.abc1006 > 0.4321403671301005d ? 0.8834508835112931d : 0.6647335520032287d;
        this.abc1006 = d4;
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        this.abc1006 = -d4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9617c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9617c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_font, (ViewGroup) null, false));
    }
}
