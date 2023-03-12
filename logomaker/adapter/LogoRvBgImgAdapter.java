package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvBgImgAdapter extends RecyclerView.Adapter<C9604c> {
    public int abc1;
    public double abc1000;
    public String abc10010;
    public ArrayList<Integer> abc10011;
    public int abc1002;
    public float abc1004;
    public boolean abc1006;
    public float abc1008;
    public boolean abc1009;
    private Context context;
    private List<Integer> list;
    private InterfaceC9603b onItemClickListner;
    public ArrayList<String> abc0 = new ArrayList<>();
    public String abc1001 = "literary";
    public String[] abc1003 = new String[11];
    public String[] abc2 = new String[12];
    public String[] abc1005 = new String[17];
    private int selectedIndex = -1;
    public boolean abc3 = true;
    public String[] abc1007 = new String[10];
    private int strokeWidth = 0;
    public String[] abc4 = new String[15];
    private int currentIndex = -1;
    public float abc5 = 0.64762443f;

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgImgAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9602a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15848a;

        public View$OnClickListenerC9602a(int i) {
            this.f15848a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvBgImgAdapter logoRvBgImgAdapter;
            int i = 0;
            if (LogoRvBgImgAdapter.this.onItemClickListner != null) {
                LogoRvBgImgAdapter.this.currentIndex = this.f15848a;
                LogoRvBgImgAdapter logoRvBgImgAdapter2 = LogoRvBgImgAdapter.this;
                if (logoRvBgImgAdapter2.abc1005 == null) {
                    logoRvBgImgAdapter2.abc1005 = new String[10];
                }
                ArrayList<Integer> arrayList = logoRvBgImgAdapter2.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoRvBgImgAdapter.this.abc10011.remove(0);
                }
                int i2 = 0;
                while (true) {
                    logoRvBgImgAdapter = LogoRvBgImgAdapter.this;
                    int i3 = logoRvBgImgAdapter.abc1002;
                    if (i3 > 3) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        break;
                    }
                    String[] strArr = logoRvBgImgAdapter.abc1005;
                    if (strArr != null) {
                        strArr[1] = "nea";
                    }
                    i2++;
                }
                logoRvBgImgAdapter.abc5 = Math.abs(logoRvBgImgAdapter.abc5);
                LogoRvBgImgAdapter logoRvBgImgAdapter3 = LogoRvBgImgAdapter.this;
                logoRvBgImgAdapter3.abc1006 = !logoRvBgImgAdapter3.abc1006;
                logoRvBgImgAdapter3.abc10010 = "for bei";
                logoRvBgImgAdapter3.abc1009 = false;
                logoRvBgImgAdapter3.onItemClickListner.mo9203a(this.f15848a, (Integer) LogoRvBgImgAdapter.this.list.get(this.f15848a));
                LogoRvBgImgAdapter logoRvBgImgAdapter4 = LogoRvBgImgAdapter.this;
                String[] strArr2 = logoRvBgImgAdapter4.abc1003;
                if (strArr2 != null) {
                    strArr2[2] = null;
                }
                if (logoRvBgImgAdapter4.abc1005 == null) {
                    logoRvBgImgAdapter4.abc1005 = new String[10];
                }
                if (logoRvBgImgAdapter4.abc1002 > 0) {
                    logoRvBgImgAdapter4.abc1002 = 0;
                }
                if (logoRvBgImgAdapter4.abc0.size() > 2) {
                    LogoRvBgImgAdapter.this.abc0.add("关系xfsdg");
                    LogoRvBgImgAdapter logoRvBgImgAdapter5 = LogoRvBgImgAdapter.this;
                    String[] strArr3 = logoRvBgImgAdapter5.abc1003;
                    if (strArr3 != null) {
                        strArr3[6] = null;
                    }
                    if (!TextUtils.isEmpty(logoRvBgImgAdapter5.abc1001)) {
                        int length = LogoRvBgImgAdapter.this.abc1001.length();
                        LogoRvBgImgAdapter.this.abc1001 = LogoRvBgImgAdapter.this.abc1001 + length;
                    }
                    LogoRvBgImgAdapter logoRvBgImgAdapter6 = LogoRvBgImgAdapter.this;
                    if (logoRvBgImgAdapter6.abc1007 == null) {
                        logoRvBgImgAdapter6.abc1007 = new String[10];
                    }
                }
                if (LogoRvBgImgAdapter.this.abc1007 != null) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr4 = LogoRvBgImgAdapter.this.abc1007;
                        if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                            break;
                        }
                        strArr4[i4] = "string" + i4;
                        i4++;
                    }
                }
                if (!TextUtils.isEmpty(LogoRvBgImgAdapter.this.abc10010)) {
                    int length2 = LogoRvBgImgAdapter.this.abc10010.length();
                    LogoRvBgImgAdapter.this.abc10010 = LogoRvBgImgAdapter.this.abc10010 + length2;
                }
                LogoRvBgImgAdapter.this.abc1008 += 0.83025175f;
            }
            LogoRvBgImgAdapter logoRvBgImgAdapter7 = LogoRvBgImgAdapter.this;
            logoRvBgImgAdapter7.abc10010 = " ";
            String[] strArr5 = logoRvBgImgAdapter7.abc1005;
            if (strArr5 != null) {
                strArr5[8] = "timent is ";
            }
            if (!TextUtils.isEmpty(logoRvBgImgAdapter7.abc1001)) {
                int length3 = LogoRvBgImgAdapter.this.abc1001.length();
                LogoRvBgImgAdapter.this.abc1001 = LogoRvBgImgAdapter.this.abc1001 + length3;
            }
            LogoRvBgImgAdapter logoRvBgImgAdapter8 = LogoRvBgImgAdapter.this;
            if (logoRvBgImgAdapter8.abc2 == null) {
                logoRvBgImgAdapter8.abc2 = new String[10];
                logoRvBgImgAdapter8.abc1008 = Math.abs(logoRvBgImgAdapter8.abc1008);
                LogoRvBgImgAdapter logoRvBgImgAdapter9 = LogoRvBgImgAdapter.this;
                logoRvBgImgAdapter9.abc1008 = ((double) logoRvBgImgAdapter9.abc1008) < 0.1037007d ? 0.6222357f : 0.012528539f;
                logoRvBgImgAdapter9.abc1006 = !logoRvBgImgAdapter9.abc1006;
            }
            LogoRvBgImgAdapter logoRvBgImgAdapter10 = LogoRvBgImgAdapter.this;
            logoRvBgImgAdapter10.abc1006 = false;
            if (logoRvBgImgAdapter10.abc1007 != null) {
                while (true) {
                    String[] strArr6 = LogoRvBgImgAdapter.this.abc1007;
                    if (i >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i] = "string" + i;
                    i++;
                }
            }
            String[] strArr7 = LogoRvBgImgAdapter.this.abc1005;
            if (strArr7 != null) {
                strArr7[2] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgImgAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9603b {
        /* renamed from: a */
        void mo9203a(int i, Integer num);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvBgImgAdapter$c */
    /* loaded from: classes3.dex */
    public class C9604c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MaterialCardView f15850a;

        /* renamed from: b */
        public ImageView f15851b;

        public C9604c(@NonNull View view) {
            super(view);
            this.f15850a = (MaterialCardView) view.findViewById(R.id.mcv_card);
            this.f15851b = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }

    public LogoRvBgImgAdapter(List<Integer> list, Context context) {
        this.list = null;
        this.abc1000 = 0.1259069927059837d;
        this.abc1002 = 6;
        this.abc1 = 5;
        this.abc1004 = 0.88007295f;
        this.abc1006 = true;
        this.abc1008 = 0.64349025f;
        this.abc1009 = true;
        this.abc10010 = "t is), ";
        this.abc10011 = new ArrayList<>();
        this.list = list;
        if (this.abc1008 < 0.04698193d) {
            this.abc1008 = 0.5502426f;
        }
        String[] strArr = this.abc1007;
        if (strArr != null) {
            strArr[1] = null;
        }
        this.abc1009 = !this.abc1009;
        String[] strArr2 = this.abc4;
        if (strArr2 != null) {
            strArr2[3] = "n name=blu";
            String[] strArr3 = this.abc1005;
            if (strArr3 != null) {
                strArr3[7] = null;
            }
            this.abc1008 = 0.5796845f;
            this.abc10010 = "y, it’s mo";
        }
        this.abc10010 = ". For ";
        this.abc1006 = false;
        this.context = context;
        this.abc1004 = -this.abc1004;
        String[] strArr4 = this.abc1007;
        if (strArr4 != null) {
            strArr4[6] = "alize t";
        }
        if (this.abc1002 > 0) {
            this.abc1002 = 0;
        }
        if (this.abc1 > 0) {
            this.abc1 = 0;
            this.abc1002 *= 9;
            this.abc1009 = !this.abc1009;
            if (this.abc1000 < 0.18379580341462032d) {
                this.abc1000 = 0.3676117351857028d;
            }
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        this.abc1008 = Math.abs(this.abc1008);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void setData(List<Integer> list) {
        int i;
        this.list = list;
        if (this.abc1007 == null) {
            this.abc1007 = new String[10];
        }
        if (this.abc1008 > 0.12223315d) {
            this.abc1008 = 0.64040864f;
        }
        int i2 = 0;
        while (true) {
            i = this.abc1002;
            if (i2 >= (i > 3 ? 3 : i)) {
                break;
            }
            String[] strArr = this.abc1003;
            if (strArr != null) {
                strArr[6] = null;
            }
            i2++;
        }
        String[] strArr2 = this.abc4;
        if (strArr2 != null) {
            strArr2[4] = "tr format=";
            this.abc1001 = "era";
            this.abc1002 = i > 1 ? 2 : 5;
            this.abc1009 = !this.abc1009;
        }
        if (this.abc1000 > 0.18704775890687209d) {
            this.abc1000 = 0.2295945461522747d;
        }
        this.abc1002 = 6;
        String[] strArr3 = this.abc1005;
        if (strArr3 != null) {
            strArr3[9] = null;
        }
        notifyDataSetChanged();
        if (this.abc1007 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.abc1007;
                if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i3] = "string" + i3;
                i3++;
            }
        }
        this.abc1006 = !true;
        if (this.abc2 == null) {
            this.abc2 = new String[10];
            this.abc10010 = " for so m";
            this.abc1009 = !this.abc1009;
            if (this.abc1003 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr5 = this.abc1003;
                    if (i4 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                        break;
                    }
                    strArr5[i4] = "string" + i4;
                    i4++;
                }
            }
        }
        String[] strArr6 = this.abc1007;
        if (strArr6 != null) {
            strArr6[4] = null;
        }
        this.abc1002 += 0;
        this.abc1000 = 0.8886042742623042d;
    }

    public void setOnItemClickListner(InterfaceC9603b interfaceC9603b) {
        this.onItemClickListner = interfaceC9603b;
        if (!TextUtils.isEmpty(this.abc10010)) {
            this.abc10010 += this.abc10010.length();
        }
        this.abc1000 = this.abc1000 > 0.02995473996202125d ? 0.8302845844056707d : 0.8142092568396511d;
        if (this.abc1005 == null) {
            this.abc1005 = new String[10];
        }
        this.abc1 = 2;
        this.abc1008 = ((double) this.abc1008) > 0.06289333d ? 0.16373777f : 0.6243619f;
        this.abc1004 = ((double) this.abc1004) > 0.6285933d ? 0.20962894f : 0.049651384f;
        ArrayList<Integer> arrayList = this.abc10011;
        if (arrayList != null || arrayList.size() <= 0) {
            return;
        }
        this.abc10011.remove(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9604c c9604c, int i) {
        int i2;
        this.abc1000 = 0.7726252827422554d;
        if (this.abc1005 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.abc1005;
                if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i3] = "string" + i3;
                i3++;
            }
        }
        if (this.abc10011 == null) {
            this.abc10011 = new ArrayList<>();
        }
        String[] strArr2 = this.abc4;
        if (strArr2 != null) {
            strArr2[4] = "LEFT, 50f)";
            String[] strArr3 = this.abc1007;
            if (strArr3 != null) {
                strArr3[7] = null;
            }
            this.abc1009 = true;
            this.abc1002 += 2;
        }
        this.abc1004 = 0.8469444f;
        this.abc1001 = "ten in";
        if (this.abc1005 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.abc1005;
                if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i4] = "string" + i4;
                i4++;
            }
        }
        Integer num = this.list.get(i);
        this.abc1009 = false;
        String[] strArr5 = this.abc1005;
        if (strArr5 != null) {
            strArr5[5] = null;
        }
        if (this.abc1007 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.abc1007;
                if (i5 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                    break;
                }
                strArr6[i5] = "string" + i5;
                i5++;
            }
        }
        this.abc3 = !this.abc3;
        this.abc1009 = !this.abc1009;
        if (this.abc1000 < 0.5264535668579415d) {
            this.abc1000 = 0.10737708634879684d;
        }
        String[] strArr7 = this.abc1005;
        if (strArr7 != null) {
            strArr7[1] = "his is t";
        }
        if (i < 2) {
            if (this.strokeWidth == 0) {
                this.strokeWidth = DeUtils.m768b(this.context, 2.0f, 5);
                if (this.abc10011 == null) {
                    this.abc10011 = new ArrayList<>();
                }
                this.abc1002 += 8;
                this.abc1004 = 0.14865547f;
                String[] strArr8 = this.abc4;
                if (strArr8 != null) {
                    strArr8[3] = null;
                    this.abc1009 = !this.abc1009;
                    this.abc1006 = true;
                }
                ArrayList<Integer> arrayList = this.abc10011;
                if (arrayList == null && arrayList.size() > 0) {
                    this.abc10011.remove(0);
                }
                ArrayList<Integer> arrayList2 = this.abc10011;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc10011.remove(0);
                }
                this.abc1008 = ((double) this.abc1008) > 0.43429297d ? 0.41850883f : 0.11175382f;
            }
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            if (this.abc10011.size() > 9) {
                this.abc10011.add(2);
            }
            this.abc1006 = !this.abc1006;
            this.abc1 = Math.abs(this.abc1);
            if (this.abc1007 == null) {
                this.abc1007 = new String[10];
            }
            this.abc1009 = false;
            this.abc1004 = 0.07117039f;
            c9604c.f15850a.setStrokeColor(-4079167);
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(this.abc1001)) {
                this.abc1001 += this.abc1001.length();
            }
            if (this.abc10011 == null) {
                this.abc10011 = new ArrayList<>();
            }
            c9604c.f15850a.setStrokeWidth(this.strokeWidth);
            this.abc1002 = 2;
            int i6 = 0;
            while (true) {
                int i7 = this.abc1002;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                this.abc1009 = true;
                i6++;
            }
            this.abc10010 = "si";
            this.abc5 = 0.65153885f;
            this.abc1004 = ((double) this.abc1004) < 0.6100974d ? 0.18877405f : 0.12591088f;
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            this.abc1000 -= 0.9910322470288524d;
        } else {
            c9604c.f15850a.setStrokeWidth(0);
            int i8 = 0;
            while (true) {
                i2 = this.abc1002;
                if (i8 >= (i2 > 3 ? 3 : i2)) {
                    break;
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new String[10];
                }
                i8++;
            }
            this.abc1004 *= 0.861245f;
            String[] strArr9 = this.abc1005;
            if (strArr9 != null) {
                strArr9[5] = "ted t";
            }
            this.abc1 -= 4;
            this.abc1002 = i2 * 3;
            String[] strArr10 = this.abc1007;
            if (strArr10 != null) {
                strArr10[2] = " its ";
            }
            ArrayList<Integer> arrayList3 = this.abc10011;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc10011.remove(0);
            }
        }
        if (this.abc1007 == null) {
            this.abc1007 = new String[10];
        }
        if (this.abc1000 < 0.8295611370747036d) {
            this.abc1000 = 0.538130336563378d;
        }
        this.abc1004 = Math.abs(this.abc1004);
        this.abc5 = 0.59198505f;
        String[] strArr11 = this.abc1003;
        if (strArr11 != null) {
            strArr11[5] = "ed to ";
        }
        this.abc1009 = !this.abc1009;
        this.abc1000 = 0.151234966014953d;
        Glide.m18505t(this.context).m1885r(num).m2170p0(c9604c.f15851b);
        if (this.abc1003 != null) {
            int i9 = 0;
            while (true) {
                String[] strArr12 = this.abc1003;
                if (i9 >= (strArr12.length > 3 ? 3 : strArr12.length)) {
                    break;
                }
                strArr12[i9] = "string" + i9;
                i9++;
            }
        }
        ArrayList<Integer> arrayList4 = this.abc10011;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc10011.remove(0);
        }
        if (this.abc1003 == null) {
            this.abc1003 = new String[10];
        }
        this.abc3 = true;
        String[] strArr13 = this.abc1007;
        if (strArr13 != null) {
            strArr13[2] = "r being, ";
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc1005 == null) {
            this.abc1005 = new String[10];
        }
        c9604c.itemView.setOnClickListener(new View$OnClickListenerC9602a(i));
        if (this.abc1003 != null) {
            int i10 = 0;
            while (true) {
                String[] strArr14 = this.abc1003;
                if (i10 >= (strArr14.length > 3 ? 3 : strArr14.length)) {
                    break;
                }
                strArr14[i10] = "string" + i10;
                i10++;
            }
        }
        String[] strArr15 = this.abc1007;
        if (strArr15 != null) {
            strArr15[6] = null;
        }
        if (this.abc1005 != null) {
            int i11 = 0;
            while (true) {
                String[] strArr16 = this.abc1005;
                if (i11 >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                    break;
                }
                strArr16[i11] = "string" + i11;
                i11++;
            }
        }
        this.abc3 = false;
        String[] strArr17 = this.abc1003;
        if (strArr17 != null) {
            strArr17[3] = null;
        }
        this.abc1004 = 0.045978367f;
        this.abc1000 = this.abc1000 > 0.06304260604682643d ? 0.38979451113947994d : 0.8200800825032671d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9604c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9604c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_bg_img, (ViewGroup) null, false));
    }
}
