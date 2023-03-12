package com.logomaster.logomaker;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ironsource.sdk.controller.C9286v;
import com.logomaster.logomaker.adapter.RvLogoImageAdapter;
import com.logomaster.logomaker.adapter.RvTagAdapter;
import com.logomaster.logomaker.databinding.FragmentLogoShapeBinding;
import com.logomaster.logomaker.p131vm.LogoShapeVM;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoAndShapeFragment extends Fragment {
    public boolean abc1;
    public double abc1002;
    public double abc1004;
    public float abc1005;
    public double abc1006;
    public float abc1009;
    private RvTagAdapter adapter;
    private FragmentLogoShapeBinding binding;
    private RvLogoImageAdapter imageAdapter;
    private LogoShapeVM logoShapeVM;
    private int type;
    public String abc1000 = " sur";
    public int abc0 = 2;
    public int abc1001 = 7;
    public ArrayList<Integer> abc1003 = new ArrayList<>();
    public boolean abc2 = false;
    public boolean abc3 = false;
    public String[] abc1007 = new String[15];
    public ArrayList<String> abc1008 = new ArrayList<>();
    public double abc4 = 0.10898057649612114d;

    /* renamed from: com.logomaster.logomaker.LogoAndShapeFragment$a */
    /* loaded from: classes3.dex */
    public class C9434a implements RvTagAdapter.InterfaceC9632b {
        public C9434a() {
        }

        @Override // com.logomaster.logomaker.adapter.RvTagAdapter.InterfaceC9632b
        /* renamed from: a */
        public void mo9166a(int i, String str) {
            LogoAndShapeFragment.this.adapter.setSelectedIndex(i);
            LogoAndShapeFragment logoAndShapeFragment = LogoAndShapeFragment.this;
            logoAndShapeFragment.abc1004 += 0.6209729322850703d;
            if (logoAndShapeFragment.abc1008.size() < 7) {
                LogoAndShapeFragment.this.abc1008.add("i");
            }
            LogoAndShapeFragment logoAndShapeFragment2 = LogoAndShapeFragment.this;
            logoAndShapeFragment2.abc1002 = logoAndShapeFragment2.abc1002 > 0.8497791692785306d ? 0.0362408343412709d : 0.015293597194793507d;
            logoAndShapeFragment2.abc2 = !logoAndShapeFragment2.abc2;
            if (!TextUtils.isEmpty(logoAndShapeFragment2.abc1000)) {
                int length = LogoAndShapeFragment.this.abc1000.length();
                LogoAndShapeFragment.this.abc1000 = LogoAndShapeFragment.this.abc1000 + length;
            }
            LogoAndShapeFragment logoAndShapeFragment3 = LogoAndShapeFragment.this;
            float f = logoAndShapeFragment3.abc1009 * 0.5741142f;
            logoAndShapeFragment3.abc1009 = f;
            logoAndShapeFragment3.abc1009 = ((double) f) < 0.7126463d ? 0.94060415f : 0.7305152f;
            logoAndShapeFragment3.logoShapeVM.setListByTag(str);
            LogoAndShapeFragment logoAndShapeFragment4 = LogoAndShapeFragment.this;
            if (logoAndShapeFragment4.abc1008 == null) {
                logoAndShapeFragment4.abc1008 = new ArrayList<>();
            }
            LogoAndShapeFragment logoAndShapeFragment5 = LogoAndShapeFragment.this;
            logoAndShapeFragment5.abc1005 = -logoAndShapeFragment5.abc1005;
            if (logoAndShapeFragment5.abc1007 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = LogoAndShapeFragment.this.abc1007;
                    if (i2 >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i2] = "string" + i2;
                    i2++;
                }
            }
            LogoAndShapeFragment logoAndShapeFragment6 = LogoAndShapeFragment.this;
            logoAndShapeFragment6.abc2 = true;
            logoAndShapeFragment6.abc1005 = ((double) logoAndShapeFragment6.abc1005) > 0.44517726d ? 0.2172975f : 0.42104524f;
            logoAndShapeFragment6.abc1004 = logoAndShapeFragment6.abc1004 < 0.7270354154102375d ? 0.5237015765302024d : 0.2507409966979619d;
            if (TextUtils.isEmpty(logoAndShapeFragment6.abc1000)) {
                return;
            }
            int length2 = LogoAndShapeFragment.this.abc1000.length();
            LogoAndShapeFragment.this.abc1000 = LogoAndShapeFragment.this.abc1000 + length2;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoAndShapeFragment$b */
    /* loaded from: classes3.dex */
    public class C9435b implements Observer<List<String>> {
        public C9435b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<String> list) {
            LogoAndShapeFragment.this.adapter.setData(list);
            LogoAndShapeFragment logoAndShapeFragment = LogoAndShapeFragment.this;
            logoAndShapeFragment.abc1006 = Math.abs(logoAndShapeFragment.abc1006);
            LogoAndShapeFragment logoAndShapeFragment2 = LogoAndShapeFragment.this;
            logoAndShapeFragment2.abc1006 = logoAndShapeFragment2.abc1006 > 0.9248631039355287d ? 0.43434290395350583d : 0.46894639790743975d;
            logoAndShapeFragment2.abc1009 = ((double) logoAndShapeFragment2.abc1009) > 0.6361725d ? 0.7176525f : 0.63635194f;
            logoAndShapeFragment2.abc1 = false;
            if (!TextUtils.isEmpty(logoAndShapeFragment2.abc1000)) {
                int length = LogoAndShapeFragment.this.abc1000.length();
                LogoAndShapeFragment logoAndShapeFragment3 = LogoAndShapeFragment.this;
                logoAndShapeFragment3.abc1000 = LogoAndShapeFragment.this.abc1000 + length;
            }
            LogoAndShapeFragment logoAndShapeFragment4 = LogoAndShapeFragment.this;
            logoAndShapeFragment4.abc1000 = "r";
            logoAndShapeFragment4.abc1006 = 0.2405282694156684d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoAndShapeFragment$c */
    /* loaded from: classes3.dex */
    public class C9436c implements RvLogoImageAdapter.InterfaceC9629b {
        public C9436c() {
        }

        @Override // com.logomaster.logomaker.adapter.RvLogoImageAdapter.InterfaceC9629b
        /* renamed from: a */
        public void mo9168a(int i, Integer num) {
            LogoAndShapeFragment logoAndShapeFragment;
            LogoAndShapeFragment.this.getActivity().setResult(-1, new Intent().putExtra("id", num));
            LogoAndShapeFragment logoAndShapeFragment2 = LogoAndShapeFragment.this;
            logoAndShapeFragment2.abc1004 *= 0.10954900442094373d;
            int i2 = 0;
            if (logoAndShapeFragment2.abc1007 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr = LogoAndShapeFragment.this.abc1007;
                    if (i3 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i3] = "string" + i3;
                    i3++;
                }
            }
            LogoAndShapeFragment logoAndShapeFragment3 = LogoAndShapeFragment.this;
            logoAndShapeFragment3.abc1009 += 0.92606544f;
            logoAndShapeFragment3.abc1 = true;
            if (logoAndShapeFragment3.abc1008.size() > 8) {
                LogoAndShapeFragment.this.abc1008.add("nea");
            }
            LogoAndShapeFragment logoAndShapeFragment4 = LogoAndShapeFragment.this;
            logoAndShapeFragment4.abc1004 = 0.6848687976045431d;
            if (logoAndShapeFragment4.abc1008 == null) {
                logoAndShapeFragment4.abc1008 = new ArrayList<>();
            }
            LogoAndShapeFragment.this.getActivity().finish();
            LogoAndShapeFragment logoAndShapeFragment5 = LogoAndShapeFragment.this;
            if (logoAndShapeFragment5.abc1007 == null) {
                logoAndShapeFragment5.abc1007 = new String[10];
            }
            logoAndShapeFragment5.abc1002 = 0.014246286674789d;
            while (true) {
                logoAndShapeFragment = LogoAndShapeFragment.this;
                int i4 = logoAndShapeFragment.abc1001;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i2 >= i4) {
                    break;
                }
                if (logoAndShapeFragment.abc1007 == null) {
                    logoAndShapeFragment.abc1007 = new String[10];
                }
                i2++;
            }
            logoAndShapeFragment.abc3 = !logoAndShapeFragment.abc3;
            if (logoAndShapeFragment.abc1004 > 0.42849702469330153d) {
                logoAndShapeFragment.abc1004 = 0.7345224893330068d;
            }
            if (!TextUtils.isEmpty(logoAndShapeFragment.abc1000)) {
                int length = LogoAndShapeFragment.this.abc1000.length();
                LogoAndShapeFragment.this.abc1000 = LogoAndShapeFragment.this.abc1000 + length;
            }
            LogoAndShapeFragment.this.abc1005 *= 0.24191308f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoAndShapeFragment$d */
    /* loaded from: classes3.dex */
    public class C9437d implements Observer<List<Integer>> {
        public C9437d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void onChanged(List<Integer> list) {
            LogoAndShapeFragment.this.imageAdapter.setData(list);
            LogoAndShapeFragment logoAndShapeFragment = LogoAndShapeFragment.this;
            if (logoAndShapeFragment.abc1002 < 0.5339348535283754d) {
                logoAndShapeFragment.abc1002 = 0.0886041398551961d;
            }
            if (logoAndShapeFragment.abc1007 != null) {
                int i = 0;
                while (true) {
                    String[] strArr = LogoAndShapeFragment.this.abc1007;
                    if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            LogoAndShapeFragment logoAndShapeFragment2 = LogoAndShapeFragment.this;
            logoAndShapeFragment2.abc1005 *= 0.86628664f;
            logoAndShapeFragment2.abc3 = true;
            logoAndShapeFragment2.abc1004 = logoAndShapeFragment2.abc1004 > 0.8549974401038556d ? 0.24760886995160714d : 0.04851239648108574d;
            logoAndShapeFragment2.abc1001 = logoAndShapeFragment2.abc1001 > 3 ? 4 : 2;
            if (TextUtils.isEmpty(logoAndShapeFragment2.abc1000)) {
                return;
            }
            int length = LogoAndShapeFragment.this.abc1000.length();
            LogoAndShapeFragment.this.abc1000 = LogoAndShapeFragment.this.abc1000 + length;
        }
    }

    public LogoAndShapeFragment() {
        this.abc1002 = 0.7029071095520425d;
        this.abc1 = false;
        this.abc1004 = 0.7325739978668645d;
        this.abc1005 = 0.6950074f;
        this.abc1006 = 0.14210695286861208d;
        this.abc1009 = 0.9806337f;
        String[] strArr = this.abc1007;
        if (strArr != null) {
            strArr[1] = null;
        }
        this.abc1002 = 0.45208255706893896d;
        if (0.9806337f > 0.39961207d) {
            this.abc1009 = 0.7202939f;
        }
        for (int i = 0; i < this.abc0; i++) {
            this.abc1 = !this.abc1;
            ArrayList<Integer> arrayList = this.abc1003;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1004 = 0.058378741505580534d;
            this.abc1002 = this.abc1002 > 0.15801771942855092d ? 0.5446892062228d : 0.2947331978467844d;
        }
        this.abc1006 = Math.abs(this.abc1006);
        this.abc1005 = ((double) this.abc1005) > 0.49075264d ? 0.6256069f : 0.020559132f;
        ArrayList<String> arrayList2 = this.abc1008;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        this.abc1008.remove(0);
    }

    private void initData() {
        if (this.type == 0) {
            this.binding.rvTags.setVisibility(0);
            this.abc1001 = -this.abc1001;
            this.abc1005 = ((double) this.abc1005) < 0.23994255d ? 0.69660354f : 0.8963136f;
            Math.abs(this.abc1004);
            this.abc1 = !this.abc1;
            this.abc1004 = 0.5961796795091197d;
            if (this.abc1008.size() > 7) {
                this.abc1008.add("tion f");
            }
            this.abc1009 += 0.13076848f;
        } else {
            this.binding.rvTags.setVisibility(8);
            this.abc1006 = 0.6516440958449367d;
            if (this.abc1004 < 0.4596408288262438d) {
                this.abc1004 = 0.29737990339054243d;
            }
            if (0.6516440958449367d > 0.7647240967526588d) {
                this.abc1006 = 0.012086227424688789d;
            }
            this.abc2 = true;
            this.abc1004 = -this.abc1004;
            this.abc1006 -= 0.8391082372348775d;
            ArrayList<Integer> arrayList = this.abc1003;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc1003.remove(0);
            }
        }
        this.abc1002 = 0.3473196043509186d;
        double d = this.abc1006 + 0.5023390901836906d;
        this.abc1006 = d;
        this.abc1006 = d > 0.777081633746034d ? 0.24113279031076773d : 0.4187360908096055d;
        this.abc4 = this.abc4 > 0.2991543737431249d ? 0.15913867381811786d : 0.6235836667305124d;
        this.abc1005 = 0.09054023f;
        this.abc1005 = ((double) 0.09054023f) < 0.53303766d ? 0.86485726f : 0.85775596f;
        String[] strArr = this.abc1007;
        if (strArr != null) {
            strArr[3] = null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        if (this.abc1008 == null) {
            this.abc1008 = new ArrayList<>();
        }
        if (this.abc1008.size() < 9) {
            this.abc1008.add(" pu");
        }
        String[] strArr2 = this.abc1007;
        if (strArr2 != null) {
            strArr2[2] = "def";
        }
        if (this.abc0 > 0) {
            this.abc0 = 6;
            ArrayList<Integer> arrayList2 = this.abc1003;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
            ArrayList<Integer> arrayList3 = this.abc1003;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1003.remove(0);
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1004 = 0.10298545709528029d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1005 = 0.20805359f;
        linearLayoutManager.setOrientation(0);
        this.abc1009 = 0.62870395f;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        Math.abs(this.abc1001);
        this.abc2 = !this.abc2;
        this.abc1009 = -this.abc1009;
        this.abc1001 = 5;
        this.abc1004 -= 0.04101691713281774d;
        this.binding.rvTags.setLayoutManager(linearLayoutManager);
        this.abc1004 = 0.7666382494133953d;
        String[] strArr3 = this.abc1007;
        if (strArr3 != null) {
            strArr3[9] = null;
        }
        this.abc1 = !this.abc1;
        this.abc1001 = Math.abs(this.abc1001);
        String[] strArr4 = this.abc1007;
        if (strArr4 != null) {
            strArr4[9] = null;
        }
        this.abc1002 = 0.5043485581092099d;
        this.adapter = new RvTagAdapter(new ArrayList(), getContext());
        this.abc1006 = 0.5763329719533284d;
        if (0.5763329719533284d < 0.09039485924235768d) {
            this.abc1006 = 0.8363860248044644d;
        }
        this.abc1004 *= 0.6175127909619039d;
        this.abc4 *= 0.3494726710459912d;
        this.abc1001 = Math.abs(this.abc1001);
        this.abc1004 = 0.6874610579828778d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.adapter.setOnItemClickListner(new C9434a());
        this.abc1005 = 0.21530497f;
        this.abc1009 = ((double) this.abc1009) > 0.27779913d ? 0.51768917f : 0.5845484f;
        ArrayList<String> arrayList4 = this.abc1008;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1008.remove(0);
        }
        this.abc0 += 3;
        this.abc1004 = -this.abc1004;
        this.abc1006 = Math.abs(this.abc1006) - 0.465336865956389d;
        this.binding.rvTags.setAdapter(this.adapter);
        this.abc1005 = 0.7136868f;
        this.abc1000 = C9286v.f15223a;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc2 = !this.abc2;
        int i = this.abc1001 - 9;
        this.abc1001 = i;
        if (this.abc1005 > 0.50624084d) {
            this.abc1005 = 0.8548185f;
        }
        this.abc1001 = -i;
        this.logoShapeVM.getListTags().observe(getViewLifecycleOwner(), new C9435b());
        if (this.abc1005 > 0.90692157d) {
            this.abc1005 = 0.17589134f;
        }
        this.abc1005 = 0.17501682f;
        this.abc1005 = ((double) 0.17501682f) < 0.7867296d ? 0.65221363f : 0.7266641f;
        this.abc1 = false;
        ArrayList<Integer> arrayList5 = this.abc1003;
        if (arrayList5 == null && arrayList5.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1002 = this.abc1002 > 0.08695439305787989d ? 0.8585526708606084d : 0.8927030435040856d;
        this.abc1005 = -this.abc1005;
        this.binding.rvImages.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.abc1005 = 0.13164037f;
        this.abc1009 = ((double) this.abc1009) < 0.9785275d ? 0.5776723f : 0.6356001f;
        if (this.abc1004 < 0.48167101534630785d) {
            this.abc1004 = 0.10964381403342127d;
        }
        this.abc0 = this.abc0 < 4 ? 2 : 3;
        this.abc1002 = -this.abc1002;
        this.abc1001 += 6;
        if (0.13164037f > 0.07635677d) {
            this.abc1005 = 0.08829868f;
        }
        this.imageAdapter = new RvLogoImageAdapter(new ArrayList(), getContext());
        int i2 = 0;
        while (true) {
            int i3 = this.abc1001;
            if (i3 > 3) {
                i3 = 3;
            }
            if (i2 >= i3) {
                break;
            }
            this.abc1001 = 0;
            i2++;
        }
        this.abc1005 = ((double) this.abc1005) < 0.9773544d ? 0.32102156f : 0.31141627f;
        this.abc1006 += 0.06003762099869403d;
        this.abc1 = true;
        if (this.abc1008 == null) {
            this.abc1008 = new ArrayList<>();
        }
        this.abc1006 = this.abc1006 > 0.3784334554207096d ? 0.5210238420388229d : 0.09570006405959774d;
        this.abc1002 = 0.9884027020427707d;
        this.imageAdapter.setOnItemClickListner(new C9436c());
        if (this.abc1007 == null) {
            this.abc1007 = new String[10];
        }
        double d2 = this.abc1002 - 0.07584513929045722d;
        this.abc1002 = d2;
        if (d2 > 0.5494368162843395d) {
            this.abc1002 = 0.708754175753655d;
        }
        this.abc1 = false;
        if (this.abc1001 < 0) {
            this.abc1001 = 9;
        }
        this.abc1004 = 0.45507861344523515d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.binding.rvImages.setAdapter(this.imageAdapter);
        this.abc1000 = "en";
        String[] strArr5 = this.abc1007;
        if (strArr5 != null) {
            strArr5[3] = "ed to r";
        }
        if (!TextUtils.isEmpty("en")) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc0 < 0) {
            this.abc0 = 8;
            if (this.abc1008.size() > 5) {
                this.abc1008.add("ery ");
            }
            this.abc1005 = 0.643367f;
            this.abc1001 = -this.abc1001;
        }
        this.abc1002 -= 0.9905513798301699d;
        this.abc1009 = 0.11906475f * 0.9971476f;
        this.logoShapeVM.getListData().observe(getViewLifecycleOwner(), new C9437d());
        this.abc1006 = this.abc1006 > 0.10927145596461774d ? 0.5236646322406692d : 0.5999809351105363d;
        double d3 = 0.03054735565366329d - 0.8750442954672748d;
        this.abc1004 = d3;
        this.abc3 = true;
        this.abc1004 = Math.abs(d3);
        ArrayList<Integer> arrayList6 = this.abc1003;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1006 += 0.39568233403964537d;
        this.logoShapeVM.initData(this.type);
        this.abc1000 = "e and Prej";
        this.abc1005 = 0.6099751f;
        String[] strArr6 = this.abc1007;
        if (strArr6 != null) {
            strArr6[2] = "l for ";
        }
        this.abc1 = !this.abc1;
        if (this.abc1001 > 0) {
            this.abc1001 = 2;
        }
        this.abc1000 = " rec";
        if (strArr6 != null) {
            strArr6[3] = "y more f";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        while (true) {
            int i2 = this.abc1001;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            i++;
        }
        this.abc1002 = this.abc1002 < 0.8989519164740761d ? 0.21797736073820584d : 0.9394925920417367d;
        if (this.abc1004 > 0.5322809354910509d) {
            this.abc1004 = 0.6504575810465855d;
        }
        this.abc2 = !this.abc2;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1004 = this.abc1004 < 0.824671919121222d ? 0.07111579580126481d : 0.379852459084293d;
        this.abc1006 = this.abc1006 < 0.4581235281997046d ? 0.49189093577531884d : 0.16664959839326232d;
        this.logoShapeVM = (LogoShapeVM) new ViewModelProvider(this).get(LogoShapeVM.class);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        ArrayList<String> arrayList = this.abc1008;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1008.remove(0);
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        for (int i3 = 0; i3 < this.abc0; i3++) {
            this.abc3 = !this.abc3;
            String[] strArr = this.abc1007;
            if (strArr != null) {
                strArr[6] = "liar wi";
            }
            this.abc1006 = 0.6966979016750692d;
            if (0.6966979016750692d < 0.5669832914054376d) {
                this.abc1006 = 0.8679984713726886d;
            }
        }
        this.abc1004 *= 0.5304853377751679d;
        if (this.abc1003.size() > 7) {
            this.abc1003.add(0);
        }
        this.abc1005 = 0.49703497f;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 0;
        this.binding = (FragmentLogoShapeBinding) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_logo_shape, viewGroup, false);
        this.abc1006 = 0.6971460725762004d;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = -this.abc1001;
        this.abc1 = true;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1007 != null) {
            while (true) {
                String[] strArr = this.abc1007;
                if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        this.abc1006 = 0.07189991465503964d;
        return this.binding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = 0;
        while (true) {
            int i2 = this.abc1001;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.abc1004 = 0.8254986799447405d;
            i++;
        }
        this.abc1004 = this.abc1004 < 0.5296124444433119d ? 0.8436938744495143d : 0.5563353806968124d;
        this.abc1005 *= 0.14617342f;
        this.abc3 = true;
        this.abc1009 -= 0.0504241f;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        ArrayList<String> arrayList = this.abc1008;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1008.remove(0);
        }
        this.binding.setLifecycleOwner(this);
        this.abc1004 = this.abc1004 < 0.2864446852413517d ? 0.6298821556153749d : 0.3864522544635912d;
        this.abc1001 = -this.abc1001;
        if (this.abc1005 < 0.7090669d) {
            this.abc1005 = 0.5883874f;
        }
        this.abc1 = true ^ this.abc1;
        this.abc1005 = 0.5698219f;
        this.abc1000 = "is";
        initData();
        this.abc1001 = 0;
        if (this.abc1006 > 0.2938866561054315d) {
            this.abc1006 = 0.20643131032552942d;
        }
        this.abc1006 = 0.39196560690312887d;
        this.abc3 = false;
        this.abc1000 = "ury, it’";
        this.abc1001 = 6;
        this.abc1006 = 0.9268774559710453d;
    }

    public void setType(int i) {
        this.type = i;
    }
}
