package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RvLogoImageAdapter extends RecyclerView.Adapter<C9630c> {
    public boolean abc0;
    public String abc1001;
    public double abc1004;
    public int abc1005;
    private Context context;
    private List<Integer> list;
    private InterfaceC9629b onItemClickListner;
    public String abc1000 = " i";
    public double abc1002 = 0.17179745080409592d;
    public double abc1 = 0.08101753138802559d;
    public ArrayList<Integer> abc1003 = new ArrayList<>();
    public int abc2 = 5;

    /* renamed from: com.logomaster.logomaker.adapter.RvLogoImageAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9628a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15908a;

        public View$OnClickListenerC9628a(int i) {
            this.f15908a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RvLogoImageAdapter.this.onItemClickListner != null) {
                RvLogoImageAdapter.this.onItemClickListner.mo9168a(this.f15908a, (Integer) RvLogoImageAdapter.this.list.get(this.f15908a));
                RvLogoImageAdapter rvLogoImageAdapter = RvLogoImageAdapter.this;
                rvLogoImageAdapter.abc1002 += 0.08300635740768614d;
                if (rvLogoImageAdapter.abc1005 > 0) {
                    rvLogoImageAdapter.abc1005 = 5;
                }
                if (rvLogoImageAdapter.abc1003.size() < 9) {
                    RvLogoImageAdapter.this.abc1003.add(7);
                }
                RvLogoImageAdapter rvLogoImageAdapter2 = RvLogoImageAdapter.this;
                rvLogoImageAdapter2.abc2 = 5;
                rvLogoImageAdapter2.abc1005 = 5;
                if (rvLogoImageAdapter2.abc1004 < 0.05741341516591014d) {
                    rvLogoImageAdapter2.abc1004 = 0.9173024259409294d;
                }
                rvLogoImageAdapter2.abc1004 = rvLogoImageAdapter2.abc1004 < 0.5732954208916968d ? 0.48052775427658867d : 0.3620385305287641d;
            }
            if (!TextUtils.isEmpty(RvLogoImageAdapter.this.abc1000)) {
                int length = RvLogoImageAdapter.this.abc1000.length();
                RvLogoImageAdapter.this.abc1000 = RvLogoImageAdapter.this.abc1000 + length;
            }
            RvLogoImageAdapter rvLogoImageAdapter3 = RvLogoImageAdapter.this;
            rvLogoImageAdapter3.abc1004 = rvLogoImageAdapter3.abc1004 < 0.6502175788505347d ? 0.11034674236196751d : 0.3710939426085079d;
            rvLogoImageAdapter3.abc1005 *= 0;
            rvLogoImageAdapter3.abc2 -= 4;
            if (!TextUtils.isEmpty(rvLogoImageAdapter3.abc1001)) {
                int length2 = RvLogoImageAdapter.this.abc1001.length();
                RvLogoImageAdapter.this.abc1001 = RvLogoImageAdapter.this.abc1001 + length2;
            }
            RvLogoImageAdapter.this.abc1000 = "el wasn’t";
            if (TextUtils.isEmpty("el wasn’t")) {
                return;
            }
            int length3 = RvLogoImageAdapter.this.abc1000.length();
            RvLogoImageAdapter.this.abc1000 = RvLogoImageAdapter.this.abc1000 + length3;
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.RvLogoImageAdapter$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9629b {
        /* renamed from: a */
        void mo9168a(int i, Integer num);
    }

    /* renamed from: com.logomaster.logomaker.adapter.RvLogoImageAdapter$c */
    /* loaded from: classes3.dex */
    public class C9630c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f15910a;

        public C9630c(@NonNull View view) {
            super(view);
            this.f15910a = (ImageView) view.findViewById(R.id.iv_logo);
        }
    }

    public RvLogoImageAdapter(List<Integer> list, Context context) {
        this.list = null;
        this.abc0 = false;
        this.abc1001 = "tone, ";
        this.abc1004 = 0.3286374301270423d;
        this.abc1005 = 3;
        this.list = list;
        if (0.3286374301270423d < 0.13093989503905468d) {
            this.abc1004 = 0.5827957860822935d;
        }
        this.abc1005 = Math.abs(3);
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1 -= 0.7369517064855575d;
        this.abc1001 = "t";
        if (!TextUtils.isEmpty("t")) {
            this.abc1001 += this.abc1001.length();
        }
        ArrayList<Integer> arrayList2 = this.abc1003;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        this.context = context;
        this.abc1005 = -this.abc1005;
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc1003.size() < 6) {
            this.abc1003.add(3);
        }
        this.abc0 = true;
        this.abc1004 = this.abc1004 > 0.288681517164306d ? 0.022377678574420745d : 0.2814809268234283d;
        if (this.abc1003.size() > 1) {
            this.abc1003.add(4);
        }
        if (TextUtils.isEmpty(this.abc1001)) {
            return;
        }
        this.abc1001 += this.abc1001.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public void setData(List<Integer> list) {
        this.list = list;
        if (this.abc1005 > 0) {
            this.abc1005 = 3;
        }
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1001)) {
            this.abc1001 += this.abc1001.length();
        }
        this.abc1 = this.abc1 < 0.9830728032617501d ? 0.33917774017497815d : 0.49037282767196166d;
        this.abc1004 = 0.5327894218931707d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1004 = Math.abs(this.abc1004);
        notifyDataSetChanged();
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1 = 0.5607166649593052d;
        this.abc1001 = "it.";
        this.abc1004 = 0.25828950424729813d;
    }

    public void setOnItemClickListner(InterfaceC9629b interfaceC9629b) {
        this.onItemClickListner = interfaceC9629b;
        this.abc1005 = 9;
        this.abc1001 = "ts ar";
        if (!TextUtils.isEmpty("ts ar")) {
            this.abc1001 += this.abc1001.length();
        }
        if (this.abc2 > 0) {
            this.abc2 = 2;
            this.abc1000 = "and ch";
            this.abc1002 = 0.9753576459636694d;
            this.abc1004 = this.abc1004 < 0.36451292245281774d ? 0.7072791979002707d : 0.4878020795114214d;
        }
        this.abc1004 = 0.17824033370761838d;
        this.abc1005 = -(this.abc1005 - 7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9630c c9630c, int i) {
        this.abc1002 = this.abc1002 > 0.41763544842110933d ? 0.6261000713196743d : 0.3681365213232045d;
        this.abc1000 = " in man";
        this.abc1004 = 0.7869734655470463d;
        int i2 = 0;
        while (true) {
            int i3 = this.abc2;
            if (i2 >= i3) {
                break;
            }
            this.abc2 = -i3;
            this.abc1002 = 0.037405321659452206d;
            this.abc1005 = (this.abc1005 - 3) + 0;
            i2++;
        }
        this.abc1002 -= 0.14527782010098111d;
        this.abc1004 *= 0.18003532994873528d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        c9630c.f15910a.setImageResource(this.list.get(i).intValue());
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        int i4 = 0;
        while (true) {
            int i5 = this.abc1005;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i4 >= i5) {
                break;
            }
            this.abc1004 = -this.abc1004;
            i4++;
        }
        this.abc1001 = "n, bas";
        this.abc1 = Math.abs(this.abc1);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList2 = this.abc1003;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1004 = this.abc1004 > 0.1066817250320391d ? 0.11635994270083883d : 0.35231016716143826d;
        c9630c.itemView.setOnClickListener(new View$OnClickListenerC9628a(i));
        this.abc1001 = "ice is ";
        this.abc1002 = 0.5375885728101149d;
        if (this.abc1005 > 0) {
            this.abc1005 = 2;
        }
        this.abc2 = 9;
        this.abc1002 = 0.5375885728101149d > 0.42536786599791787d ? 0.2749639983283151d : 0.4232715022828686d;
        if (this.abc1003.size() > 3) {
            this.abc1003.add(7);
        }
        this.abc1002 = 0.9835348637211377d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9630c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9630c(LayoutInflater.from(this.context).inflate(R.layout.item_rv_image, (ViewGroup) null, false));
    }
}
