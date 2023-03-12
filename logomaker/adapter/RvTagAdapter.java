package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RvTagAdapter extends RecyclerView.Adapter<C9633c> {
    public int[] abc1001;
    public String[] abc1002;
    public boolean abc1003;
    public double abc1005;
    public ArrayList<String> abc1006;
    public double abc2;
    private Context context;
    private List<String> list;
    private InterfaceC9632b onItemClickListner;
    public ArrayList<String> abc1000 = new ArrayList<>();
    public String[] abc0 = new String[19];
    public boolean abc1 = false;
    private int selectedIndex = 0;
    public ArrayList<String> abc1004 = new ArrayList<>();
    public ArrayList<String> abc3 = new ArrayList<>();
    public String abc1007 = "'ge";

    /* renamed from: com.logomaster.logomaker.adapter.RvTagAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9631a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15912a;

        public View$OnClickListenerC9631a(int i) {
            this.f15912a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RvTagAdapter.this.onItemClickListner != null) {
                RvTagAdapter.this.onItemClickListner.mo9166a(this.f15912a, (String) RvTagAdapter.this.list.get(this.f15912a));
                ArrayList<String> arrayList = RvTagAdapter.this.abc1000;
                if (arrayList != null && arrayList.size() > 0) {
                    RvTagAdapter.this.abc1000.remove(0);
                }
                ArrayList<String> arrayList2 = RvTagAdapter.this.abc1004;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    RvTagAdapter.this.abc1004.remove(0);
                }
                if (RvTagAdapter.this.abc1004.size() > 5) {
                    RvTagAdapter.this.abc1004.add("piration,");
                }
                RvTagAdapter rvTagAdapter = RvTagAdapter.this;
                rvTagAdapter.abc1 = true;
                String[] strArr = rvTagAdapter.abc1002;
                if (strArr != null) {
                    strArr[3] = null;
                }
                if (rvTagAdapter.abc1006 == null) {
                    rvTagAdapter.abc1006 = new ArrayList<>();
                }
                RvTagAdapter.this.abc1007 = "arly";
            }
            if (!TextUtils.isEmpty(RvTagAdapter.this.abc1007)) {
                int length = RvTagAdapter.this.abc1007.length();
                RvTagAdapter rvTagAdapter2 = RvTagAdapter.this;
                rvTagAdapter2.abc1007 = RvTagAdapter.this.abc1007 + length;
            }
            ArrayList<String> arrayList3 = RvTagAdapter.this.abc1000;
            if (arrayList3 != null && arrayList3.size() > 0) {
                RvTagAdapter.this.abc1000.remove(0);
            }
            ArrayList<String> arrayList4 = RvTagAdapter.this.abc1000;
            if (arrayList4 != null && arrayList4.size() > 0) {
                RvTagAdapter.this.abc1000.remove(0);
            }
            RvTagAdapter rvTagAdapter3 = RvTagAdapter.this;
            rvTagAdapter3.abc1 = true ^ rvTagAdapter3.abc1;
            if (rvTagAdapter3.abc1006.size() > 7) {
                RvTagAdapter.this.abc1006.add("odernity ");
            }
            ArrayList<String> arrayList5 = RvTagAdapter.this.abc1004;
            if (arrayList5 != null && arrayList5.size() > 0) {
                RvTagAdapter.this.abc1004.remove(0);
            }
            if (RvTagAdapter.this.abc1006.size() < 5) {
                RvTagAdapter.this.abc1006.add(" Ros");
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.RvTagAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9632b {
        /* renamed from: a */
        void mo9166a(int i, String str);
    }

    /* renamed from: com.logomaster.logomaker.adapter.RvTagAdapter$c */
    /* loaded from: classes3.dex */
    public class C9633c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f15914a;

        public C9633c(@NonNull View view) {
            super(view);
            this.f15914a = (TextView) view.findViewById(R.id.tv_tag);
        }
    }

    public RvTagAdapter(List<String> list, Context context) {
        this.list = null;
        this.abc1001 = new int[13];
        this.abc1002 = new String[10];
        this.abc1003 = false;
        this.abc2 = 0.8543632459934037d;
        this.abc1005 = 0.034853937284030745d;
        this.abc1006 = new ArrayList<>();
        this.list = list;
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        this.abc1003 = false;
        this.abc2 = this.abc2 < 0.7911787995000171d ? 0.4694061053333596d : 0.9206669555257325d;
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[0] = null;
        }
        if (strArr == null) {
            this.abc1002 = new String[10];
        }
        ArrayList<String> arrayList = this.abc1004;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1004.remove(0);
        }
        this.context = context;
        this.abc1005 = 0.44530044706090954d;
        ArrayList<String> arrayList2 = this.abc1004;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1004.remove(0);
        }
        this.abc1003 = !this.abc1003;
        String[] strArr2 = this.abc0;
        if (strArr2 != null) {
            strArr2[2] = null;
            this.abc1005 = 0.329350930182263d;
            this.abc1005 = 0.329350930182263d < 0.1637357367970348d ? 0.7460011116794838d : 0.8924127929471359d;
            this.abc1003 = true;
        }
        this.abc1003 = false;
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        if (this.abc1000.size() < 4) {
            this.abc1000.add(" the inspi");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void setData(List<String> list) {
        this.list = list;
        if (this.abc1006.size() < 5) {
            this.abc1006.add("n pu");
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        int i = 0;
        if (this.abc3.size() < 0) {
            this.abc3.add("r");
            if (this.abc1002 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = this.abc1002;
                    if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            ArrayList<String> arrayList = this.abc1004;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
            if (this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    int[] iArr = this.abc1001;
                    if (i3 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i3] = 5;
                    i3++;
                }
            }
        }
        this.abc1003 = !this.abc1003;
        if (this.abc1004.size() < 2) {
            this.abc1004.add("th centu");
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        notifyDataSetChanged();
        this.abc1003 = !this.abc1003;
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc3.size() < 9) {
            this.abc3.add("lo");
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            if (this.abc1001 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr2 = this.abc1001;
                    if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i4] = 7;
                    i4++;
                }
            }
            this.abc1003 = true;
        }
        if (this.abc1001 != null) {
            int i5 = 0;
            while (true) {
                int[] iArr3 = this.abc1001;
                if (i5 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                    break;
                }
                iArr3[i5] = 3;
                i5++;
            }
        }
        if (this.abc1001 != null) {
            while (true) {
                int[] iArr4 = this.abc1001;
                if (i >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i] = 5;
                i++;
            }
        }
        if (this.abc1000.size() > 3) {
            this.abc1000.add("ore peopl");
        }
    }

    public void setOnItemClickListner(InterfaceC9632b interfaceC9632b) {
        this.onItemClickListner = interfaceC9632b;
        this.abc1005 = 0.47116968623203404d;
        if (this.abc1000.size() > 5) {
            this.abc1000.add("'ge");
        }
        if (this.abc1002 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1002;
                if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            ArrayList<String> arrayList = this.abc1006;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1006.remove(0);
            }
            if (this.abc1002 == null) {
                this.abc1002 = new String[10];
            }
            int[] iArr = this.abc1001;
            if (iArr != null) {
                iArr[3] = 0;
            }
        }
        this.abc1005 = this.abc1005 > 0.877147402004027d ? 0.6587384218119849d : 0.10771162052238481d;
        ArrayList<String> arrayList2 = this.abc1004;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1004.remove(0);
        }
        ArrayList<String> arrayList3 = this.abc1000;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            return;
        }
        this.abc1000.remove(0);
    }

    public void setSelectedIndex(int i) {
        this.selectedIndex = i;
        int i2 = 0;
        this.abc1003 = false;
        if (this.abc1006.size() < 5) {
            this.abc1006.add(" ");
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc1 = !this.abc1;
        this.abc1005 = this.abc1005 > 0.9070163656007638d ? 0.9455266372164188d : 0.04044642311391233d;
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        ArrayList<String> arrayList = this.abc1006;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1006.remove(0);
        }
        notifyDataSetChanged();
        if (this.abc1002 != null) {
            while (true) {
                String[] strArr = this.abc1002;
                if (i2 >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        this.abc1 = true;
        this.abc1003 = !this.abc1003;
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        if (TextUtils.isEmpty(this.abc1007)) {
            return;
        }
        this.abc1007 += this.abc1007.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9633c c9633c, int i) {
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc1007 = "rly 1";
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1 = true;
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[5] = "rejudice";
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1007)) {
            this.abc1007 += this.abc1007.length();
        }
        c9633c.f15914a.setText(this.list.get(i));
        ArrayList<String> arrayList = this.abc1006;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1006.remove(0);
        }
        if (this.abc1006.size() < 6) {
            this.abc1006.add("o read it.");
        }
        double d = this.abc1005 > 0.710642282328966d ? 0.7221196725500009d : 0.09564080239403028d;
        this.abc1005 = d;
        this.abc2 *= 0.44352412097138605d;
        this.abc1005 = d < 0.7065486033050207d ? 0.7271860533894394d : 0.43782819198876566d;
        String[] strArr2 = this.abc1002;
        if (strArr2 != null) {
            strArr2[5] = null;
        }
        ArrayList<String> arrayList2 = this.abc1004;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1004.remove(0);
        }
        if (i == this.selectedIndex) {
            c9633c.f15914a.setBackgroundResource(R.drawable.shape_tag_selected);
            if (this.abc1000.size() < 5) {
                this.abc1000.add("elville’s ");
            }
            if (!TextUtils.isEmpty(this.abc1007)) {
                this.abc1007 += this.abc1007.length();
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            this.abc1 = true;
            if (this.abc1006.size() < 8) {
                this.abc1006.add(CampaignEx.JSON_KEY_AD_AL);
            }
            int[] iArr = this.abc1001;
            if (iArr != null) {
                iArr[8] = 0;
            }
            this.abc1005 = this.abc1005 < 0.6472847377136164d ? 0.8742670118576956d : 0.7037711290617026d;
            c9633c.f15914a.setTextColor(ContextCompat.getColor(this.context, R.color.white));
            String[] strArr3 = this.abc1002;
            if (strArr3 != null) {
                strArr3[6] = "on, b";
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            if (this.abc1006.size() < 1) {
                this.abc1006.add(" y");
            }
            this.abc1 = true;
            if (this.abc1005 > 0.6822414189601503d) {
                this.abc1005 = 0.5226386111921835d;
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            this.abc1003 = !this.abc1003;
        } else {
            c9633c.f15914a.setBackgroundResource(R.drawable.shape_tag);
            this.abc1005 = 0.8655232519477403d;
            this.abc1 = true;
            this.abc1003 = !this.abc1003;
            this.abc1007 = " surpri";
            String[] strArr4 = this.abc1002;
            if (strArr4 != null) {
                strArr4[9] = null;
            }
            c9633c.f15914a.setTextColor(ContextCompat.getColor(this.context, R.color.default_text_color));
            if (this.abc1000.size() > 4) {
                this.abc1000.add("l");
            }
            if (this.abc1006.size() < 8) {
                this.abc1006.add("no");
            }
            if (this.abc1004.size() > 2) {
                this.abc1004.add("very");
            }
            this.abc2 = 0.3707072389927566d;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1007 = " a litera";
            if (this.abc1001 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.abc1001;
                    if (i2 >= (iArr2.length <= 3 ? iArr2.length : 3)) {
                        break;
                    }
                    iArr2[i2] = 6;
                    i2++;
                }
            }
        }
        this.abc1003 = !this.abc1003;
        this.abc1005 = this.abc1005 < 0.37747588873018867d ? 0.24193683368402918d : 0.022771837464863998d;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc1 = !this.abc1;
        this.abc1003 = !this.abc1003;
        if (this.abc1004.size() > 5) {
            this.abc1004.add("l ");
        }
        ArrayList<String> arrayList3 = this.abc1004;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1004.remove(0);
        }
        c9633c.itemView.setOnClickListener(new View$OnClickListenerC9631a(i));
        ArrayList<String> arrayList4 = this.abc1004;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1005 = -this.abc1005;
        this.abc1 = !this.abc1;
        ArrayList<String> arrayList5 = this.abc1006;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1006.remove(0);
        }
        this.abc1005 = 0.12159165127279781d;
        if (this.abc1006.size() < 2) {
            this.abc1006.add("ive sentim");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9633c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9633c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_tag, (ViewGroup) null, false));
    }
}
