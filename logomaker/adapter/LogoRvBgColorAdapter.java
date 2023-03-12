package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvBgColorAdapter extends RecyclerView.Adapter<C9601c> {
    public boolean abc0;
    public double abc1002;
    public String abc1004;
    public double abc1005;
    public float abc1007;
    public double abc1008;
    public boolean abc2;
    private Context context;
    private List<Object> list;
    private InterfaceC9600b onItemClickListner;
    public String[] abc1000 = new String[19];
    public String[] abc1001 = new String[13];
    public boolean abc1 = true;
    public boolean abc1003 = true;
    private int selectedIndex = -1;
    public String abc1006 = "or being, ";
    public ArrayList<String> abc3 = new ArrayList<>();
    private int strokeWidth = 0;
    public double abc4 = 0.8191549013435522d;
    public ArrayList<Integer> abc1009 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgColorAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9599a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15843a;

        public View$OnClickListenerC9599a(int i) {
            this.f15843a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 0;
            if (LogoRvBgColorAdapter.this.onItemClickListner != null) {
                LogoRvBgColorAdapter.this.selectedIndex = this.f15843a;
                LogoRvBgColorAdapter logoRvBgColorAdapter = LogoRvBgColorAdapter.this;
                logoRvBgColorAdapter.abc1006 = "e is kind ";
                logoRvBgColorAdapter.abc1003 = !logoRvBgColorAdapter.abc1003;
                if (logoRvBgColorAdapter.abc1005 < 0.25067598182983775d) {
                    logoRvBgColorAdapter.abc1005 = 0.6486992276493252d;
                }
                logoRvBgColorAdapter.abc1 = false;
                if (logoRvBgColorAdapter.abc1008 > 0.5369013962208208d) {
                    logoRvBgColorAdapter.abc1008 = 0.23286155112092077d;
                }
                logoRvBgColorAdapter.abc1007 = -logoRvBgColorAdapter.abc1007;
                if (!TextUtils.isEmpty(logoRvBgColorAdapter.abc1004)) {
                    int length = LogoRvBgColorAdapter.this.abc1004.length();
                    LogoRvBgColorAdapter.this.abc1004 = LogoRvBgColorAdapter.this.abc1004 + length;
                }
                LogoRvBgColorAdapter.this.onItemClickListner.mo9206a(this.f15843a, LogoRvBgColorAdapter.this.list.get(this.f15843a));
                if (LogoRvBgColorAdapter.this.abc1000 != null) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = LogoRvBgColorAdapter.this.abc1000;
                        if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                            break;
                        }
                        strArr[i2] = "string" + i2;
                        i2++;
                    }
                }
                LogoRvBgColorAdapter logoRvBgColorAdapter2 = LogoRvBgColorAdapter.this;
                String[] strArr2 = logoRvBgColorAdapter2.abc1000;
                if (strArr2 != null) {
                    strArr2[6] = null;
                }
                logoRvBgColorAdapter2.abc1002 = 0.7790471888023408d;
                logoRvBgColorAdapter2.abc0 = !logoRvBgColorAdapter2.abc0;
                logoRvBgColorAdapter2.abc1008 = 0.5750567617434745d;
                logoRvBgColorAdapter2.abc1003 = !logoRvBgColorAdapter2.abc1003;
                if (logoRvBgColorAdapter2.abc1009 == null) {
                    logoRvBgColorAdapter2.abc1009 = new ArrayList<>();
                }
            }
            LogoRvBgColorAdapter logoRvBgColorAdapter3 = LogoRvBgColorAdapter.this;
            logoRvBgColorAdapter3.abc1005 = logoRvBgColorAdapter3.abc1005 > 0.8771791062835469d ? 0.9591911305389319d : 0.5655613752044872d;
            if (logoRvBgColorAdapter3.abc1009.size() > 9) {
                LogoRvBgColorAdapter.this.abc1009.add(1);
            }
            if (LogoRvBgColorAdapter.this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr3 = LogoRvBgColorAdapter.this.abc1001;
                    if (i3 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                        break;
                    }
                    strArr3[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoRvBgColorAdapter logoRvBgColorAdapter4 = LogoRvBgColorAdapter.this;
            logoRvBgColorAdapter4.abc0 = true ^ logoRvBgColorAdapter4.abc0;
            if (logoRvBgColorAdapter4.abc1000 != null) {
                while (true) {
                    String[] strArr4 = LogoRvBgColorAdapter.this.abc1000;
                    if (i >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                        break;
                    }
                    strArr4[i] = "string" + i;
                    i++;
                }
            }
            LogoRvBgColorAdapter logoRvBgColorAdapter5 = LogoRvBgColorAdapter.this;
            logoRvBgColorAdapter5.abc1005 += 0.44253824415810694d;
            logoRvBgColorAdapter5.abc1004 = "no";
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgColorAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9600b {
        /* renamed from: a */
        void mo9206a(int i, Object obj);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgColorAdapter$c */
    /* loaded from: classes3.dex */
    public class C9601c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MaterialCardView f15845a;

        /* renamed from: b */
        public ImageView f15846b;

        public C9601c(@NonNull View view) {
            super(view);
            this.f15845a = (MaterialCardView) view.findViewById(R.id.mcv_card);
            this.f15846b = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }

    public LogoRvBgColorAdapter(List<Object> list, Context context) {
        this.list = null;
        this.abc0 = true;
        this.abc1002 = 0.1621939679177069d;
        this.abc1004 = " tha";
        this.abc2 = true;
        this.abc1005 = 0.5040559887350476d;
        this.abc1007 = 0.22678995f;
        this.abc1008 = 0.08559564953763199d;
        this.list = list;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1007 = 0.3815425f;
        if (0.3815425f > 0.85341257d) {
            this.abc1007 = 0.090889156f;
        }
        this.abc2 = !this.abc2;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        this.abc1008 = this.abc1008 > 0.6246897397075395d ? 0.661015575945788d : 0.6301552238179435d;
        if (this.abc1001 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1001;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.context = context;
        this.abc1004 = "at i";
        this.abc1002 = 0.3110032695168923d;
        ArrayList<Integer> arrayList = this.abc1009;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1009.remove(0);
        }
        this.abc0 = !this.abc0;
        if (this.abc1009.size() > 9) {
            this.abc1009.add(6);
        }
        this.abc1005 = 0.5485832377681013d;
        this.abc1008 = 0.5275886317548307d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void resetSelectedIndex() {
        this.selectedIndex = -1;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.abc1007 = ((double) this.abc1007) > 0.5547265d ? 0.029339314f : 0.4544176f;
        if (this.abc1001 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1001;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        if (this.abc3.size() < 2) {
            this.abc3.add("sunshi");
            this.abc1007 *= 0.41370922f;
            String[] strArr2 = this.abc1000;
            if (strArr2 != null) {
                strArr2[2] = "ly more";
            }
            this.abc1003 = false;
        }
        this.abc1005 = Math.abs(this.abc1005) + 0.2143328247557903d;
        this.abc1003 = true;
    }

    public void setData(List<Object> list) {
        this.list = list;
        this.abc1006 = "any ways ";
        this.abc1002 = (-this.abc1002) - 0.8096881325290408d;
        this.abc1 = !this.abc1;
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[6] = "l that in ";
        }
        if (this.abc1005 < 0.522412051541473d) {
            this.abc1005 = 0.6549586479418064d;
        }
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        notifyDataSetChanged();
        this.abc1004 = "y modern n";
        if (this.abc1007 < 0.4784112d) {
            this.abc1007 = 0.33510816f;
        }
        this.abc1007 = ((double) this.abc1007) > 0.16061383d ? 0.046903014f : 0.58807915f;
        this.abc1 = true;
        this.abc1004 = " really s";
        if (this.abc1005 > 0.9346318271808812d) {
            this.abc1005 = 0.2191131652579842d;
        }
        String[] strArr2 = this.abc1001;
        if (strArr2 != null) {
            strArr2[9] = "ity is s";
        }
    }

    public void setOnItemClickListner(InterfaceC9600b interfaceC9600b) {
        this.onItemClickListner = interfaceC9600b;
        this.abc1004 = " mode";
        if (this.abc1008 < 0.5469110179374556d) {
            this.abc1008 = 0.3586578155027641d;
        }
        this.abc1006 = "har";
        this.abc2 = !this.abc2;
        if (this.abc1000 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1000;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.abc1007 = Math.abs(this.abc1007);
        this.abc1005 *= 0.2011653471441348d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9601c c9601c, int i) {
        int i2;
        if (this.abc1000 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.abc1000;
                if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i3] = "string" + i3;
                i3++;
            }
        }
        this.abc1004 = ", dull. Me";
        if (this.abc1008 > 0.23984711066137954d) {
            this.abc1008 = 0.24345692945078112d;
        }
        if (this.abc4 < 0.9363468510487024d) {
            this.abc4 = 0.057799585897825745d;
            this.abc1006 = "ent is ech";
            this.abc1003 = false;
        }
        this.abc1003 = false;
        if (this.abc1000 == null) {
            this.abc1000 = new String[10];
        }
        String[] strArr2 = this.abc1000;
        if (strArr2 != null) {
            strArr2[6] = null;
        }
        Object obj = this.list.get(i);
        String[] strArr3 = this.abc1000;
        if (strArr3 != null) {
            strArr3[2] = "earne";
        }
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        this.abc1006 = "n for b";
        this.abc1 = true;
        String[] strArr4 = this.abc1001;
        if (strArr4 != null) {
            strArr4[3] = null;
        }
        this.abc1008 = this.abc1008 > 0.5715456973315161d ? 0.945518036123366d : 0.9974755329366513d;
        this.abc1005 += 0.2983250518490236d;
        if (this.strokeWidth == 0) {
            this.strokeWidth = DeUtils.m768b(this.context, 2.0f, 5);
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            if (this.abc1000 == null) {
                this.abc1000 = new String[10];
            }
            if (this.abc1005 < 0.23278486002202992d) {
                this.abc1005 = 0.08513023017140464d;
            }
            this.abc0 = !this.abc0;
            double d = this.abc1005 * 0.9957889783658548d;
            this.abc1005 = d;
            this.abc1005 = Math.abs(d);
            if (!TextUtils.isEmpty(this.abc1004)) {
                this.abc1004 += this.abc1004.length();
            }
        }
        this.abc1005 = -this.abc1005;
        this.abc1008 = 0.9972232872877115d;
        this.abc1002 = Math.abs(this.abc1002);
        this.abc0 = !this.abc0;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        this.abc1003 = false;
        if (this.abc1009 == null) {
            this.abc1009 = new ArrayList<>();
        }
        if (obj instanceof String) {
            c9601c.f15846b.setVisibility(8);
            if (this.abc1001 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr5 = this.abc1001;
                    if (i4 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i4] = "string" + i4;
                    i4++;
                }
            }
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            this.abc1003 = !this.abc1003;
            this.abc2 = true;
            if (this.abc1007 < 0.7884057d) {
                this.abc1007 = 0.9723257f;
            }
            this.abc1007 = 0.86968744f;
            if (!TextUtils.isEmpty(this.abc1006)) {
                this.abc1006 += this.abc1006.length();
            }
            String str = (String) obj;
            this.abc1002 = 0.3385142517197183d;
            ArrayList<Integer> arrayList = this.abc1009;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1009.remove(0);
            }
            this.abc1008 = 0.8412373936397897d;
            this.abc2 = !this.abc2;
            this.abc1007 -= 0.96548516f;
            if (!TextUtils.isEmpty(this.abc1004)) {
                this.abc1004 += this.abc1004.length();
            }
            this.abc1002 = 0.7385576824478718d;
            c9601c.f15845a.setCardBackgroundColor(Color.parseColor(str));
            this.abc1005 += 0.10038090787638643d;
            this.abc1006 = " and";
            this.abc1008 = 0.7140626506801512d;
            this.abc0 = false;
            if (!TextUtils.isEmpty(this.abc1004)) {
                this.abc1004 += this.abc1004.length();
            }
            String[] strArr6 = this.abc1001;
            if (strArr6 != null) {
                strArr6[4] = " w";
            }
            this.abc1005 += 0.7967929101408283d;
            if (i == this.selectedIndex) {
                c9601c.f15845a.setStrokeColor(-13421773);
                this.abc1007 -= 0.87004715f;
                String[] strArr7 = this.abc1000;
                if (strArr7 != null) {
                    strArr7[2] = null;
                }
                this.abc1005 = 0.4998032786053661d;
                this.abc4 = -this.abc4;
                this.abc1004 = "ernity";
                if (this.abc1008 > 0.7918709310535923d) {
                    this.abc1008 = 0.6680402936681571d;
                }
                this.abc1008 += 0.1616606850754797d;
                c9601c.f15845a.setStrokeWidth(this.strokeWidth);
                ArrayList<Integer> arrayList2 = this.abc1009;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc1009.remove(0);
                }
                if (!TextUtils.isEmpty(this.abc1004)) {
                    this.abc1004 += this.abc1004.length();
                }
                if (this.abc1001 != null) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr8 = this.abc1001;
                        if (i5 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                            break;
                        }
                        strArr8[i5] = "string" + i5;
                        i5++;
                    }
                }
                this.abc0 = !this.abc0;
                if (this.abc1008 < 0.42469404103059594d) {
                    this.abc1008 = 0.21517337218182608d;
                }
                if (this.abc1009 == null) {
                    this.abc1009 = new ArrayList<>();
                }
                if (this.abc1001 != null) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr9 = this.abc1001;
                        if (i6 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                            break;
                        }
                        strArr9[i6] = "string" + i6;
                        i6++;
                    }
                }
            } else if ("#FFFFFF".equals(str)) {
                c9601c.f15845a.setStrokeColor(-2434342);
                String[] strArr10 = this.abc1001;
                if (strArr10 != null) {
                    strArr10[2] = null;
                }
                this.abc1004 = "le really ";
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                this.abc4 = Math.abs(this.abc4);
                this.abc1003 = !false;
                String[] strArr11 = this.abc1000;
                if (strArr11 != null) {
                    strArr11[6] = ".un";
                }
                c9601c.f15845a.setStrokeWidth(this.strokeWidth);
                if (this.abc1009.size() > 4) {
                    this.abc1009.add(7);
                }
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                if (this.abc1007 < 0.3642255d) {
                    this.abc1007 = 0.8187175f;
                }
                this.abc1 = !this.abc1;
                this.abc1008 += 0.7760040340133726d;
                this.abc1003 = true;
                if (this.abc1009.size() < 9) {
                    this.abc1009.add(4);
                }
            } else {
                c9601c.f15845a.setStrokeWidth(0);
                this.abc1008 *= 0.1671765939267852d;
                this.abc1002 *= 0.9791409891401694d;
                if (this.abc1000 == null) {
                    this.abc1000 = new String[10];
                }
                this.abc1 = true;
                if (this.abc1000 != null) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr12 = this.abc1000;
                        if (i7 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                            break;
                        }
                        strArr12[i7] = "string" + i7;
                        i7++;
                    }
                }
                if (this.abc1001 != null) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr13 = this.abc1001;
                        if (i8 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                            break;
                        }
                        strArr13[i8] = "string" + i8;
                        i8++;
                    }
                }
                this.abc1006 = "amilia";
            }
            ArrayList<Integer> arrayList3 = this.abc1009;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1009.remove(0);
            }
            this.abc1002 = 0.8195207001497408d;
            if (this.abc1008 > 0.4690546717147738d) {
                this.abc1008 = 0.9268806261122254d;
            }
            String[] strArr14 = this.abc1001;
            if (strArr14 != null) {
                strArr14[0] = null;
            }
            String[] strArr15 = this.abc1000;
            if (strArr15 != null) {
                strArr15[2] = "ny mod";
            }
            this.abc1007 = 0.12674272f;
            this.abc2 = true;
            if (this.abc1009.size() < 6) {
                this.abc1009.add(0);
            }
            this.abc1003 = false;
            this.abc4 += 0.6426683731083865d;
            this.abc1005 = 0.27957781274257865d;
            this.abc1004 = "vel is.un";
            if (this.abc1007 < 0.19362992d) {
                this.abc1007 = 0.45457554f;
            }
        } else {
            c9601c.f15846b.setImageResource(((Integer) obj).intValue());
            this.abc1005 += 0.6252453508091504d;
            if (this.abc1000 != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr16 = this.abc1000;
                    if (i9 >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                        break;
                    }
                    strArr16[i9] = "string" + i9;
                    i9++;
                }
            }
            this.abc1005 = 0.4903082085168048d;
            this.abc1 = !this.abc1;
            this.abc1008 = 0.4021140371328876d;
            this.abc1002 *= 0.5519986862823681d;
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            c9601c.f15846b.setVisibility(0);
            this.abc1003 = !this.abc1003;
            String[] strArr17 = this.abc1000;
            if (strArr17 != null) {
                strArr17[7] = "nearn";
            }
            if (this.abc1002 > 0.39621280119921276d) {
                this.abc1002 = 0.6435511082636516d;
            }
            this.abc2 = false;
            ArrayList<Integer> arrayList4 = this.abc1009;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.abc1009.remove(0);
            }
            ArrayList<Integer> arrayList5 = this.abc1009;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.abc1009.remove(0);
            }
            this.abc1005 *= 0.9781773431441995d;
            if (i >= 2 && i != this.selectedIndex) {
                c9601c.f15845a.setStrokeWidth(0);
                this.abc1005 = 0.20103679525379947d;
                this.abc1008 += 0.6315707769453442d;
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                this.abc4 = 0.606579653768278d;
                double d2 = this.abc1005 + 0.8609206472540896d;
                this.abc1005 = d2;
                this.abc1005 = Math.abs(d2);
                this.abc1002 = 0.15010390087740144d;
            } else {
                c9601c.f15845a.setStrokeColor(-13421773);
                this.abc1002 = 0.342270798302731d;
                this.abc1006 = DownloadCommon.DOWNLOAD_REPORT_REASON;
                this.abc1007 -= 0.42992502f;
                this.abc0 = false;
                if (this.abc1001 != null) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr18 = this.abc1001;
                        if (i10 >= (strArr18.length > 3 ? 3 : strArr18.length)) {
                            break;
                        }
                        strArr18[i10] = "string" + i10;
                        i10++;
                    }
                }
                double d3 = this.abc1008 * 0.6194344647929233d;
                this.abc1008 = d3;
                this.abc1008 = d3 < 0.4014923312677825d ? 0.4630664963886354d : 0.4263856042377284d;
                c9601c.f15845a.setStrokeWidth(this.strokeWidth);
                this.abc1005 = 0.8634440133573846d;
                this.abc1002 = 0.07014871921601318d;
                this.abc1002 = 0.07014871921601318d > 0.5084391837628228d ? 0.045745880241757186d : 0.3393098126019124d;
                this.abc1 = false;
                if (!TextUtils.isEmpty(this.abc1006)) {
                    this.abc1006 += this.abc1006.length();
                }
                if (this.abc1009.size() < 4) {
                    this.abc1009.add(7);
                }
                if (this.abc1005 > 0.44772180682768825d) {
                    this.abc1005 = 0.38241687513521294d;
                }
            }
            this.abc1004 = "a literary";
            this.abc1003 = false;
            if (this.abc1001 != null) {
                int i11 = 0;
                while (true) {
                    String[] strArr19 = this.abc1001;
                    if (i11 >= (strArr19.length > 3 ? 3 : strArr19.length)) {
                        break;
                    }
                    strArr19[i11] = "string" + i11;
                    i11++;
                }
            }
            if (this.abc3 == null) {
                this.abc3 = new ArrayList<>();
                double d4 = this.abc1002 * 0.19845765114295033d;
                this.abc1002 = d4;
                if (this.abc1000 == null) {
                    this.abc1000 = new String[10];
                }
                if (d4 > 0.8119858850956346d) {
                    this.abc1002 = 0.5286667752679616d;
                }
            }
            if (!TextUtils.isEmpty(this.abc1004)) {
                this.abc1004 += this.abc1004.length();
            }
            if (this.abc1009.size() > 4) {
                this.abc1009.add(5);
            }
            if (this.abc1002 < 0.6161625403895221d) {
                this.abc1002 = 0.14337738718073556d;
            }
        }
        this.abc1003 = false;
        this.abc1004 = "ore famili";
        if (this.abc1008 < 0.5366071662734729d) {
            this.abc1008 = 0.07689225136495859d;
        }
        this.abc2 = true;
        this.abc1008 = -this.abc1008;
        if (!TextUtils.isEmpty(this.abc1006)) {
            this.abc1006 += this.abc1006.length();
        }
        this.abc1003 = true;
        c9601c.itemView.setOnClickListener(new View$OnClickListenerC9599a(i));
        String[] strArr20 = this.abc1001;
        if (strArr20 != null) {
            strArr20[2] = "at this is";
        }
        if (strArr20 == null) {
            i2 = 10;
            this.abc1001 = new String[10];
        } else {
            i2 = 10;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[i2];
        }
        this.abc0 = false;
        this.abc1006 = "it.";
        this.abc1007 = ((double) this.abc1007) > 0.346744d ? 0.7866652f : 0.80711627f;
        this.abc1005 *= 0.9273272938133371d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9601c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9601c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_bg_color, (ViewGroup) null, false));
    }
}
