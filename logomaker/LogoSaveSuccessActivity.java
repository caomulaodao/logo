package com.logomaster.logomaker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.logomaster.logomaker.databinding.ActivityLogoSaveSuccessBinding;
import com.mbridge.msdk.foundation.p162db.CampaignClickDao;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoSaveSuccessActivity extends LogoBaseActivity {
    private ActivityLogoSaveSuccessBinding binding;
    private LogoRateUsDialog logoRateUsDialog;
    private LogoShowBigImageDialog logoShowBigImageDialog;
    private Uri uri;
    public double abc1000 = 0.20269932348636366d;
    public String[] abc0 = new String[14];
    public ArrayList<String> abc1001 = new ArrayList<>();
    public String abc1002 = CampaignClickDao.f17477a;
    public double abc1 = 0.9230620917590824d;
    public float abc1003 = 0.32246608f;
    public float abc1004 = 0.59087914f;
    public ArrayList<String> abc2 = new ArrayList<>();
    public float abc1005 = 0.9022814f;
    public boolean abc1006 = true;
    public ArrayList<Integer> abc3 = new ArrayList<>();
    public int abc1007 = 2;

    /* renamed from: com.logomaster.logomaker.LogoSaveSuccessActivity$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9581a implements View.OnClickListener {
        public View$OnClickListenerC9581a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoSaveSuccessActivity.this.onBackPressed();
            LogoSaveSuccessActivity logoSaveSuccessActivity = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity.abc1002 = " that ";
            logoSaveSuccessActivity.abc1006 = false;
            if (logoSaveSuccessActivity.abc1003 > 0.24230069d) {
                logoSaveSuccessActivity.abc1003 = 0.11407548f;
            }
            if (logoSaveSuccessActivity.abc3 == null) {
                logoSaveSuccessActivity.abc3 = new ArrayList<>();
                if (!TextUtils.isEmpty(LogoSaveSuccessActivity.this.abc1002)) {
                    int length = LogoSaveSuccessActivity.this.abc1002.length();
                    LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length;
                }
                LogoSaveSuccessActivity logoSaveSuccessActivity2 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity2.abc1000 = logoSaveSuccessActivity2.abc1000 > 0.6390934585222713d ? 0.2620829200032101d : 0.9899454737231844d;
                logoSaveSuccessActivity2.abc1002 = "bly m";
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity3 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity3.abc1003 *= 0.5563174f;
            logoSaveSuccessActivity3.abc1000 = logoSaveSuccessActivity3.abc1000 < 0.5472746634164726d ? 0.2900472090236288d : 0.6663350200990283d;
            logoSaveSuccessActivity3.abc1000 = 0.2260600827771282d;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoSaveSuccessActivity$b */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9582b implements View.OnClickListener {
        public View$OnClickListenerC9582b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoApplication.m9240l().m9241k();
            LogoSaveSuccessActivity logoSaveSuccessActivity = LogoSaveSuccessActivity.this;
            if (logoSaveSuccessActivity.abc1004 < 0.52827364d) {
                logoSaveSuccessActivity.abc1004 = 0.98906344f;
            }
            float f = logoSaveSuccessActivity.abc1005 - 0.39577872f;
            logoSaveSuccessActivity.abc1005 = f;
            logoSaveSuccessActivity.abc1003 *= 0.77124184f;
            String[] strArr = logoSaveSuccessActivity.abc0;
            if (strArr != null) {
                strArr[7] = "rEffect 类";
                logoSaveSuccessActivity.abc1007 -= 2;
                logoSaveSuccessActivity.abc1003 = 0.122032285f;
                logoSaveSuccessActivity.abc1004 = -logoSaveSuccessActivity.abc1004;
            }
            logoSaveSuccessActivity.abc1000 = 0.879628133402908d;
            if (f > 0.33048964d) {
                logoSaveSuccessActivity.abc1005 = 0.73238665f;
            }
            ArrayList<String> arrayList = logoSaveSuccessActivity.abc1001;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            LogoSaveSuccessActivity.this.abc1001.remove(0);
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoSaveSuccessActivity$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9583c implements View.OnClickListener {
        public View$OnClickListenerC9583c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LogoSaveSuccessActivity.this, LogoCreateActivity.class);
            LogoSaveSuccessActivity logoSaveSuccessActivity = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity.abc1005 = 0.3124981f;
            ArrayList<String> arrayList = logoSaveSuccessActivity.abc1001;
            if (arrayList != null && arrayList.size() > 0) {
                LogoSaveSuccessActivity.this.abc1001.remove(0);
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity2 = LogoSaveSuccessActivity.this;
            boolean z = !logoSaveSuccessActivity2.abc1006;
            logoSaveSuccessActivity2.abc1006 = z;
            logoSaveSuccessActivity2.abc1 = logoSaveSuccessActivity2.abc1 < 0.8580700006635149d ? 0.5117786769369059d : 0.03614246323611037d;
            logoSaveSuccessActivity2.abc1005 -= 0.9263328f;
            logoSaveSuccessActivity2.abc1006 = !z;
            logoSaveSuccessActivity2.abc1007 = 6;
            logoSaveSuccessActivity2.startActivity(intent);
            LogoSaveSuccessActivity logoSaveSuccessActivity3 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity3.abc1000 = 0.854035881558644d;
            logoSaveSuccessActivity3.abc1004 = -logoSaveSuccessActivity3.abc1004;
            logoSaveSuccessActivity3.abc1007 = 9;
            if (logoSaveSuccessActivity3.abc3 == null) {
                logoSaveSuccessActivity3.abc3 = new ArrayList<>();
                ArrayList<String> arrayList2 = LogoSaveSuccessActivity.this.abc1001;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoSaveSuccessActivity.this.abc1001.remove(0);
                }
                LogoSaveSuccessActivity logoSaveSuccessActivity4 = LogoSaveSuccessActivity.this;
                if (logoSaveSuccessActivity4.abc1004 > 0.31718087d) {
                    logoSaveSuccessActivity4.abc1004 = 0.07585645f;
                }
                logoSaveSuccessActivity4.abc1006 = !logoSaveSuccessActivity4.abc1006;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity5 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity5.abc1007++;
            logoSaveSuccessActivity5.abc1000 = 0.3880928815780669d;
            logoSaveSuccessActivity5.abc1003 *= 0.541315f;
            logoSaveSuccessActivity5.finish();
            if (!TextUtils.isEmpty(LogoSaveSuccessActivity.this.abc1002)) {
                int length = LogoSaveSuccessActivity.this.abc1002.length();
                LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity6 = LogoSaveSuccessActivity.this;
            if (logoSaveSuccessActivity6.abc1001 == null) {
                logoSaveSuccessActivity6.abc1001 = new ArrayList<>();
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity7 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity7.abc1006 = false;
            ArrayList<Integer> arrayList3 = logoSaveSuccessActivity7.abc3;
            if (arrayList3 == null && arrayList3.size() > 0) {
                LogoSaveSuccessActivity.this.abc3.remove(0);
                LogoSaveSuccessActivity logoSaveSuccessActivity8 = LogoSaveSuccessActivity.this;
                if (logoSaveSuccessActivity8.abc1003 < 0.42388207d) {
                    logoSaveSuccessActivity8.abc1003 = 0.7981106f;
                }
                logoSaveSuccessActivity8.abc1004 += 0.64582527f;
                if (logoSaveSuccessActivity8.abc1003 > 0.95827854d) {
                    logoSaveSuccessActivity8.abc1003 = 0.75182664f;
                }
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity9 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity9.abc1005 *= 0.848994f;
            logoSaveSuccessActivity9.abc1007 = 0;
            logoSaveSuccessActivity9.abc1006 = false;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoSaveSuccessActivity$d */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9584d implements View.OnClickListener {
        public View$OnClickListenerC9584d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogoSaveSuccessActivity logoSaveSuccessActivity;
            LogoSaveSuccessActivity logoSaveSuccessActivity2;
            Intent intent = new Intent();
            LogoSaveSuccessActivity logoSaveSuccessActivity3 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity3.abc1006 = !logoSaveSuccessActivity3.abc1006;
            logoSaveSuccessActivity3.abc1007 = 4;
            if (logoSaveSuccessActivity3.abc1001.size() > 2) {
                LogoSaveSuccessActivity.this.abc1001.add("only unt");
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity4 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity4.abc1 *= 0.9953098029534838d;
            logoSaveSuccessActivity4.abc1002 = "eived well";
            double d = logoSaveSuccessActivity4.abc1000 * 0.6955538798088441d;
            logoSaveSuccessActivity4.abc1000 = d;
            logoSaveSuccessActivity4.abc1000 = d < 0.9988147297032307d ? 0.09269256401655168d : 0.8517367409060818d;
            intent.setAction("android.intent.action.SEND");
            LogoSaveSuccessActivity logoSaveSuccessActivity5 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity5.abc1005 += 0.9227865f;
            if (!TextUtils.isEmpty(logoSaveSuccessActivity5.abc1002)) {
                int length = LogoSaveSuccessActivity.this.abc1002.length();
                LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity6 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity6.abc1007 = 0;
            if (logoSaveSuccessActivity6.abc3 == null) {
                logoSaveSuccessActivity6.abc3 = new ArrayList<>();
                LogoSaveSuccessActivity logoSaveSuccessActivity7 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity7.abc1005 = 0.8629119f;
                logoSaveSuccessActivity7.abc1005 = -0.8629119f;
                if (logoSaveSuccessActivity7.abc1001 == null) {
                    logoSaveSuccessActivity7.abc1001 = new ArrayList<>();
                }
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity8 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity8.abc1003 = 0.05102855f;
            if (logoSaveSuccessActivity8.abc1001.size() < 4) {
                LogoSaveSuccessActivity.this.abc1001.add(" t");
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity9 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity9.abc1004 = ((double) logoSaveSuccessActivity9.abc1004) > 0.85082716d ? 0.5134679f : 0.94810766f;
            intent.setType("image/*");
            LogoSaveSuccessActivity logoSaveSuccessActivity10 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity10.abc1004 = 0.52193123f;
            logoSaveSuccessActivity10.abc1005 = Math.abs(logoSaveSuccessActivity10.abc1005);
            LogoSaveSuccessActivity logoSaveSuccessActivity11 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity11.abc1003 = ((double) logoSaveSuccessActivity11.abc1003) > 0.6940803d ? 0.010682762f : 0.3799718f;
            if (logoSaveSuccessActivity11.abc3 == null) {
                logoSaveSuccessActivity11.abc3 = new ArrayList<>();
                LogoSaveSuccessActivity logoSaveSuccessActivity12 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity12.abc1002 = " ";
                if (logoSaveSuccessActivity12.abc1000 < 0.7353498662913187d) {
                    logoSaveSuccessActivity12.abc1000 = 0.8034859406057582d;
                }
                if (logoSaveSuccessActivity12.abc1000 < 0.809124048643458d) {
                    logoSaveSuccessActivity12.abc1000 = 0.7794226769225379d;
                }
            }
            int i = 0;
            while (true) {
                logoSaveSuccessActivity = LogoSaveSuccessActivity.this;
                int i2 = logoSaveSuccessActivity.abc1007;
                if (i2 > 3) {
                    i2 = 3;
                }
                if (i >= i2) {
                    break;
                }
                logoSaveSuccessActivity.abc1000 = 0.5326706356910752d;
                i++;
            }
            logoSaveSuccessActivity.abc1000 = 0.018854552316776463d;
            logoSaveSuccessActivity.abc1004 = ((double) logoSaveSuccessActivity.abc1004) < 0.005576074d ? 0.73609537f : 0.036974013f;
            intent.putExtra("android.intent.extra.STREAM", logoSaveSuccessActivity.uri);
            LogoSaveSuccessActivity.this.abc1002 = "eca";
            int i3 = 0;
            while (true) {
                logoSaveSuccessActivity2 = LogoSaveSuccessActivity.this;
                int i4 = logoSaveSuccessActivity2.abc1007;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                logoSaveSuccessActivity2.abc1000 -= 0.22992813198489637d;
                i3++;
            }
            logoSaveSuccessActivity2.abc1004 = 0.9142234f;
            if (logoSaveSuccessActivity2.abc2.size() > 0) {
                LogoSaveSuccessActivity.this.abc2.add("悉进");
                LogoSaveSuccessActivity logoSaveSuccessActivity13 = LogoSaveSuccessActivity.this;
                if (logoSaveSuccessActivity13.abc1005 > 0.38011742d) {
                    logoSaveSuccessActivity13.abc1005 = 0.4290911f;
                }
                ArrayList<String> arrayList = logoSaveSuccessActivity13.abc1001;
                if (arrayList != null && arrayList.size() > 0) {
                    LogoSaveSuccessActivity.this.abc1001.remove(0);
                }
                LogoSaveSuccessActivity logoSaveSuccessActivity14 = LogoSaveSuccessActivity.this;
                if (logoSaveSuccessActivity14.abc1005 < 0.11698824d) {
                    logoSaveSuccessActivity14.abc1005 = 0.14431882f;
                }
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity15 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity15.abc1003 += 0.45923996f;
            logoSaveSuccessActivity15.abc1007 *= 1;
            ArrayList<String> arrayList2 = logoSaveSuccessActivity15.abc1001;
            if (arrayList2 != null && arrayList2.size() > 0) {
                LogoSaveSuccessActivity.this.abc1001.remove(0);
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity16 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity16.startActivity(Intent.createChooser(intent, logoSaveSuccessActivity16.getString(R.string.share_app_title)));
            LogoSaveSuccessActivity logoSaveSuccessActivity17 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity17.abc1004 = 0.39439458f;
            logoSaveSuccessActivity17.abc1004 = Math.abs(0.39439458f);
            LogoSaveSuccessActivity logoSaveSuccessActivity18 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity18.abc1006 = !logoSaveSuccessActivity18.abc1006;
            if (logoSaveSuccessActivity18.abc0 == null) {
                logoSaveSuccessActivity18.abc0 = new String[10];
                logoSaveSuccessActivity18.abc1006 = false;
                if (!TextUtils.isEmpty(logoSaveSuccessActivity18.abc1002)) {
                    int length2 = LogoSaveSuccessActivity.this.abc1002.length();
                    LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length2;
                }
                LogoSaveSuccessActivity.this.abc1004 *= 0.52625644f;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity19 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity19.abc1006 = true;
            logoSaveSuccessActivity19.abc1004 = 0.23265874f;
            logoSaveSuccessActivity19.abc1005 = 0.15574676f;
        }
    }

    /* renamed from: com.logomaster.logomaker.LogoSaveSuccessActivity$e */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC9585e implements View.OnClickListener {
        public View$OnClickListenerC9585e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LogoSaveSuccessActivity.this.logoShowBigImageDialog == null) {
                LogoSaveSuccessActivity.this.logoShowBigImageDialog = new LogoShowBigImageDialog(LogoSaveSuccessActivity.this);
                LogoSaveSuccessActivity logoSaveSuccessActivity = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity.abc1006 = true;
                logoSaveSuccessActivity.abc1000 += 0.9869825328252094d;
                if (!TextUtils.isEmpty(logoSaveSuccessActivity.abc1002)) {
                    int length = LogoSaveSuccessActivity.this.abc1002.length();
                    LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length;
                }
                ArrayList<Integer> arrayList = LogoSaveSuccessActivity.this.abc3;
                if (arrayList == null && arrayList.size() > 0) {
                    LogoSaveSuccessActivity.this.abc3.remove(0);
                    LogoSaveSuccessActivity logoSaveSuccessActivity2 = LogoSaveSuccessActivity.this;
                    if (logoSaveSuccessActivity2.abc1001 == null) {
                        logoSaveSuccessActivity2.abc1001 = new ArrayList<>();
                    }
                    LogoSaveSuccessActivity logoSaveSuccessActivity3 = LogoSaveSuccessActivity.this;
                    logoSaveSuccessActivity3.abc1004 = 0.8029442f;
                    logoSaveSuccessActivity3.abc1006 = true;
                }
                LogoSaveSuccessActivity logoSaveSuccessActivity4 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity4.abc1005 *= 0.43376493f;
                logoSaveSuccessActivity4.abc1002 = "vels. You’";
                logoSaveSuccessActivity4.abc1006 = !logoSaveSuccessActivity4.abc1006;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity5 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity5.abc1007 += 9;
            if (!TextUtils.isEmpty(logoSaveSuccessActivity5.abc1002)) {
                int length2 = LogoSaveSuccessActivity.this.abc1002.length();
                LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length2;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity6 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity6.abc1007 *= 3;
            if (logoSaveSuccessActivity6.abc2.size() > 9) {
                LogoSaveSuccessActivity.this.abc2.add("oid");
                ArrayList<String> arrayList2 = LogoSaveSuccessActivity.this.abc1001;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    LogoSaveSuccessActivity.this.abc1001.remove(0);
                }
                LogoSaveSuccessActivity logoSaveSuccessActivity7 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity7.abc1002 = "oo";
                logoSaveSuccessActivity7.abc1000 = logoSaveSuccessActivity7.abc1000 < 0.5637656216818608d ? 0.6053264831042057d : 0.3835348572804709d;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity8 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity8.abc1006 = false;
            logoSaveSuccessActivity8.abc1003 -= 0.6664089f;
            logoSaveSuccessActivity8.abc1004 = 0.81422144f;
            logoSaveSuccessActivity8.logoShowBigImageDialog.m9131d(LogoSaveSuccessActivity.this.uri);
            LogoSaveSuccessActivity logoSaveSuccessActivity9 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity9.abc1000 = 0.10016717733051039d;
            if (!TextUtils.isEmpty(logoSaveSuccessActivity9.abc1002)) {
                int length3 = LogoSaveSuccessActivity.this.abc1002.length();
                LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length3;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity10 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity10.abc1002 = "t ";
            ArrayList<String> arrayList3 = logoSaveSuccessActivity10.abc2;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoSaveSuccessActivity.this.abc2.remove(0);
                LogoSaveSuccessActivity logoSaveSuccessActivity11 = LogoSaveSuccessActivity.this;
                boolean z = !logoSaveSuccessActivity11.abc1006;
                logoSaveSuccessActivity11.abc1006 = z;
                logoSaveSuccessActivity11.abc1006 = !z;
                logoSaveSuccessActivity11.abc1005 = 0.72009945f;
            }
            if (!TextUtils.isEmpty(LogoSaveSuccessActivity.this.abc1002)) {
                int length4 = LogoSaveSuccessActivity.this.abc1002.length();
                LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length4;
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity12 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity12.abc1007 = logoSaveSuccessActivity12.abc1007 < 0 ? 5 : 4;
            logoSaveSuccessActivity12.abc1002 = "ys";
            logoSaveSuccessActivity12.logoShowBigImageDialog.show();
            LogoSaveSuccessActivity logoSaveSuccessActivity13 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity13.abc1000 = 0.8374120445194402d;
            logoSaveSuccessActivity13.abc1002 = "u’re pro";
            logoSaveSuccessActivity13.abc1002 = "ive se";
            if (logoSaveSuccessActivity13.abc3 == null) {
                logoSaveSuccessActivity13.abc3 = new ArrayList<>();
                LogoSaveSuccessActivity logoSaveSuccessActivity14 = LogoSaveSuccessActivity.this;
                logoSaveSuccessActivity14.abc1007 = 2;
                if (!TextUtils.isEmpty(logoSaveSuccessActivity14.abc1002)) {
                    int length5 = LogoSaveSuccessActivity.this.abc1002.length();
                    LogoSaveSuccessActivity.this.abc1002 = LogoSaveSuccessActivity.this.abc1002 + length5;
                }
                LogoSaveSuccessActivity.this.abc1000 += 0.20814992120756282d;
            }
            ArrayList<String> arrayList4 = LogoSaveSuccessActivity.this.abc1001;
            if (arrayList4 != null && arrayList4.size() > 0) {
                LogoSaveSuccessActivity.this.abc1001.remove(0);
            }
            LogoSaveSuccessActivity logoSaveSuccessActivity15 = LogoSaveSuccessActivity.this;
            logoSaveSuccessActivity15.abc1006 = !logoSaveSuccessActivity15.abc1006;
            logoSaveSuccessActivity15.abc1000 = 0.9350207566117928d;
        }
    }

    private void init() {
        this.uri = (Uri) getIntent().getParcelableExtra("logo");
        this.abc1003 = ((double) this.abc1003) > 0.9563536d ? 0.55790067f : 0.21414322f;
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        int i = 0;
        while (true) {
            int i2 = this.abc1007;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.abc1004 = 0.64306f;
            i++;
        }
        String[] strArr = this.abc0;
        if (strArr != null) {
            strArr[8] = null;
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            Math.abs(this.abc1003);
            this.abc1003 = 0.24895215f;
        }
        this.abc1005 = ((double) this.abc1005) < 0.8427401d ? 0.7468833f : 0.6131809f;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1002 = " fa";
        Glide.m18503v(this).m1887p(this.uri).m2170p0(this.binding.ivContent);
        float f = ((double) this.abc1005) < 0.28700566d ? 0.882889f : 0.88174707f;
        this.abc1005 = f;
        if (this.abc1000 > 0.27362430352556355d) {
            this.abc1000 = 0.3013964536861521d;
        }
        this.abc1000 -= 0.03577674558437838d;
        if (this.abc0 == null) {
            this.abc0 = new String[10];
            this.abc1005 = f - 0.26706576f;
            this.abc1007 = this.abc1007 > 3 ? 8 : 6;
            this.abc1006 = !this.abc1006;
        }
        this.abc1007 = 4;
        this.abc1006 = !this.abc1006;
        this.binding.rlBack.setOnClickListener(new View$OnClickListenerC9581a());
        this.abc1002 = "ok decad";
        this.abc1000 += 0.9458280562443215d;
        if (!TextUtils.isEmpty("ok decad")) {
            this.abc1002 += this.abc1002.length();
        }
        String[] strArr2 = this.abc0;
        if (strArr2 != null) {
            strArr2[7] = null;
            this.abc1005 = 0.9711065f;
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            this.abc1003 = Math.abs(this.abc1003);
        }
        this.abc1005 = 0.80995953f;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1003 = Math.abs(this.abc1003);
        this.binding.rlSelectItem.setOnClickListener(new View$OnClickListenerC9582b());
        this.abc1006 = !this.abc1006;
        this.abc1003 = 0.346681f;
        if (this.abc1004 < 0.7575038d) {
            this.abc1004 = 0.13289613f;
        }
        this.abc1 = this.abc1 > 0.09997881263121122d ? 0.14072851178940293d : 0.663752562653916d;
        this.abc1005 -= 0.8240021f;
        if (this.abc1001.size() < 7) {
            this.abc1001.add(" that in");
        }
        this.abc1005 = 0.07127255f;
        this.binding.tvMakeNew.setOnClickListener(new View$OnClickListenerC9583c());
        this.abc1000 = this.abc1000 > 0.6544126355420286d ? 0.5436146665013211d : 0.46521998203683146d;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1000 = this.abc1000 < 0.31793777913172483d ? 0.1354784903110029d : 0.26418562474047924d;
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            if (this.abc1000 < 0.5592175234721497d) {
                this.abc1000 = 0.6627409333912427d;
            }
            int i3 = 0;
            while (true) {
                int i4 = this.abc1007;
                if (i4 > 3) {
                    i4 = 3;
                }
                if (i3 >= i4) {
                    break;
                }
                if (!TextUtils.isEmpty(this.abc1002)) {
                    this.abc1002 += this.abc1002.length();
                }
                i3++;
            }
            this.abc1000 = Math.abs(this.abc1000);
        }
        this.abc1006 = false;
        if (this.abc1004 < 0.23454815d) {
            this.abc1004 = 0.83954275f;
        }
        int i5 = 0;
        while (true) {
            int i6 = this.abc1007;
            if (i6 > 3) {
                i6 = 3;
            }
            if (i5 >= i6) {
                break;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            i5++;
        }
        this.binding.ivShare.setOnClickListener(new View$OnClickListenerC9584d());
        this.abc1004 = 0.343127f;
        this.abc1006 = !this.abc1006;
        this.abc1007 = 0;
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            this.abc1006 = false;
            if (this.abc1003 > 0.5255052d) {
                this.abc1003 = 0.6786198f;
            }
        }
        this.abc1000 = 0.4066804805077623d;
        this.abc1007 = 5;
        this.abc1005 = 0.707642f;
        this.binding.ivContent.setOnClickListener(new View$OnClickListenerC9585e());
        if (this.abc1000 < 0.778463098938376d) {
            this.abc1000 = 0.7110629552202642d;
        }
        this.abc1004 += 0.47195077f;
        this.abc1000 -= 0.8613831920698807d;
        ArrayList<Integer> arrayList = this.abc3;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc3.remove(0);
            float f2 = ((double) this.abc1005) > 0.08863336d ? 0.22343373f : 0.17476499f;
            this.abc1005 = f2;
            if (f2 > 0.389907d) {
                this.abc1005 = 0.77748793f;
            }
            this.abc1004 -= 0.0737766f;
        }
        this.abc1002 = "l you";
        this.abc1003 = ((double) this.abc1003) > 0.2401948d ? 0.9196455f : 0.17465681f;
        this.abc1005 = ((double) this.abc1005) > 0.77420264d ? 8.8220835E-4f : 0.7960084f;
        SharedPreferences sharedPreferences = getSharedPreferences("logo_master", 0);
        if (this.abc1001.size() > 8) {
            this.abc1001.add("t");
        }
        this.abc1007 = this.abc1007 < 7 ? 4 : 6;
        if (this.abc1005 < 0.8119533d) {
            this.abc1005 = 0.45714605f;
        }
        if (this.abc0 != null) {
            int i7 = 0;
            while (true) {
                String[] strArr3 = this.abc0;
                if (i7 >= strArr3.length) {
                    break;
                }
                strArr3[i7] = "string" + i7;
                if (this.abc1001.size() < 7) {
                    this.abc1001.add("s");
                }
                this.abc1007 = 1;
                this.abc1007 = 6;
                i7++;
            }
            this.abc1005 = ((double) this.abc1005) < 0.025931299d ? 0.1141634f : 0.47513467f;
            this.abc1002 = "ou th";
            if (!TextUtils.isEmpty("ou th")) {
                this.abc1002 += this.abc1002.length();
            }
        }
        this.abc1003 = 0.062512636f;
        this.abc1007 -= 3;
        this.abc1000 = this.abc1000 < 0.46414764485861437d ? 0.9284149602605374d : 0.19011507223252377d;
        boolean z = sharedPreferences.getBoolean("first_save", true);
        this.abc1006 = !this.abc1006;
        this.abc1007 = 0;
        this.abc1007 = 6;
        ArrayList<Integer> arrayList2 = this.abc3;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc3.remove(0);
            this.abc1006 = true;
            if (this.abc1004 < 0.9448245d) {
                this.abc1004 = 0.19056195f;
            }
            this.abc1007 = Math.abs(this.abc1007);
        }
        this.abc1004 = ((double) this.abc1004) > 0.90631056d ? 0.672634f : 0.48439455f;
        this.abc1002 = "defined wh";
        this.abc1006 = false;
        if (z) {
            if (this.logoRateUsDialog == null) {
                this.logoRateUsDialog = new LogoRateUsDialog(this);
                this.abc1000 = Math.abs(this.abc1000);
                this.abc1006 = true;
                this.abc1005 = ((double) this.abc1005) > 0.7038522d ? 0.5834467f : 0.8247696f;
                ArrayList<Integer> arrayList3 = this.abc3;
                if (arrayList3 == null && arrayList3.size() > 0) {
                    this.abc3.remove(0);
                    if (!TextUtils.isEmpty(this.abc1002)) {
                        this.abc1002 += this.abc1002.length();
                    }
                    this.abc1004 = 0.79588944f;
                    this.abc1004 = ((double) 0.79588944f) > 0.6032216d ? 0.9784957f : 0.84218544f;
                }
                this.abc1006 = true;
                this.abc1005 = 0.24228233f;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            this.abc1004 = Math.abs(this.abc1004);
            this.abc1000 = 0.6462809460064008d;
            String[] strArr4 = this.abc0;
            if (strArr4 != null) {
                strArr4[6] = "上，当然width";
                double d = -0.429055310823657d;
                this.abc1000 = d;
                this.abc1000 = d > 0.08780967465797895d ? 0.6135526315074521d : 0.30221717369448187d;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            this.abc1007 *= 2;
            this.abc1002 = " only un";
            this.logoRateUsDialog.show();
            boolean z2 = !this.abc1006;
            this.abc1006 = z2;
            this.abc1007 = 6;
            float f3 = this.abc1005 * 0.52459186f;
            this.abc1005 = f3;
            if (this.abc1 < 0.5938825976137844d) {
                this.abc1 = 0.6026181596331387d;
                if (this.abc1003 < 0.26708472d) {
                    this.abc1003 = 0.61325645f;
                }
                this.abc1002 = "l on p";
                this.abc1004 += 0.3675478f;
            }
            this.abc1003 += 0.0966444f;
            this.abc1006 = !z2;
            this.abc1005 = Math.abs(f3);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.abc1004 = ((double) this.abc1004) < 0.23007554d ? 0.63347155f : 0.38907492f;
            this.abc1006 = !this.abc1006;
            this.abc1005 = ((double) this.abc1005) < 0.3141942d ? 0.9363069f : 0.82573396f;
            if (this.abc2 == null) {
                this.abc2 = new ArrayList<>();
                this.abc1003 = Math.abs(this.abc1003);
                if (!TextUtils.isEmpty(this.abc1002)) {
                    this.abc1002 += this.abc1002.length();
                }
                if (this.abc1001.size() < 0) {
                    this.abc1001.add("oed every");
                }
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            this.abc1005 *= 0.54259175f;
            ArrayList<String> arrayList4 = this.abc1001;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1001.remove(0);
            }
            edit.putBoolean("first_save", false);
            this.abc1006 = false;
            if (this.abc1000 > 0.7514356659192286d) {
                this.abc1000 = 0.6639481568036448d;
            }
            if (this.abc1003 > 3.3676624E-5d) {
                this.abc1003 = 0.97461784f;
            }
            this.abc1 = Math.abs(this.abc1);
            int i8 = 0;
            while (true) {
                int i9 = this.abc1007;
                if (i9 > 3) {
                    i9 = 3;
                }
                if (i8 >= i9) {
                    break;
                }
                if (this.abc1001 == null) {
                    this.abc1001 = new ArrayList<>();
                }
                i8++;
            }
            this.abc1007 = 3;
            if (this.abc1001.size() < 4) {
                this.abc1001.add("ecad");
            }
            edit.commit();
            this.abc1000 = this.abc1000 < 0.5824773505848183d ? 0.8631045585593285d : 0.8951433122782354d;
            ArrayList<String> arrayList5 = this.abc1001;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc1001.remove(0);
            }
            this.abc1002 = "ed wel";
            this.abc1 = Math.abs(this.abc1);
            this.abc1002 = "o";
            this.abc1006 = !this.abc1006;
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
        }
        this.abc1007 = 3;
        this.abc1000 = Math.abs(this.abc1000);
        this.abc1007 = -this.abc1007;
        if (this.abc3 == null) {
            this.abc3 = new ArrayList<>();
            if (this.abc1005 > 0.4968421d) {
                this.abc1005 = 0.9398974f;
            }
            this.abc1002 = "ny ways ";
            ArrayList<String> arrayList6 = this.abc1001;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1001.remove(0);
            }
        }
        this.abc1005 = 0.7529073f;
        int i10 = this.abc1007 >= 3 ? 2 : 6;
        this.abc1007 = i10;
        if (i10 < 0) {
            this.abc1007 = 4;
        }
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.abc1006 = !this.abc1006;
        if (this.abc1005 < 0.6917668d) {
            this.abc1005 = 0.22882229f;
        }
        this.abc1003 = Math.abs(this.abc1003);
        if (this.abc0 == null) {
            this.abc0 = new String[10];
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
            this.abc1004 += 0.2121129f;
            this.abc1000 = this.abc1000 > 0.3192467469385498d ? 0.8824453164612077d : 0.11694932290540272d;
        }
        int i = 0;
        while (true) {
            int i2 = this.abc1007;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            this.abc1000 = this.abc1000 < 0.25822571020367935d ? 0.598612395280948d : 0.6295403585073757d;
            i++;
        }
        this.abc1002 = "eople real";
        this.abc1006 = true;
        this.binding = (ActivityLogoSaveSuccessBinding) DataBindingUtil.setContentView(this, R.layout.activity_logo_save_success);
        this.abc1006 = true;
        if (this.abc1004 < 0.13322037d) {
            this.abc1004 = 0.79488176f;
        }
        if (this.abc3.size() > 7) {
            this.abc3.add(4);
            this.abc1007 = -this.abc1007;
            if (this.abc1000 < 0.3638004989633672d) {
                this.abc1000 = 0.037580140180769495d;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
        }
        ArrayList<String> arrayList = this.abc1001;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc1005 *= 0.5364572f;
        if (this.abc1004 < 0.31407338d) {
            this.abc1004 = 0.7469768f;
        }
        this.binding.setLifecycleOwner(this);
        this.abc1003 = ((double) this.abc1003) < 0.95527613d ? 0.075086474f : 0.44769764f;
        this.abc1000 += 0.6305100597972002d;
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        if (this.abc3.size() > 7) {
            this.abc3.add(4);
            this.abc1005 = Math.abs(this.abc1005);
            this.abc1006 = !this.abc1006;
            if (this.abc1004 > 0.7500571d) {
                this.abc1004 = 0.92847604f;
            }
        }
        this.abc1005 = Math.abs(this.abc1005);
        int abs = Math.abs(this.abc1007);
        this.abc1007 = abs;
        this.abc1007 = abs < 4 ? 7 : 2;
        setSupportActionBar(this.binding.toolbar);
        this.abc1007++;
        this.abc1005 = -this.abc1005;
        this.abc1006 = false;
        if (this.abc3.size() > 5) {
            this.abc3.add(5);
            this.abc1000 = -this.abc1000;
            Math.abs(this.abc1004);
            this.abc1004 = 0.8419279f;
        }
        this.abc1003 = 0.014585316f;
        this.abc1005 = -this.abc1005;
        this.abc1000 = this.abc1000 > 0.6094959757279583d ? 0.1075315077970781d : 0.1291373096982219d;
        init();
        this.abc1006 = !this.abc1006;
        this.abc1000 = Math.abs(this.abc1000);
        this.abc1006 = true;
        if (this.abc2 == null) {
            this.abc2 = new ArrayList<>();
            int i3 = 0;
            while (true) {
                int i4 = this.abc1007;
                if (i3 >= (i4 > 3 ? 3 : i4)) {
                    break;
                }
                this.abc1007 = i4 > 8 ? 7 : 1;
                i3++;
            }
            this.abc1006 = true;
            int i5 = 0;
            while (true) {
                int i6 = this.abc1007;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                this.abc1005 = 0.41770923f;
                i5++;
            }
        }
        if (this.abc1000 > 0.012767274503852843d) {
            this.abc1000 = 0.6301390169782385d;
        }
        this.abc1006 = false;
        this.abc1005 = 0.46438468f;
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.abc1000 = 0.36369991088858933d;
        this.abc1003 = 0.7585963f;
        this.abc1005 = ((double) this.abc1005) > 0.9530445d ? 0.2889642f : 0.86992455f;
        Glide.m18522c(this).m18523b();
        if (this.abc1003 < 0.9297392d) {
            this.abc1003 = 0.13086164f;
        }
        this.abc1003 = Math.abs(this.abc1003);
        if (TextUtils.isEmpty(this.abc1002)) {
            return;
        }
        this.abc1002 += this.abc1002.length();
    }
}
