package com.logomaster.logomaker.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.logomaster.logomaker.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogoRvMyLogoAdapter extends RecyclerView.Adapter<C9627e> {
    public float abc1000;
    public boolean abc1002;
    public ArrayList<String> abc1003;
    public ArrayList<String> abc1004;
    public ArrayList<String> abc1007;
    public int abc2;
    private Context context;
    private boolean isShowCheckedBox;
    private List<LogoMyLogoEntity> list;
    private InterfaceC9626d onItemMenuClickListner;
    public ArrayList<String> abc0 = new ArrayList<>();
    public int[] abc1001 = new int[16];
    public String abc1 = "性";
    public String[] abc1005 = new String[16];
    public String[] abc1006 = new String[18];
    public ArrayList<Integer> abc3 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9623a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15893a;

        /* renamed from: b */
        public final /* synthetic */ LogoMyLogoEntity f15894b;

        public View$OnClickListenerC9623a(int i, LogoMyLogoEntity logoMyLogoEntity) {
            this.f15893a = i;
            this.f15894b = logoMyLogoEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoRvMyLogoAdapter.this.onItemMenuClickListner != null) {
                LogoRvMyLogoAdapter.this.onItemMenuClickListner.mo9175b(this.f15893a, this.f15894b);
                LogoRvMyLogoAdapter logoRvMyLogoAdapter = LogoRvMyLogoAdapter.this;
                logoRvMyLogoAdapter.abc1000 += 0.7685181f;
                if (logoRvMyLogoAdapter.abc1003 == null) {
                    logoRvMyLogoAdapter.abc1003 = new ArrayList<>();
                }
                if (LogoRvMyLogoAdapter.this.abc1004.size() > 0) {
                    LogoRvMyLogoAdapter.this.abc1004.add("he ");
                }
                if (LogoRvMyLogoAdapter.this.abc3.size() > 5) {
                    LogoRvMyLogoAdapter.this.abc3.add(2);
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter2 = LogoRvMyLogoAdapter.this;
                    String[] strArr = logoRvMyLogoAdapter2.abc1005;
                    if (strArr != null) {
                        strArr[3] = null;
                    }
                    if (logoRvMyLogoAdapter2.abc1004.size() < 9) {
                        LogoRvMyLogoAdapter.this.abc1004.add("l, ");
                    }
                    LogoRvMyLogoAdapter.this.abc1002 = false;
                }
                LogoRvMyLogoAdapter logoRvMyLogoAdapter3 = LogoRvMyLogoAdapter.this;
                logoRvMyLogoAdapter3.abc1002 = !logoRvMyLogoAdapter3.abc1002;
                if (logoRvMyLogoAdapter3.abc1004 == null) {
                    logoRvMyLogoAdapter3.abc1004 = new ArrayList<>();
                }
                LogoRvMyLogoAdapter.this.abc1002 = false;
            }
            ArrayList<String> arrayList = LogoRvMyLogoAdapter.this.abc1004;
            if (arrayList != null && arrayList.size() > 0) {
                LogoRvMyLogoAdapter.this.abc1004.remove(0);
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter4 = LogoRvMyLogoAdapter.this;
            int[] iArr = logoRvMyLogoAdapter4.abc1001;
            if (iArr != null) {
                iArr[2] = 0;
            }
            if (iArr != null) {
                iArr[4] = 6;
            }
            if (logoRvMyLogoAdapter4.abc0.size() < 2) {
                LogoRvMyLogoAdapter.this.abc0.add("i");
                LogoRvMyLogoAdapter logoRvMyLogoAdapter5 = LogoRvMyLogoAdapter.this;
                String[] strArr2 = logoRvMyLogoAdapter5.abc1006;
                if (strArr2 != null) {
                    strArr2[2] = " ec";
                }
                if (logoRvMyLogoAdapter5.abc1004 == null) {
                    logoRvMyLogoAdapter5.abc1004 = new ArrayList<>();
                }
                LogoRvMyLogoAdapter.this.abc1000 = 0.07291001f;
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter6 = LogoRvMyLogoAdapter.this;
            if (logoRvMyLogoAdapter6.abc1001 == null) {
                logoRvMyLogoAdapter6.abc1001 = new int[10];
            }
            if (logoRvMyLogoAdapter6.abc1003.size() > 3) {
                LogoRvMyLogoAdapter.this.abc1003.add(" se");
            }
            int[] iArr2 = LogoRvMyLogoAdapter.this.abc1001;
            if (iArr2 != null) {
                iArr2[4] = 3;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9624b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f15896a;

        /* renamed from: b */
        public final /* synthetic */ LogoMyLogoEntity f15897b;

        public View$OnClickListenerC9624b(int i, LogoMyLogoEntity logoMyLogoEntity) {
            this.f15896a = i;
            this.f15897b = logoMyLogoEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 0;
            if (LogoRvMyLogoAdapter.this.onItemMenuClickListner != null) {
                LogoRvMyLogoAdapter.this.onItemMenuClickListner.mo9174c(this.f15896a, this.f15897b);
                ArrayList<String> arrayList = LogoRvMyLogoAdapter.this.abc1004;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoRvMyLogoAdapter.this.abc1004.remove(0);
                }
                if (LogoRvMyLogoAdapter.this.abc1001 != null) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = LogoRvMyLogoAdapter.this.abc1001;
                        if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                            break;
                        }
                        iArr[i2] = 5;
                        i2++;
                    }
                }
                if (LogoRvMyLogoAdapter.this.abc1001 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = LogoRvMyLogoAdapter.this.abc1001;
                        if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                            break;
                        }
                        iArr2[i3] = 9;
                        i3++;
                    }
                }
                LogoRvMyLogoAdapter logoRvMyLogoAdapter = LogoRvMyLogoAdapter.this;
                logoRvMyLogoAdapter.abc1 = "iew滑动卡顿问题";
                logoRvMyLogoAdapter.abc1002 = !logoRvMyLogoAdapter.abc1002;
                logoRvMyLogoAdapter.abc1002 = true;
                if (logoRvMyLogoAdapter.abc1004.size() < 8) {
                    LogoRvMyLogoAdapter.this.abc1004.add("l. Melvill");
                }
            }
            if (LogoRvMyLogoAdapter.this.abc1001 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr3 = LogoRvMyLogoAdapter.this.abc1001;
                    if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i4] = 5;
                    i4++;
                }
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter2 = LogoRvMyLogoAdapter.this;
            logoRvMyLogoAdapter2.abc1000 = ((double) logoRvMyLogoAdapter2.abc1000) < 0.11671811d ? 0.001411438f : 0.87928915f;
            if (logoRvMyLogoAdapter2.abc1006 == null) {
                logoRvMyLogoAdapter2.abc1006 = new String[10];
            }
            logoRvMyLogoAdapter2.abc2 += 5;
            if (logoRvMyLogoAdapter2.abc1005 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr = LogoRvMyLogoAdapter.this.abc1005;
                    if (i5 >= (strArr.length > 3 ? 3 : strArr.length)) {
                        break;
                    }
                    strArr[i5] = "string" + i5;
                    i5++;
                }
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter3 = LogoRvMyLogoAdapter.this;
            String[] strArr2 = logoRvMyLogoAdapter3.abc1006;
            if (strArr2 != null) {
                strArr2[3] = null;
            }
            if (logoRvMyLogoAdapter3.abc1005 == null) {
                return;
            }
            while (true) {
                String[] strArr3 = LogoRvMyLogoAdapter.this.abc1005;
                if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    return;
                }
                strArr3[i] = "string" + i;
                i++;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9625c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ LogoMyLogoEntity f15899a;

        /* renamed from: b */
        public final /* synthetic */ int f15900b;

        public View$OnClickListenerC9625c(LogoMyLogoEntity logoMyLogoEntity, int i) {
            this.f15899a = logoMyLogoEntity;
            this.f15900b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoRvMyLogoAdapter logoRvMyLogoAdapter;
            LogoMyLogoEntity logoMyLogoEntity;
            LogoRvMyLogoAdapter logoRvMyLogoAdapter2;
            if (LogoRvMyLogoAdapter.this.onItemMenuClickListner != null) {
                if (LogoRvMyLogoAdapter.this.isShowCheckedBox) {
                    this.f15899a.m2186c(!logoMyLogoEntity.m2187b());
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter3 = LogoRvMyLogoAdapter.this;
                    String[] strArr = logoRvMyLogoAdapter3.abc1005;
                    if (strArr != null) {
                        strArr[9] = null;
                    }
                    if (logoRvMyLogoAdapter3.abc1007.size() < 6) {
                        LogoRvMyLogoAdapter.this.abc1007.add("nt is");
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter4 = LogoRvMyLogoAdapter.this;
                    int[] iArr = logoRvMyLogoAdapter4.abc1001;
                    if (iArr != null) {
                        iArr[9] = 8;
                    }
                    if (!TextUtils.isEmpty(logoRvMyLogoAdapter4.abc1)) {
                        int length = LogoRvMyLogoAdapter.this.abc1.length();
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter5 = LogoRvMyLogoAdapter.this;
                        if (logoRvMyLogoAdapter5.abc1007 == null) {
                            logoRvMyLogoAdapter5.abc1007 = new ArrayList<>();
                        }
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter6 = LogoRvMyLogoAdapter.this;
                        if (logoRvMyLogoAdapter6.abc1003 == null) {
                            logoRvMyLogoAdapter6.abc1003 = new ArrayList<>();
                        }
                        ArrayList<String> arrayList = LogoRvMyLogoAdapter.this.abc1004;
                        if (arrayList != null && arrayList.size() > 0) {
                            LogoRvMyLogoAdapter.this.abc1004.remove(0);
                        }
                        LogoRvMyLogoAdapter.this.abc1 = LogoRvMyLogoAdapter.this.abc1 + length;
                        if (LogoRvMyLogoAdapter.this.abc1003.size() > 1) {
                            LogoRvMyLogoAdapter.this.abc1003.add("rl");
                        }
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter7 = LogoRvMyLogoAdapter.this;
                        if (logoRvMyLogoAdapter7.abc1007 == null) {
                            logoRvMyLogoAdapter7.abc1007 = new ArrayList<>();
                        }
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter8 = LogoRvMyLogoAdapter.this;
                        if (logoRvMyLogoAdapter8.abc1006 == null) {
                            logoRvMyLogoAdapter8.abc1006 = new String[10];
                        }
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter9 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter9.abc1004 == null) {
                        logoRvMyLogoAdapter9.abc1004 = new ArrayList<>();
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter10 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter10.abc1004 == null) {
                        logoRvMyLogoAdapter10.abc1004 = new ArrayList<>();
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter11 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter11.abc1005 == null) {
                        logoRvMyLogoAdapter11.abc1005 = new String[10];
                    }
                    logoRvMyLogoAdapter11.notifyItemChanged(this.f15900b);
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter12 = LogoRvMyLogoAdapter.this;
                    logoRvMyLogoAdapter12.abc1000 = ((double) logoRvMyLogoAdapter12.abc1000) > 0.8416436d ? 0.14305031f : 0.40461105f;
                    String[] strArr2 = logoRvMyLogoAdapter12.abc1006;
                    if (strArr2 != null) {
                        strArr2[3] = null;
                    }
                    if (logoRvMyLogoAdapter12.abc1001 != null) {
                        int i = 0;
                        while (true) {
                            int[] iArr2 = LogoRvMyLogoAdapter.this.abc1001;
                            if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                                break;
                            }
                            iArr2[i] = 6;
                            i++;
                        }
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter13 = LogoRvMyLogoAdapter.this;
                    logoRvMyLogoAdapter13.abc2 = Math.abs(logoRvMyLogoAdapter13.abc2);
                    if (LogoRvMyLogoAdapter.this.abc1004.size() > 0) {
                        LogoRvMyLogoAdapter.this.abc1004.add("n, ba");
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter14 = LogoRvMyLogoAdapter.this;
                    String[] strArr3 = logoRvMyLogoAdapter14.abc1005;
                    if (strArr3 != null) {
                        strArr3[4] = " many wa";
                    }
                    if (logoRvMyLogoAdapter14.abc1001 != null) {
                        int i2 = 0;
                        while (true) {
                            int[] iArr3 = LogoRvMyLogoAdapter.this.abc1001;
                            if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                                break;
                            }
                            iArr3[i2] = 4;
                            i2++;
                        }
                    }
                    LogoRvMyLogoAdapter.this.onItemMenuClickListner.mo9176a(this.f15900b, this.f15899a.m2187b());
                    if (LogoRvMyLogoAdapter.this.abc1007.size() > 2) {
                        LogoRvMyLogoAdapter.this.abc1007.add("with it");
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter15 = LogoRvMyLogoAdapter.this;
                    String[] strArr4 = logoRvMyLogoAdapter15.abc1005;
                    if (strArr4 != null) {
                        strArr4[1] = null;
                    }
                    ArrayList<String> arrayList2 = logoRvMyLogoAdapter15.abc1004;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        LogoRvMyLogoAdapter.this.abc1004.remove(0);
                    }
                    int i3 = 0;
                    while (true) {
                        logoRvMyLogoAdapter2 = LogoRvMyLogoAdapter.this;
                        if (i3 >= logoRvMyLogoAdapter2.abc2) {
                            break;
                        }
                        ArrayList<String> arrayList3 = logoRvMyLogoAdapter2.abc0;
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LogoRvMyLogoAdapter.this.abc0.remove(0);
                            if (LogoRvMyLogoAdapter.this.abc1003.size() > 8) {
                                LogoRvMyLogoAdapter.this.abc1003.add("to");
                            }
                            LogoRvMyLogoAdapter logoRvMyLogoAdapter16 = LogoRvMyLogoAdapter.this;
                            if (logoRvMyLogoAdapter16.abc1004 == null) {
                                logoRvMyLogoAdapter16.abc1004 = new ArrayList<>();
                            }
                            LogoRvMyLogoAdapter logoRvMyLogoAdapter17 = LogoRvMyLogoAdapter.this;
                            if (logoRvMyLogoAdapter17.abc1006 == null) {
                                logoRvMyLogoAdapter17.abc1006 = new String[10];
                            }
                        }
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter18 = LogoRvMyLogoAdapter.this;
                        boolean z = !logoRvMyLogoAdapter18.abc1002;
                        logoRvMyLogoAdapter18.abc1002 = z;
                        logoRvMyLogoAdapter18.abc1002 = !z;
                        if (logoRvMyLogoAdapter18.abc1004 == null) {
                            logoRvMyLogoAdapter18.abc1004 = new ArrayList<>();
                        }
                        i3++;
                    }
                    if (logoRvMyLogoAdapter2.abc1003 == null) {
                        logoRvMyLogoAdapter2.abc1003 = new ArrayList<>();
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter19 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter19.abc1004 == null) {
                        logoRvMyLogoAdapter19.abc1004 = new ArrayList<>();
                    }
                    String[] strArr5 = LogoRvMyLogoAdapter.this.abc1005;
                    if (strArr5 != null) {
                        strArr5[7] = "t a";
                    }
                } else {
                    LogoRvMyLogoAdapter.this.onItemMenuClickListner.mo9173d(view, this.f15900b, this.f15899a);
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter20 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter20.abc1007 == null) {
                        logoRvMyLogoAdapter20.abc1007 = new ArrayList<>();
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter21 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter21.abc1005 == null) {
                        logoRvMyLogoAdapter21.abc1005 = new String[10];
                    }
                    String[] strArr6 = logoRvMyLogoAdapter21.abc1005;
                    if (strArr6 != null) {
                        strArr6[4] = "ne,";
                    }
                    if (logoRvMyLogoAdapter21.abc3.size() < 8) {
                        LogoRvMyLogoAdapter.this.abc3.add(6);
                        LogoRvMyLogoAdapter logoRvMyLogoAdapter22 = LogoRvMyLogoAdapter.this;
                        logoRvMyLogoAdapter22.abc1000 = ((double) logoRvMyLogoAdapter22.abc1000) < 0.19685996d ? 0.9389607f : 0.54871285f;
                        String[] strArr7 = logoRvMyLogoAdapter22.abc1006;
                        if (strArr7 != null) {
                            strArr7[6] = null;
                        }
                        logoRvMyLogoAdapter22.abc1002 = !logoRvMyLogoAdapter22.abc1002;
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter23 = LogoRvMyLogoAdapter.this;
                    if (logoRvMyLogoAdapter23.abc1001 == null) {
                        logoRvMyLogoAdapter23.abc1001 = new int[10];
                    }
                    logoRvMyLogoAdapter23.abc1000 = 0.865274f;
                    if (logoRvMyLogoAdapter23.abc1006 != null) {
                        int i4 = 0;
                        while (true) {
                            String[] strArr8 = LogoRvMyLogoAdapter.this.abc1006;
                            if (i4 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                                break;
                            }
                            strArr8[i4] = "string" + i4;
                            i4++;
                        }
                    }
                }
                LogoRvMyLogoAdapter logoRvMyLogoAdapter24 = LogoRvMyLogoAdapter.this;
                logoRvMyLogoAdapter24.abc1002 = !logoRvMyLogoAdapter24.abc1002;
                if (logoRvMyLogoAdapter24.abc1007 == null) {
                    logoRvMyLogoAdapter24.abc1007 = new ArrayList<>();
                }
                LogoRvMyLogoAdapter logoRvMyLogoAdapter25 = LogoRvMyLogoAdapter.this;
                logoRvMyLogoAdapter25.abc1002 = false;
                if (logoRvMyLogoAdapter25.abc2 < 0) {
                    logoRvMyLogoAdapter25.abc2 = 4;
                    if (logoRvMyLogoAdapter25.abc1004 == null) {
                        logoRvMyLogoAdapter25.abc1004 = new ArrayList<>();
                    }
                    LogoRvMyLogoAdapter logoRvMyLogoAdapter26 = LogoRvMyLogoAdapter.this;
                    int[] iArr4 = logoRvMyLogoAdapter26.abc1001;
                    if (iArr4 != null) {
                        iArr4[0] = 5;
                    }
                    if (logoRvMyLogoAdapter26.abc1006 != null) {
                        int i5 = 0;
                        while (true) {
                            String[] strArr9 = LogoRvMyLogoAdapter.this.abc1006;
                            if (i5 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                                break;
                            }
                            strArr9[i5] = "string" + i5;
                            i5++;
                        }
                    }
                }
                if (LogoRvMyLogoAdapter.this.abc1003.size() < 1) {
                    LogoRvMyLogoAdapter.this.abc1003.add(", the insp");
                }
                ArrayList<String> arrayList4 = LogoRvMyLogoAdapter.this.abc1004;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoRvMyLogoAdapter.this.abc1004.remove(0);
                }
                ArrayList<String> arrayList5 = LogoRvMyLogoAdapter.this.abc1007;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    LogoRvMyLogoAdapter.this.abc1007.remove(0);
                }
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter27 = LogoRvMyLogoAdapter.this;
            if (logoRvMyLogoAdapter27.abc1004 == null) {
                logoRvMyLogoAdapter27.abc1004 = new ArrayList<>();
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter28 = LogoRvMyLogoAdapter.this;
            String[] strArr10 = logoRvMyLogoAdapter28.abc1005;
            if (strArr10 != null) {
                strArr10[5] = " ";
            }
            if (logoRvMyLogoAdapter28.abc1003 == null) {
                logoRvMyLogoAdapter28.abc1003 = new ArrayList<>();
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter29 = LogoRvMyLogoAdapter.this;
            if (logoRvMyLogoAdapter29.abc3 == null) {
                logoRvMyLogoAdapter29.abc3 = new ArrayList<>();
                ArrayList<String> arrayList6 = LogoRvMyLogoAdapter.this.abc1003;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    LogoRvMyLogoAdapter.this.abc1003.remove(0);
                }
                LogoRvMyLogoAdapter logoRvMyLogoAdapter30 = LogoRvMyLogoAdapter.this;
                if (logoRvMyLogoAdapter30.abc1004 == null) {
                    logoRvMyLogoAdapter30.abc1004 = new ArrayList<>();
                }
                LogoRvMyLogoAdapter.this.abc1002 = !logoRvMyLogoAdapter.abc1002;
            }
            ArrayList<String> arrayList7 = LogoRvMyLogoAdapter.this.abc1004;
            if (arrayList7 != null && arrayList7.size() > 0) {
                LogoRvMyLogoAdapter.this.abc1004.remove(0);
            }
            LogoRvMyLogoAdapter logoRvMyLogoAdapter31 = LogoRvMyLogoAdapter.this;
            if (logoRvMyLogoAdapter31.abc1003 == null) {
                logoRvMyLogoAdapter31.abc1003 = new ArrayList<>();
            }
            String[] strArr11 = LogoRvMyLogoAdapter.this.abc1006;
            if (strArr11 != null) {
                strArr11[2] = null;
            }
        }
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9626d {
        /* renamed from: a */
        void mo9176a(int i, boolean z);

        /* renamed from: b */
        void mo9175b(int i, LogoMyLogoEntity logoMyLogoEntity);

        /* renamed from: c */
        void mo9174c(int i, LogoMyLogoEntity logoMyLogoEntity);

        /* renamed from: d */
        void mo9173d(View view, int i, LogoMyLogoEntity logoMyLogoEntity);
    }

    /* renamed from: com.logomaster.logomaker.adapter.LogoRvMyLogoAdapter$e */
    /* loaded from: classes3.dex */
    public class C9627e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f15902a;

        /* renamed from: b */
        public ImageView f15903b;

        /* renamed from: c */
        public ImageView f15904c;

        /* renamed from: d */
        public ImageView f15905d;

        /* renamed from: e */
        public TextView f15906e;

        public C9627e(@NonNull View view) {
            super(view);
            this.f15902a = (ImageView) view.findViewById(R.id.iv_logo);
            this.f15903b = (ImageView) view.findViewById(R.id.iv_save);
            this.f15904c = (ImageView) view.findViewById(R.id.iv_delete);
            this.f15905d = (ImageView) view.findViewById(R.id.iv_checked);
            this.f15906e = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public LogoRvMyLogoAdapter(List<LogoMyLogoEntity> list, Context context) {
        this.list = null;
        this.abc1000 = 0.04816991f;
        this.abc1002 = true;
        this.abc1003 = new ArrayList<>();
        this.abc1004 = new ArrayList<>();
        this.abc2 = 9;
        this.abc1007 = new ArrayList<>();
        this.list = list;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        int i = 0;
        this.abc1002 = false;
        String[] strArr = this.abc1005;
        if (strArr != null) {
            strArr[9] = null;
        }
        if (this.abc3.size() > 7) {
            this.abc3.add(2);
            String[] strArr2 = this.abc1005;
            if (strArr2 != null) {
                strArr2[3] = null;
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            ArrayList<String> arrayList = this.abc1004;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1004.remove(0);
            }
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[1] = 0;
        }
        if (this.abc1004.size() < 4) {
            this.abc1004.add("ti");
        }
        this.abc1000 = Math.abs(this.abc1000);
        this.context = context;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1005 != null) {
            while (true) {
                String[] strArr3 = this.abc1005;
                if (i >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i] = "string" + i;
                i++;
            }
        }
        if (this.abc1007.size() > 6) {
            this.abc1007.add("nly until ");
        }
        this.abc2 = this.abc2 >= 6 ? 8 : 2;
        if (this.abc1003.size() < 8) {
            this.abc1003.add(" a");
        }
        if (this.abc1000 < 0.30048168d) {
            this.abc1000 = 0.4333648f;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public List<LogoMyLogoEntity> getList() {
        return this.list;
    }

    public boolean isShowCheckedBox() {
        return this.isShowCheckedBox;
    }

    public void remove(int i) {
        this.list.remove(i);
        if (this.abc1006 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.abc1006;
                if (i2 >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i2] = "string" + i2;
                i2++;
            }
        }
        this.abc1002 = true;
        String[] strArr2 = this.abc1005;
        if (strArr2 != null) {
            strArr2[3] = null;
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1002 = !this.abc1002;
            String[] strArr3 = this.abc1006;
            if (strArr3 != null) {
                strArr3[1] = null;
            }
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
        }
        if (this.abc1003.size() < 2) {
            this.abc1003.add("cho");
        }
        if (this.abc1006 == null) {
            this.abc1006 = new String[10];
        }
        this.abc1000 = 0.38376164f;
        notifyItemRemoved(i);
        if (this.abc1003.size() > 4) {
            this.abc1003.add("ed to 'ge");
        }
        this.abc1000 = 0.9651191f;
        String[] strArr4 = this.abc1006;
        if (strArr4 != null) {
            strArr4[7] = "ntiment ";
        }
        this.abc2 = Math.abs(this.abc2);
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1000 < 0.43325818d) {
            this.abc1000 = 0.8936014f;
        }
        this.abc1002 = false;
        notifyItemRangeRemoved(i, this.list.size() - i);
        String[] strArr5 = this.abc1005;
        if (strArr5 != null) {
            strArr5[0] = null;
        }
        ArrayList<String> arrayList = this.abc1003;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1005 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr6 = this.abc1005;
                if (i3 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                    break;
                }
                strArr6[i3] = "string" + i3;
                i3++;
            }
        }
        this.abc2 = 3;
        ArrayList<String> arrayList2 = this.abc1003;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1000 *= 0.5820113f;
        this.abc1002 = !this.abc1002;
    }

    public void setData(List<LogoMyLogoEntity> list) {
        this.list = list;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (this.abc1003.size() < 5) {
            this.abc1003.add("t it is)");
        }
        ArrayList<String> arrayList = this.abc1007;
        int i = 0;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc1 = "te";
        this.abc1002 = false;
        ArrayList<String> arrayList2 = this.abc1003;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        notifyDataSetChanged();
        if (this.abc1007 == null) {
            this.abc1007 = new ArrayList<>();
        }
        if (this.abc1004.size() > 4) {
            this.abc1004.add("s ");
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[5] = 0;
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            ArrayList<String> arrayList3 = this.abc1007;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc1007.remove(0);
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            int[] iArr2 = this.abc1001;
            if (iArr2 != null) {
                iArr2[2] = 7;
            }
        }
        if (this.abc1003.size() < 1) {
            this.abc1003.add("l");
        }
        ArrayList<String> arrayList4 = this.abc1004;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1005 == null) {
            return;
        }
        while (true) {
            String[] strArr = this.abc1005;
            if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                return;
            }
            strArr[i] = "string" + i;
            i++;
        }
    }

    public void setOnItemMenuClickListner(InterfaceC9626d interfaceC9626d) {
        this.onItemMenuClickListner = interfaceC9626d;
        this.abc1000 += 0.31653064f;
        ArrayList<String> arrayList = this.abc1007;
        int i = 0;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1)) {
            int length = this.abc1.length();
            if (this.abc1006 != null) {
                while (true) {
                    String[] strArr = this.abc1006;
                    if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                        break;
                    }
                    strArr[i] = "string" + i;
                    i++;
                }
            }
            if (this.abc1007.size() > 2) {
                this.abc1007.add("for so ");
            }
            if (this.abc1000 > 0.03330654d) {
                this.abc1000 = 0.24513471f;
            }
            this.abc1 += length;
            float f = ((double) this.abc1000) < 0.6109449d ? 0.379664f : 0.5491994f;
            this.abc1000 = f;
            if (f < 0.87396806d) {
                this.abc1000 = 0.058383644f;
            }
            this.abc1002 = !this.abc1002;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add("ead ");
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
    }

    public void setShowCheckedBox(boolean z) {
        this.isShowCheckedBox = z;
        ArrayList<String> arrayList = this.abc1003;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1005 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.abc1005;
                if (i >= (strArr.length > 3 ? 3 : strArr.length)) {
                    break;
                }
                strArr[i] = "string" + i;
                i++;
            }
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1)) {
            int length = this.abc1.length();
            this.abc1000 = ((double) this.abc1000) < 0.24686724d ? 0.15974134f : 0.7719568f;
            this.abc1002 = true;
            ArrayList<String> arrayList2 = this.abc1003;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1 += length;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc1005 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.abc1005;
                    if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i2] = "string" + i2;
                    i2++;
                }
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        int[] iArr = this.abc1001;
        if (iArr != null) {
            iArr[7] = 0;
        }
        ArrayList<String> arrayList3 = this.abc1004;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1004.remove(0);
        }
        String[] strArr3 = this.abc1005;
        if (strArr3 != null) {
            strArr3[7] = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull C9627e c9627e, int i) {
        ArrayList<String> arrayList = this.abc1007;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1007.remove(0);
        }
        this.abc1000 = 0.92529947f;
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList2 = this.abc3;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc3.remove(0);
            if (this.abc1001 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.abc1001;
                    if (i2 >= (iArr.length > 3 ? 3 : iArr.length)) {
                        break;
                    }
                    iArr[i2] = 7;
                    i2++;
                }
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
        }
        this.abc1002 = false;
        this.abc1000 = ((double) this.abc1000) > 0.57633996d ? 0.16696328f : 0.74115765f;
        String[] strArr = this.abc1005;
        if (strArr != null) {
            strArr[5] = null;
        }
        LogoMyLogoEntity logoMyLogoEntity = this.list.get(i);
        if (this.abc1001 != null) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.abc1001;
                if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i3] = 9;
                i3++;
            }
        }
        this.abc1002 = false;
        this.abc1000 = 0.2335313f;
        ArrayList<String> arrayList3 = this.abc0;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc0.remove(0);
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1000 = ((double) this.abc1000) > 0.7836092d ? 0.6885384f : 0.560662f;
            String[] strArr2 = this.abc1005;
            if (strArr2 != null) {
                strArr2[3] = null;
            }
        }
        this.abc1000 = 0.4551993f;
        String[] strArr3 = this.abc1005;
        if (strArr3 != null) {
            strArr3[5] = null;
        }
        String[] strArr4 = this.abc1006;
        if (strArr4 != null) {
            strArr4[7] = null;
        }
        Glide.m18505t(this.context).m1886q(logoMyLogoEntity.m2188a()).m680f(DiskCacheStrategy.f25412b).m2170p0(c9627e.f15902a);
        int[] iArr3 = this.abc1001;
        if (iArr3 != null) {
            iArr3[4] = 1;
        }
        this.abc1002 = true;
        if (this.abc1004.size() > 8) {
            this.abc1004.add("o");
        }
        this.abc1 = "si";
        ArrayList<String> arrayList4 = this.abc1004;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1004.remove(0);
        }
        this.abc1000 -= 0.3499356f;
        if (this.abc1005 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr5 = this.abc1005;
                if (i4 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i4] = "string" + i4;
                i4++;
            }
        }
        c9627e.f15903b.setOnClickListener(new View$OnClickListenerC9623a(i, logoMyLogoEntity));
        String[] strArr6 = this.abc1006;
        if (strArr6 != null) {
            strArr6[3] = " well on ";
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1003.size() > 9) {
            this.abc1003.add("reat it is");
        }
        if (!TextUtils.isEmpty(this.abc1)) {
            int length = this.abc1.length();
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            int[] iArr4 = this.abc1001;
            if (iArr4 != null) {
                iArr4[8] = 0;
            }
            this.abc1 += length;
            this.abc1002 = true;
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            if (this.abc1004.size() > 8) {
                this.abc1004.add(" man");
            }
        }
        if (this.abc1007.size() > 1) {
            this.abc1007.add("re familia");
        }
        ArrayList<String> arrayList5 = this.abc1004;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1003.size() < 9) {
            this.abc1003.add(", ");
        }
        c9627e.f15904c.setOnClickListener(new View$OnClickListenerC9624b(i, logoMyLogoEntity));
        if (this.abc1006 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr7 = this.abc1006;
                if (i5 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                    break;
                }
                strArr7[i5] = "string" + i5;
                i5++;
            }
        }
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc1000 = -this.abc1000;
        this.abc2 += 3;
        if (this.abc1005 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.abc1005;
                if (i6 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                    break;
                }
                strArr8[i6] = "string" + i6;
                i6++;
            }
        }
        ArrayList<String> arrayList6 = this.abc1003;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1004.size() > 7) {
            this.abc1004.add("entimen");
        }
        c9627e.f15902a.setOnClickListener(new View$OnClickListenerC9625c(logoMyLogoEntity, i));
        if (this.abc1004 == null) {
            this.abc1004 = new ArrayList<>();
        }
        this.abc1000 = 0.96945703f;
        this.abc1 = "or(";
        if (this.abc1007.size() > 8) {
            this.abc1007.add(" a mod");
        }
        if (this.abc1005 != null) {
            int i7 = 0;
            while (true) {
                String[] strArr9 = this.abc1005;
                if (i7 >= (strArr9.length > 3 ? 3 : strArr9.length)) {
                    break;
                }
                strArr9[i7] = "string" + i7;
                i7++;
            }
        }
        if (this.abc1006 == null) {
            this.abc1006 = new String[10];
        }
        if (this.isShowCheckedBox) {
            c9627e.f15903b.setVisibility(8);
            if (this.abc1006 == null) {
                this.abc1006 = new String[10];
            }
            int[] iArr5 = this.abc1001;
            if (iArr5 != null) {
                iArr5[4] = 0;
            }
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            if (this.abc0 == null) {
                this.abc0 = new ArrayList<>();
                float f = ((double) this.abc1000) > 0.0081471205d ? 0.9908021f : 0.026763499f;
                this.abc1000 = f;
                String[] strArr10 = this.abc1006;
                if (strArr10 != null) {
                    strArr10[5] = " year";
                }
                this.abc1000 = Math.abs(f);
            }
            boolean z = !this.abc1002;
            this.abc1002 = z;
            String[] strArr11 = this.abc1005;
            if (strArr11 != null) {
                strArr11[0] = null;
            }
            this.abc1002 = !z;
            c9627e.f15904c.setVisibility(8);
            if (this.abc1007.size() < 3) {
                this.abc1007.add("ind of");
            }
            ArrayList<String> arrayList7 = this.abc1007;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1007.remove(0);
            }
            ArrayList<String> arrayList8 = this.abc1004;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc1004.remove(0);
            }
            ArrayList<Integer> arrayList9 = this.abc3;
            if (arrayList9 == null && arrayList9.size() > 0) {
                this.abc3.remove(0);
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                String[] strArr12 = this.abc1005;
                if (strArr12 != null) {
                    strArr12[4] = null;
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new int[10];
                }
            }
            int[] iArr6 = this.abc1001;
            if (iArr6 != null) {
                iArr6[9] = 4;
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            int[] iArr7 = this.abc1001;
            if (iArr7 != null) {
                iArr7[6] = 8;
            }
            c9627e.f15905d.setVisibility(0);
            int[] iArr8 = this.abc1001;
            if (iArr8 != null) {
                iArr8[8] = 0;
            }
            if (this.abc1005 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr13 = this.abc1005;
                    if (i8 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i8] = "string" + i8;
                    i8++;
                }
            }
            int[] iArr9 = this.abc1001;
            if (iArr9 != null) {
                iArr9[4] = 0;
            }
            if (this.abc3 == null) {
                this.abc3 = new ArrayList<>();
                this.abc1000 = ((double) this.abc1000) > 0.79455227d ? 0.5205661f : 0.5095013f;
                if (this.abc1004 == null) {
                    this.abc1004 = new ArrayList<>();
                }
                String[] strArr14 = this.abc1006;
                if (strArr14 != null) {
                    strArr14[6] = "oder";
                }
            }
            this.abc1000 = 0.5291926f;
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            this.abc1002 = !this.abc1002;
            if (logoMyLogoEntity.m2187b()) {
                c9627e.f15905d.setImageResource(R.mipmap.s_selectall);
                String[] strArr15 = this.abc1005;
                if (strArr15 != null) {
                    strArr15[0] = null;
                }
                if (strArr15 != null) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr16 = this.abc1005;
                        if (i9 >= (strArr16.length > 3 ? 3 : strArr16.length)) {
                            break;
                        }
                        strArr16[i9] = "string" + i9;
                        i9++;
                    }
                }
                String[] strArr17 = this.abc1005;
                if (strArr17 != null) {
                    strArr17[1] = null;
                }
                this.abc1 = "绪的来源";
                if (this.abc1003.size() > 0) {
                    this.abc1003.add("’s mode");
                }
                if (this.abc1006 == null) {
                    this.abc1006 = new String[10];
                }
                this.abc1002 = true;
            } else {
                c9627e.f15905d.setImageResource(R.mipmap.s_unselectall);
                int[] iArr10 = this.abc1001;
                if (iArr10 != null) {
                    iArr10[6] = 1;
                }
                String[] strArr18 = this.abc1006;
                if (strArr18 != null) {
                    strArr18[0] = "hat";
                }
                if (iArr10 != null) {
                    iArr10[7] = 9;
                }
                this.abc1 = "ve";
                this.abc1000 = Math.abs(this.abc1000);
                int[] iArr11 = this.abc1001;
                if (iArr11 != null) {
                    iArr11[9] = 0;
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
            }
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            ArrayList<String> arrayList10 = this.abc1003;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1000 = ((double) this.abc1000) < 0.31864107d ? 0.54528457f : 0.14897555f;
            if (this.abc3.size() > 4) {
                this.abc3.add(0);
                ArrayList<String> arrayList11 = this.abc1003;
                if (arrayList11 != null && arrayList11.size() > 0) {
                    this.abc1003.remove(0);
                }
                String[] strArr19 = this.abc1005;
                if (strArr19 != null) {
                    strArr19[3] = null;
                }
                this.abc1002 = false;
            }
            ArrayList<String> arrayList12 = this.abc1004;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc1004.remove(0);
            }
            int[] iArr12 = this.abc1001;
            if (iArr12 != null) {
                iArr12[3] = 2;
            }
            String[] strArr20 = this.abc1006;
            if (strArr20 != null) {
                strArr20[3] = null;
            }
        } else {
            c9627e.f15903b.setVisibility(0);
            if (this.abc1006 == null) {
                this.abc1006 = new String[10];
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            if (this.abc1007 == null) {
                this.abc1007 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList13 = this.abc3;
            if (arrayList13 == null && arrayList13.size() > 0) {
                this.abc3.remove(0);
                ArrayList<String> arrayList14 = this.abc1003;
                if (arrayList14 != null && arrayList14.size() > 0) {
                    this.abc1003.remove(0);
                }
                this.abc1002 = !this.abc1002;
                this.abc1000 = 0.4015743f;
            }
            if (this.abc1004.size() > 2) {
                this.abc1004.add("think. Fo");
            }
            if (this.abc1001 != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr13 = this.abc1001;
                    if (i10 >= (iArr13.length > 3 ? 3 : iArr13.length)) {
                        break;
                    }
                    iArr13[i10] = 7;
                    i10++;
                }
            }
            if (this.abc1001 == null) {
                this.abc1001 = new int[10];
            }
            c9627e.f15904c.setVisibility(0);
            if (this.abc1004 == null) {
                this.abc1004 = new ArrayList<>();
            }
            this.abc1000 = 0.9455156f;
            if (this.abc1003.size() < 1) {
                this.abc1003.add("ades befo");
            }
            this.abc1 = "rne";
            this.abc1000 = 0.80154556f;
            String[] strArr21 = this.abc1005;
            if (strArr21 != null) {
                strArr21[3] = null;
            }
            String[] strArr22 = this.abc1006;
            if (strArr22 != null) {
                strArr22[0] = null;
            }
            c9627e.f15905d.setVisibility(8);
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
            if (this.abc1001 != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr14 = this.abc1001;
                    if (i11 >= (iArr14.length > 3 ? 3 : iArr14.length)) {
                        break;
                    }
                    iArr14[i11] = 3;
                    i11++;
                }
            }
            String[] strArr23 = this.abc1005;
            if (strArr23 != null) {
                strArr23[9] = "ary ";
            }
            if (!TextUtils.isEmpty(this.abc1)) {
                int length2 = this.abc1.length();
                if (this.abc1007 == null) {
                    this.abc1007 = new ArrayList<>();
                }
                this.abc1002 = false;
                this.abc1000 = -this.abc1000;
                this.abc1 += length2;
                ArrayList<String> arrayList15 = this.abc1003;
                if (arrayList15 != null && arrayList15.size() > 0) {
                    this.abc1003.remove(0);
                }
                ArrayList<String> arrayList16 = this.abc1003;
                if (arrayList16 != null && arrayList16.size() > 0) {
                    this.abc1003.remove(0);
                }
                if (this.abc1005 != null) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr24 = this.abc1005;
                        if (i12 >= (strArr24.length > 3 ? 3 : strArr24.length)) {
                            break;
                        }
                        strArr24[i12] = "string" + i12;
                        i12++;
                    }
                }
            }
            String[] strArr25 = this.abc1005;
            if (strArr25 != null) {
                strArr25[5] = null;
            }
            if (strArr25 != null) {
                int i13 = 0;
                while (true) {
                    String[] strArr26 = this.abc1005;
                    if (i13 >= (strArr26.length > 3 ? 3 : strArr26.length)) {
                        break;
                    }
                    strArr26[i13] = "string" + i13;
                    i13++;
                }
            }
            this.abc1002 = !this.abc1002;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new int[10];
        }
        ArrayList<String> arrayList17 = this.abc1004;
        if (arrayList17 != null && arrayList17.size() > 0) {
            this.abc1004.remove(0);
        }
        if (this.abc1003.size() < 3) {
            this.abc1003.add(" is)");
        }
        ArrayList<String> arrayList18 = this.abc0;
        if (arrayList18 != null && arrayList18.size() > 0) {
            this.abc0.remove(0);
            this.abc1000 = 0.46556258f;
            if (this.abc1001 != null) {
                int i14 = 0;
                while (true) {
                    int[] iArr15 = this.abc1001;
                    if (i14 >= (iArr15.length > 3 ? 3 : iArr15.length)) {
                        break;
                    }
                    iArr15[i14] = 0;
                    i14++;
                }
            }
            ArrayList<String> arrayList19 = this.abc1004;
            if (arrayList19 != null && arrayList19.size() > 0) {
                this.abc1004.remove(0);
            }
        }
        String[] strArr27 = this.abc1005;
        if (strArr27 != null) {
            strArr27[9] = null;
        }
        if (this.abc1007.size() > 8) {
            this.abc1007.add("y st");
        }
        String[] strArr28 = this.abc1006;
        if (strArr28 != null) {
            strArr28[8] = "dernity i";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public C9627e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C9627e(LayoutInflater.from(this.context).inflate(R.layout.item_rv_my_logo, viewGroup, false));
    }
}
