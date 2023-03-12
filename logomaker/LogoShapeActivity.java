package com.logomaster.logomaker;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.logomaster.logomaker.LogoShapeActivity;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.databinding.ActivityLogoShapeBinding;
import com.logomaster.logomaker.p131vm.LogoShapeVM;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoShapeActivity extends LogoBaseActivity {
    private ActivityLogoShapeBinding binding;
    private List<LogoAndShapeFragment> listFragment;
    private LogoShapeVM logoShapeVM;
    private String[] names;
    public float abc1000 = 0.09443182f;
    public int abc0 = 3;
    public String[] abc1001 = new String[12];
    public double abc1002 = 0.43184801025159636d;
    public ArrayList<Integer> abc1 = new ArrayList<>();
    public float abc1003 = 0.4960404f;
    public String abc1004 = "ne, t";
    public int[] abc2 = new int[16];
    public ArrayList<String> abc1005 = new ArrayList<>();
    public ArrayList<Integer> abc1006 = new ArrayList<>();
    public ArrayList<String> abc3 = new ArrayList<>();
    public ArrayList<Integer> abc1007 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.LogoShapeActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9586a implements View.OnClickListener {
        public View$OnClickListenerC9586a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoShapeActivity.this.onBackPressed();
            if (LogoShapeActivity.this.abc1007.size() < 1) {
                LogoShapeActivity.this.abc1007.add(2);
            }
            LogoShapeActivity logoShapeActivity = LogoShapeActivity.this;
            logoShapeActivity.abc1000 = 0.4535827f;
            logoShapeActivity.abc1002 = logoShapeActivity.abc1002 < 0.08128972186852723d ? 0.9765943395174604d : 0.02682478394624077d;
            int[] iArr = logoShapeActivity.abc2;
            if (iArr != null) {
                int i = 0;
                iArr[8] = 0;
                logoShapeActivity.abc1000 = ((double) 0.4535827f) > 0.50507814d ? 0.7319036f : 0.14873081f;
                ArrayList<Integer> arrayList = logoShapeActivity.abc1006;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoShapeActivity.this.abc1006.remove(0);
                }
                if (LogoShapeActivity.this.abc1001 != null) {
                    while (true) {
                        String[] strArr = LogoShapeActivity.this.abc1001;
                        if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                            break;
                        }
                        strArr[i] = "string" + i;
                        i++;
                    }
                }
            }
            LogoShapeActivity logoShapeActivity2 = LogoShapeActivity.this;
            if (logoShapeActivity2.abc1005 == null) {
                logoShapeActivity2.abc1005 = new ArrayList<>();
            }
            LogoShapeActivity logoShapeActivity3 = LogoShapeActivity.this;
            logoShapeActivity3.abc1002 = 0.273232845247979d;
            String[] strArr2 = logoShapeActivity3.abc1001;
            if (strArr2 != null) {
                strArr2[6] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoShapeActivity$b */
    /* loaded from: classes3.dex */
    public class C9587b extends FragmentStateAdapter {
        public C9587b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i) {
            return (Fragment) LogoShapeActivity.this.listFragment.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return LogoShapeActivity.this.listFragment.size();
        }
    }

    private void init() {
        this.binding.rlBack.setOnClickListener(new View$OnClickListenerC9586a());
        this.abc1002 += 0.13911483127792101d;
        if (this.abc1006.size() > 4) {
            this.abc1006.add(9);
        }
        this.abc1002 = 0.7570960501839721d;
        ArrayList<Integer> arrayList = this.abc1;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1.remove(0);
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            this.abc1002 = Math.abs(this.abc1002);
            if (this.abc1006.size() < 0) {
                this.abc1006.add(7);
            }
        }
        this.abc1000 = Math.abs(this.abc1000);
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.abc1002 = 0.6841660615565957d;
        this.listFragment = new ArrayList();
        if (this.abc1006.size() < 8) {
            this.abc1006.add(2);
        }
        this.abc1003 = 0.5614105f;
        this.abc1002 = 0.6383323442535739d;
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            ArrayList<Integer> arrayList2 = this.abc1007;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.abc1007.remove(0);
            }
            this.abc1002 = -0.39603410783510684d;
        }
        this.abc1002 = 0.7115802449244985d;
        this.abc1003 = 0.76083225f;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        LogoAndShapeFragment logoAndShapeFragment = new LogoAndShapeFragment();
        logoAndShapeFragment.setType(0);
        this.listFragment.add(logoAndShapeFragment);
        this.abc1000 = 0.7490275f;
        if (this.abc1005.size() < 2) {
            this.abc1005.add(" rea");
        }
        this.abc1002 = this.abc1002 < 0.4385377821264015d ? 0.7627132901383321d : 0.9930839480459258d;
        if (this.abc0 < 0) {
            this.abc0 = 7;
            this.abc1002 = 0.946120176826235d;
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList3 = this.abc1006;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc1006.remove(0);
            }
        }
        if (this.abc1003 > 0.74480253d) {
            this.abc1003 = 0.46993268f;
        }
        this.abc1004 = "el tha";
        this.abc1003 += 0.18095523f;
        LogoAndShapeFragment logoAndShapeFragment2 = new LogoAndShapeFragment();
        logoAndShapeFragment2.setType(1);
        this.listFragment.add(logoAndShapeFragment2);
        this.abc1002 = 0.7749858915881704d;
        ArrayList<Integer> arrayList4 = this.abc1007;
        if (arrayList4 == null && arrayList4.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc1000 += 0.08396685f;
        if (this.abc3.size() > 3) {
            this.abc3.add("，github地址");
            this.abc1004 = " many ways";
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
            this.abc1004 = "s";
        }
        if (this.abc1005.size() > 0) {
            this.abc1005.add(", the insp");
        }
        if (this.abc1005.size() > 1) {
            this.abc1005.add("t.");
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        this.binding.vp2Fragment.setAdapter(new C9587b(this));
        this.abc1002 = 0.018411339296650064d - 0.030373852633562293d;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            this.abc1002 += 0.14980319429729438d;
        }
        this.abc1003 = ((double) this.abc1003) > 0.19263315d ? 0.9010574f : 0.84947425f;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        this.abc1003 = 0.32589787f;
        ActivityLogoShapeBinding activityLogoShapeBinding = this.binding;
        new TabLayoutMediator(activityLogoShapeBinding.tablayout, activityLogoShapeBinding.vp2Fragment, new TabLayoutMediator.TabConfigurationStrategy() { // from class: hi
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                LogoShapeActivity.this.lambda$init$0(tab, i);
            }
        }).attach();
        this.abc1002 += 0.011616878572917488d;
        this.abc1003 = 0.46832263f;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.abc0 -= 0;
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        this.abc1004 = "y unti";
        ArrayList<Integer> arrayList5 = this.abc1006;
        if (arrayList5 != null || arrayList5.size() <= 0) {
            return;
        }
        this.abc1006.remove(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(TabLayout.Tab tab, int i) {
        tab.setText(this.names[i]);
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<Integer> arrayList = this.abc1006;
        int i = 0;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc1006.remove(0);
        }
        this.abc1004 = "Y";
        if (this.abc1005.size() > 8) {
            this.abc1005.add("is kind ");
        }
        int[] iArr = this.abc2;
        if (iArr != null) {
            iArr[6] = 0;
            this.abc1000 = ((double) this.abc1000) > 0.16673613d ? 0.93710375f : 0.1933474f;
            this.abc1002 *= 0.9798835342588619d;
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        if (this.abc1007.size() > 4) {
            this.abc1007.add(1);
        }
        if (this.abc1001 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc1001;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        this.abc1000 = 0.72829926f;
        this.logoShapeVM = (LogoShapeVM) new ViewModelProvider(this).get(LogoShapeVM.class);
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1004)) {
            this.abc1004 += this.abc1004.length();
        }
        if (this.abc1002 < 0.3268654489745231d) {
            this.abc1002 = 0.6483610041797961d;
        }
        int[] iArr2 = this.abc2;
        if (iArr2 != null) {
            iArr2[5] = 4;
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
            this.abc1000 = 0.15359837f;
        }
        if (this.abc1005.size() > 7) {
            this.abc1005.add("on ");
        }
        if (this.abc1005.size() > 9) {
            this.abc1005.add("n nove");
        }
        this.abc1004 = "e nov";
        this.binding = (ActivityLogoShapeBinding) DataBindingUtil.setContentView(this, R.layout.activity_logo_shape);
        this.abc1000 = 0.016972244f;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.abc1000 = 0.016972244f * 0.06093037f;
        if (this.abc1.size() < 5) {
            this.abc1.add(5);
            this.abc1004 = "u realize ";
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            if (this.abc1002 > 0.40535124082730856d) {
                this.abc1002 = 0.8809014325768876d;
            }
        }
        ArrayList<Integer> arrayList2 = this.abc1006;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc1006.remove(0);
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        this.abc1003 = 0.8400635f;
        this.binding.setLifecycleOwner(this);
        ArrayList<Integer> arrayList3 = this.abc1006;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc1006.remove(0);
        }
        if (this.abc1007.size() > 8) {
            this.abc1007.add(0);
        }
        if (this.abc1007.size() > 8) {
            this.abc1007.add(1);
        }
        ArrayList<String> arrayList4 = this.abc3;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc3.remove(0);
            this.abc1002 = 0.4416815056087394d;
            float f = this.abc1003 - 0.39816087f;
            this.abc1003 = f;
            this.abc1003 = ((double) f) < 0.8590794d ? 0.26075745f : 0.57589096f;
        }
        if (this.abc1003 > 0.6515669d) {
            this.abc1003 = 0.99537325f;
        }
        this.abc1000 *= 0.66279024f;
        ArrayList<String> arrayList5 = this.abc1005;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1005.remove(0);
        }
        this.binding.setViewModel(this.logoShapeVM);
        if (this.abc1006.size() > 4) {
            this.abc1006.add(1);
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        if (this.abc1003 > 0.28717327d) {
            this.abc1003 = 0.8574957f;
        }
        this.abc0 = 7;
        ArrayList<String> arrayList6 = this.abc1005;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc1005.remove(0);
        }
        if (this.abc1002 > 0.015490355149013202d) {
            this.abc1002 = 0.5832166557337916d;
        }
        if (this.abc1005 == null) {
            this.abc1005 = new ArrayList<>();
        }
        setSupportActionBar(this.binding.toolbar);
        this.abc1004 = "ication (i";
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        this.abc1002 = 0.11624581192513894d;
        if (this.abc1 == null) {
            this.abc1 = new ArrayList<>();
            if (this.abc1005.size() < 3) {
                this.abc1005.add("y");
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            if (this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.abc1001;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    i3++;
                }
            }
        }
        double d = this.abc1002 > 0.5672265738118172d ? 0.9737414362602097d : 0.29710626019963593d;
        this.abc1002 = d;
        this.abc1004 = "receive";
        if (d < 0.9970805401192689d) {
            this.abc1002 = 0.6355380917729436d;
        }
        this.names = new String[2];
        if (this.abc1005.size() < 2) {
            this.abc1005.add("iar with");
        }
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        this.abc1000 = Math.abs(this.abc1000);
        ArrayList<Integer> arrayList7 = this.abc1;
        if (arrayList7 == null && arrayList7.size() > 0) {
            this.abc1.remove(0);
            this.abc1003 = 0.14433038f;
            this.abc1002 = 0.37115933747142604d;
            if (this.abc1006 == null) {
                this.abc1006 = new ArrayList<>();
            }
        }
        this.abc1002 = 0.9528043419983766d - 0.04770773915731974d;
        this.abc1000 = ((double) this.abc1000) > 0.5064144d ? 0.22515851f : 0.76449376f;
        this.names[0] = getString(R.string.logo);
        this.abc1003 = 0.06307423f;
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        if (this.abc1006 == null) {
            this.abc1006 = new ArrayList<>();
        }
        int[] iArr3 = this.abc2;
        if (iArr3 != null) {
            iArr3[1] = 9;
            if (this.abc1005.size() > 7) {
                this.abc1005.add(" a");
            }
            ArrayList<String> arrayList8 = this.abc1005;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc1005.remove(0);
            }
            String[] strArr3 = this.abc1001;
            if (strArr3 != null) {
                strArr3[1] = " define";
            }
        }
        if (this.abc1001 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.abc1001;
                if (i4 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i4] = "string" + i4;
                i4++;
            }
        }
        ArrayList<Integer> arrayList9 = this.abc1006;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.abc1006.remove(0);
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.names[1] = getString(R.string.shape);
        ArrayList<Integer> arrayList10 = this.abc1006;
        if (arrayList10 == null && arrayList10.size() > 0) {
            this.abc1006.remove(0);
        }
        if (this.abc1002 > 0.11654903416741791d) {
            this.abc1002 = 0.4298918990537022d;
        }
        if (this.abc1007.size() < 8) {
            this.abc1007.add(2);
        }
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            if (this.abc1005 == null) {
                this.abc1005 = new ArrayList<>();
            }
            this.abc1002 = 0.2994303422751914d;
            if (this.abc1003 < 0.3820951d) {
                this.abc1003 = 0.8926701f;
            }
        }
        if (this.abc1007.size() > 6) {
            this.abc1007.add(1);
        }
        if (this.abc1007.size() > 1) {
            this.abc1007.add(0);
        }
        if (this.abc1003 < 0.62221324d) {
            this.abc1003 = 0.33977717f;
        }
        init();
        this.abc1003 = 0.35116684f;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        this.abc1002 -= 0.26417566224866096d;
        if (this.abc2 == null) {
            this.abc2 = new int[10];
            this.abc1000 = 0.7322944f;
            this.abc1002 = 0.059506964188997924d;
            this.abc1003 = 0.21279466f;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
        }
        if (this.abc1001 != null) {
            while (true) {
                String[] strArr5 = this.abc1001;
                if (i >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i] = "string" + i;
                i++;
            }
        }
        this.abc1002 = this.abc1002 > 0.7141767303315899d ? 0.2653362474036909d : 0.8900056984911052d;
    }
}
