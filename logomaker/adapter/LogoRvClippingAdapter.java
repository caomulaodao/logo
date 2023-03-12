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
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.card.MaterialCardView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvClippingAdapter extends RecyclerView.Adapter<C9607c> {
    public ArrayList<String> abc1000;
    public int abc1002;
    public String abc1003;
    public boolean abc1004;
    public boolean abc1005;
    public int abc1006;
    public int[] abc1008;
    public float abc1009;
    public float abc3;
    public double abc5;
    private Context context;
    private List<Integer> list;
    private InterfaceC9606b onItemClickListner;
    public String[] abc0 = new String[13];
    public ArrayList<String> abc1001 = new ArrayList<>();
    public ArrayList<String> abc1 = new ArrayList<>();
    public String[] abc2 = new String[13];
    private int selectedIndex = -1;
    public ArrayList<String> abc1007 = new ArrayList<>();
    private int strokeWidth = 0;
    public ArrayList<String> abc4 = new ArrayList<>();
    private int currentIndex = -1;
    public int abc10010 = 6;
    public int abc10011 = 3;

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvClippingAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9605a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15853a;

        public View$OnClickListenerC9605a(int i) {
            this.f15853a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvClippingAdapter logoRvClippingAdapter;
            if (LogoRvClippingAdapter.this.onItemClickListner != null) {
                LogoRvClippingAdapter.this.currentIndex = this.f15853a;
                LogoRvClippingAdapter logoRvClippingAdapter2 = LogoRvClippingAdapter.this;
                boolean z = !logoRvClippingAdapter2.abc1004;
                logoRvClippingAdapter2.abc1004 = z;
                logoRvClippingAdapter2.abc1004 = !z;
                logoRvClippingAdapter2.abc1005 = true;
                logoRvClippingAdapter2.abc3 = ((double) logoRvClippingAdapter2.abc3) > 0.5431651d ? 0.82651275f : 0.51050144f;
                if (logoRvClippingAdapter2.abc1009 > 0.36621088d) {
                    logoRvClippingAdapter2.abc1009 = 0.62807494f;
                }
                logoRvClippingAdapter2.abc10010 = 0;
                ArrayList<String> arrayList = logoRvClippingAdapter2.abc1007;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoRvClippingAdapter.this.abc1007.remove(0);
                }
                LogoRvClippingAdapter.this.onItemClickListner.mo9200a(this.f15853a, (Integer) LogoRvClippingAdapter.this.list.get(this.f15853a));
                LogoRvClippingAdapter logoRvClippingAdapter3 = LogoRvClippingAdapter.this;
                logoRvClippingAdapter3.abc1006 = Math.abs(logoRvClippingAdapter3.abc1006);
                if (!TextUtils.isEmpty(LogoRvClippingAdapter.this.abc1003)) {
                    int length = LogoRvClippingAdapter.this.abc1003.length();
                    LogoRvClippingAdapter.this.abc1003 = LogoRvClippingAdapter.this.abc1003 + length;
                }
                ArrayList<String> arrayList2 = LogoRvClippingAdapter.this.abc1000;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoRvClippingAdapter.this.abc1000.remove(0);
                }
                ArrayList<String> arrayList3 = LogoRvClippingAdapter.this.abc4;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    LogoRvClippingAdapter.this.abc4.remove(0);
                    LogoRvClippingAdapter logoRvClippingAdapter4 = LogoRvClippingAdapter.this;
                    if (logoRvClippingAdapter4.abc1001 == null) {
                        logoRvClippingAdapter4.abc1001 = new ArrayList<>();
                    }
                    LogoRvClippingAdapter logoRvClippingAdapter5 = LogoRvClippingAdapter.this;
                    logoRvClippingAdapter5.abc10011 = -logoRvClippingAdapter5.abc10011;
                    logoRvClippingAdapter5.abc1009 = 0.44165564f;
                }
                LogoRvClippingAdapter logoRvClippingAdapter6 = LogoRvClippingAdapter.this;
                if (logoRvClippingAdapter6.abc1008 == null) {
                    logoRvClippingAdapter6.abc1008 = new int[10];
                }
                int[] iArr = logoRvClippingAdapter6.abc1008;
                if (iArr != null) {
                    iArr[3] = 0;
                }
                logoRvClippingAdapter6.abc1005 = true;
            }
            int i = 0;
            while (true) {
                logoRvClippingAdapter = LogoRvClippingAdapter.this;
                int i2 = logoRvClippingAdapter.abc10011;
                if (i >= (i2 > 3 ? 3 : i2)) {
                    break;
                }
                logoRvClippingAdapter.abc10011 = i2 - 7;
                i++;
            }
            logoRvClippingAdapter.abc1003 = "k decad";
            if (logoRvClippingAdapter.abc1002 > 0) {
                logoRvClippingAdapter.abc1002 = 0;
            }
            logoRvClippingAdapter.abc3 = Math.abs(logoRvClippingAdapter.abc3);
            LogoRvClippingAdapter logoRvClippingAdapter7 = LogoRvClippingAdapter.this;
            logoRvClippingAdapter7.abc1003 = "tatio";
            logoRvClippingAdapter7.abc1006 = Math.abs(logoRvClippingAdapter7.abc1006);
            LogoRvClippingAdapter.this.abc1002 += 9;
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvClippingAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9606b {
        /* renamed from: a */
        void mo9200a(int i, Integer num);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvClippingAdapter$c */
    /* loaded from: classes3.dex */
    public class C9607c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MaterialCardView f15855a;

        /* renamed from: b */
        public ImageView f15856b;

        public C9607c(@NonNull View view) {
            super(view);
            this.f15855a = (MaterialCardView) view.findViewById(R.id.mcv_card);
            this.f15856b = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }

    public LogoRvClippingAdapter(List<Integer> list, Context context) {
        this.list = null;
        this.abc1000 = new ArrayList<>();
        this.abc1002 = 6;
        this.abc1003 = "rly";
        this.abc1004 = false;
        this.abc1005 = false;
        this.abc1006 = 2;
        this.abc3 = 0.09261346f;
        this.abc1008 = new int[15];
        this.abc1009 = 0.34381044f;
        this.abc5 = 0.3716054868443798d;
        this.list = list;
        if (this.abc1000.size() < 5) {
            this.abc1000.add("y is");
        }
        this.abc1004 = !this.abc1004;
        float f = -this.abc1009;
        this.abc1009 = f;
        if (this.abc3 > 0.24359095d) {
            this.abc3 = 0.26152158f;
            if (this.abc1008 == null) {
                this.abc1008 = new int[10];
            }
            this.abc1002 = this.abc1002 > 5 ? 5 : 6;
            if (this.abc1008 == null) {
                this.abc1008 = new int[10];
            }
        }
        if (this.abc1008 == null) {
            this.abc1008 = new int[10];
        }
        this.abc1006 = -this.abc1006;
        this.abc1009 = Math.abs(f);
        this.context = context;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1009 = -this.abc1009;
        this.abc5 = 0.13374278575355336d;
        this.abc1005 = true;
        this.abc1003 = "he in";
        this.abc10010 *= 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void setData(List<Integer> list) {
        this.list = list;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
        }
        String[] strArr = this.abc0;
        if (strArr != null) {
            strArr[3] = "码如下";
            this.abc1002 = this.abc1002 >= 2 ? 9 : 3;
            this.abc1006 -= 8;
            this.abc1005 = true;
        }
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        this.abc1005 = false;
        notifyDataSetChanged();
        if (this.abc10010 > 0) {
            this.abc10010 = 9;
        }
        this.abc1006 = -Math.abs(this.abc1006);
        if (this.abc0 != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc0;
                if (i >= strArr2.length) {
                    break;
                }
                strArr2[i] = "string" + i;
                this.abc10011 = -this.abc10011;
                this.abc1004 = false;
                this.abc1005 = true;
                i++;
            }
            if (this.abc10010 < 0) {
                this.abc10010 = 2;
            }
            this.abc1002 = 2;
            this.abc10010 = this.abc10010 <= 0 ? 7 : 9;
        }
        this.abc1002 -= 8;
        ArrayList<String> arrayList2 = this.abc1000;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc10011 < 0) {
            this.abc10011 = 5;
        }
    }

    public void setOnItemClickListner(InterfaceC9606b interfaceC9606b) {
        this.onItemClickListner = interfaceC9606b;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1004 = true;
        this.abc10010 = Math.abs(this.abc10010);
        this.abc3 = 0.66502964f;
        this.abc1004 = true;
        this.abc10011 = 4;
        this.abc1002 = this.abc1002 > 1 ? 5 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9607c c9607c, int i) {
        this.abc1002 = this.abc1002 < 6 ? 0 : 8;
        if (this.abc1000.size() > 5) {
            this.abc1000.add("eople r");
        }
        this.abc1003 = "ns";
        String[] strArr = this.abc0;
        if (strArr != null) {
            strArr[5] = "嵌";
            if (this.abc1001.size() < 6) {
                this.abc1001.add("ve");
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            this.abc1003 = "ar";
        }
        if (this.abc1009 > 0.46395165d) {
            this.abc1009 = 0.6194218f;
        }
        this.abc1006 = 2;
        int i2 = 0;
        while (true) {
            int i3 = this.abc10010;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                break;
            }
            this.abc1005 = !this.abc1005;
            i2++;
        }
        Integer num = this.list.get(i);
        int i4 = 0;
        while (true) {
            int i5 = this.abc1006;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            if (this.abc1000.size() < 3) {
                this.abc1000.add(" well,");
            }
            i4++;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1004 = false;
        ArrayList<String> arrayList = this.abc1;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1.remove(0);
            this.abc1009 = 0.66181105f;
            this.abc1002--;
            int i6 = 0;
            while (true) {
                int i7 = this.abc10010;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                this.abc1002 = Math.abs(this.abc1002);
                i6++;
            }
        }
        int i8 = 0;
        while (true) {
            int i9 = this.abc10010;
            if (i8 >= (i9 > 3 ? 3 : i9)) {
                break;
            }
            this.abc10010 = i9 * 4;
            i8++;
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
            int[] iArr = this.abc1008;
            if (iArr != null) {
                iArr[7] = 4;
            }
            i10++;
        }
        this.abc1003 = "ed wel";
        if (this.strokeWidth == 0) {
            this.strokeWidth = DeUtils.m768b(this.context, 2.0f, 5);
            this.abc1004 = false;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            if (this.abc1008 != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.abc1008;
                    if (i12 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i12] = 9;
                    i12++;
                }
            }
            if (this.abc1.size() < 6) {
                this.abc1.add("       a");
                if (this.abc1007 == null) {
                    this.abc1007 = new ArrayList<>();
                }
                if (this.abc1007.size() > 7) {
                    this.abc1007.add(InneractiveMediationDefs.GENDER_MALE);
                }
                if (this.abc1000 == null) {
                    this.abc1000 = new ArrayList<>();
                }
            }
            this.abc1006 *= 8;
            this.abc1002 = 6 * 7;
        }
        this.abc1006 = 1;
        int i13 = 0;
        while (true) {
            int i14 = this.abc10010;
            if (i14 > 3) {
                i14 = 3;
            }
            if (i13 >= i14) {
                break;
            }
            this.abc10010 = 3;
            i13++;
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        String[] strArr2 = this.abc0;
        if (strArr2 != null) {
            strArr2[7] = null;
            this.abc1003 = "bably";
            if (this.abc1007.size() < 5) {
                this.abc1007.add(" ");
            }
            this.abc1009 = -this.abc1009;
        }
        ArrayList<String> arrayList2 = this.abc1000;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1009 = ((double) this.abc1009) > 0.36725652d ? 0.7574617f : 0.05784911f;
        if (this.abc1006 < 0) {
            this.abc1006 = 6;
        }
        if (this.currentIndex == i) {
            c9607c.f15855a.setStrokeColor(-13421773);
            this.abc1005 = true;
            this.abc1009 = 0.21230668f;
            String[] strArr3 = this.abc0;
            if (strArr3 != null) {
                strArr3[9] = "效果高斯模糊";
                ArrayList<String> arrayList3 = this.abc1007;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.abc1007.remove(0);
                }
                this.abc10011 = Math.abs(this.abc10011);
                this.abc1006 = this.abc1006 < 1 ? 4 : 6;
            }
            this.abc1005 = true;
            this.abc1003 = "o";
            if (!TextUtils.isEmpty("o")) {
                this.abc1003 += this.abc1003.length();
            }
        } else {
            c9607c.f15855a.setStrokeColor(-4079167);
            this.abc10011 = 7;
            int i15 = 0;
            while (true) {
                int i16 = this.abc10010;
                if (i15 >= (i16 > 3 ? 3 : i16)) {
                    break;
                }
                this.abc10010 = i16 + 3;
                i15++;
            }
            ArrayList<String> arrayList4 = this.abc1001;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1001.remove(0);
            }
            if (this.abc4.size() > 3) {
                this.abc4.add("blurview?");
                this.abc1004 = true;
                ArrayList<String> arrayList5 = this.abc1001;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.abc1001.remove(0);
                }
                this.abc1003 = "Stone";
            }
            this.abc1003 = "is kind ";
            if (this.abc1008 == null) {
                this.abc1008 = new int[10];
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        ArrayList<String> arrayList6 = this.abc1001;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc1006 *= 0;
        this.abc1002 = Math.abs(this.abc1002);
        if (this.abc4 == null) {
            this.abc4 = new ArrayList<>();
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            if (this.abc1000.size() < 8) {
                this.abc1000.add("n nov");
            }
            ArrayList<String> arrayList7 = this.abc1001;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1001.remove(0);
            }
        }
        this.abc1005 = true;
        this.abc1002 = 7;
        c9607c.f15855a.setStrokeWidth(this.strokeWidth);
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        if (this.abc1001.size() < 8) {
            this.abc1001.add("ern novel ");
        }
        this.abc1002 += 7;
        if (this.abc4.size() > 4) {
            this.abc4.add("婆男神学长求放过");
            if (!TextUtils.isEmpty(this.abc1003)) {
                this.abc1003 += this.abc1003.length();
            }
            if (this.abc1000.size() > 0) {
                this.abc1000.add("r");
            }
            int i17 = 0;
            while (true) {
                int i18 = this.abc10011;
                if (i18 > 3) {
                    i18 = 3;
                }
                if (i17 >= i18) {
                    break;
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new ArrayList<>();
                }
                i17++;
            }
        }
        ArrayList<String> arrayList8 = this.abc1007;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc10010 *= 4;
        this.abc1004 = !this.abc1004;
        Glide.m18505t(this.context).m1885r(num).m2170p0(c9607c.f15856b);
        this.abc1004 = false;
        ArrayList<String> arrayList9 = this.abc1007;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc1002 *= 5;
        if (this.abc0 != null) {
            int i19 = 0;
            while (true) {
                String[] strArr4 = this.abc0;
                if (i19 >= strArr4.length) {
                    break;
                }
                strArr4[i19] = "string" + i19;
                if (this.abc1008 != null) {
                    int i20 = 0;
                    while (true) {
                        int[] iArr3 = this.abc1008;
                        if (i20 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                            break;
                        }
                        iArr3[i20] = 1;
                        i20++;
                    }
                }
                int i21 = 0;
                while (true) {
                    int i22 = this.abc1006;
                    if (i22 > 3) {
                        i22 = 3;
                    }
                    if (i21 < i22) {
                        this.abc1004 = !this.abc1004;
                        i21++;
                    }
                }
                this.abc1009 = 0.7014431f;
                i19++;
            }
            this.abc1005 = !this.abc1005;
            ArrayList<String> arrayList10 = this.abc1001;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1001.remove(0);
            }
            this.abc1003 = "many";
        }
        this.abc1006 = -this.abc1006;
        this.abc1009 *= 0.112160444f;
        if (this.abc10011 < 0) {
            this.abc10011 = 2;
        }
        c9607c.itemView.setOnClickListener(new View$OnClickListenerC9605a(i));
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1003 = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
        this.abc10010 *= 2;
        this.abc5 = this.abc5 > 0.8279260480008052d ? 0.8154282057937522d : 0.1226565702153547d;
        ArrayList<String> arrayList11 = this.abc1007;
        if (arrayList11 != null && arrayList11.size() > 0) {
            this.abc1007.remove(0);
        }
        int[] iArr4 = this.abc1008;
        if (iArr4 != null) {
            iArr4[3] = 9;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9607c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9607c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_clipping, (ViewGroup) null, false));
    }
}
