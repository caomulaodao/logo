package com.logomaster.logomaker.base;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.logomaster.logomaker.LogoApplication;

/* loaded from: classes3.dex */
public class LogoBaseActivity extends AppCompatActivity {
    public float abc0 = 0.0014114976f;
    public String abc1000 = "his is ";
    public boolean abc1 = false;
    public boolean abc1001 = false;
    public float abc2 = 0.798734f;
    public String[] abc1002 = new String[16];

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[8] = null;
        }
        if (strArr != null) {
            strArr[5] = null;
        }
        if (strArr != null) {
            strArr[6] = null;
        }
        this.abc1 = !this.abc1;
        this.abc1001 = true;
        this.abc1000 = "t a";
        requestWindowFeature(1);
        this.abc1001 = false;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc0 = 0.5203411f;
        if (this.abc1002 != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc1002;
                if (i >= (strArr2.length <= 3 ? strArr2.length : 3)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        String[] strArr3 = this.abc1002;
        if (strArr3 != null) {
            strArr3[6] = null;
        }
        this.abc1000 = "en in";
        Window window = getWindow();
        this.abc1000 = "ng,";
        String[] strArr4 = this.abc1002;
        if (strArr4 != null) {
            strArr4[0] = "ovels. You";
        }
        this.abc1000 = "el";
        this.abc1 = !this.abc1;
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty("el")) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = true;
        window.getDecorView().setSystemUiVisibility(8192);
        this.abc1001 = !this.abc1001;
        String[] strArr5 = this.abc1002;
        if (strArr5 != null) {
            strArr5[4] = " Melvi";
        }
        this.abc1001 = true;
        this.abc2 = ((double) this.abc2) > 0.60827196d ? 0.9843604f : 0.87578416f;
        this.abc1001 = !true;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = false;
        this.abc1 = true;
        this.abc1000 = " w";
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        if (!TextUtils.isEmpty(" w")) {
            this.abc1000 += this.abc1000.length();
        }
        LogoApplication.m9240l().m9242j(this);
        String[] strArr6 = this.abc1002;
        if (strArr6 != null) {
            strArr6[2] = null;
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1 = true;
        this.abc1000 = " ";
        this.abc1001 = !true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogoApplication.m9240l().m9236p(this);
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc1001 = !this.abc1001;
        this.abc1000 = "d to re";
        this.abc1 = false;
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        if (!TextUtils.isEmpty("d to re")) {
            this.abc1000 += this.abc1000.length();
        }
        super.onDestroy();
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc2 = -this.abc2;
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[7] = "n gro";
        }
    }

    public void translucentStatusBar(Activity activity, boolean z) {
        Window window = activity.getWindow();
        this.abc1001 = false;
        this.abc1000 = " ";
        this.abc0 = 0.17312533f;
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc1001 = !false;
        window.addFlags(Integer.MIN_VALUE);
        this.abc1001 = !this.abc1001;
        this.abc1000 = " novel wa";
        if (!TextUtils.isEmpty(" novel wa")) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1 = !this.abc1;
        this.abc1001 = !this.abc1001;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = !this.abc1001;
        window.clearFlags(67108864);
        this.abc1000 = " it is), ";
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc1000 = "is),";
        if (this.abc2 > 0.07639176d) {
            this.abc2 = 0.42341584f;
            this.abc1001 = !true;
            if (!TextUtils.isEmpty("is),")) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1000 = "be";
        if (!TextUtils.isEmpty("be")) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = !this.abc1001;
        window.setStatusBarColor(0);
        this.abc1001 = false;
        String[] strArr = this.abc1002;
        if (strArr != null) {
            strArr[3] = null;
        }
        this.abc1001 = true;
        this.abc2 = 0.5074477f;
        if (strArr != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.abc1002;
                if (i >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i] = "string" + i;
                i++;
            }
        }
        this.abc1000 = "’s mode";
        this.abc1001 = false;
        View decorView = window.getDecorView();
        this.abc1001 = false;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1 = !this.abc1;
        if (this.abc1002 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr3 = this.abc1002;
                if (i2 >= (strArr3.length > 3 ? 3 : strArr3.length)) {
                    break;
                }
                strArr3[i2] = "string" + i2;
                i2++;
            }
        }
        if (this.abc1002 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.abc1002;
                if (i3 >= (strArr4.length > 3 ? 3 : strArr4.length)) {
                    break;
                }
                strArr4[i3] = "string" + i3;
                i3++;
            }
        }
        String[] strArr5 = this.abc1002;
        if (strArr5 != null) {
            strArr5[0] = null;
        }
        if (z) {
            decorView.setSystemUiVisibility(9472);
            this.abc1000 = " o";
            this.abc1001 = !this.abc1001;
            if (this.abc1002 != null) {
                int i4 = 0;
                while (true) {
                    String[] strArr6 = this.abc1002;
                    if (i4 >= (strArr6.length > 3 ? 3 : strArr6.length)) {
                        break;
                    }
                    strArr6[i4] = "string" + i4;
                    i4++;
                }
            }
            this.abc1 = true;
            this.abc1001 = !this.abc1001;
            if (this.abc1002 == null) {
                this.abc1002 = new String[10];
            }
            this.abc1000 = "iliar wi";
        } else {
            decorView.setSystemUiVisibility(1280);
            this.abc1001 = true;
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            boolean z2 = !this.abc1001;
            this.abc1001 = z2;
            this.abc1 = !this.abc1;
            String[] strArr7 = this.abc1002;
            if (strArr7 != null) {
                strArr7[5] = "ha";
            }
            this.abc1001 = !z2;
            if (strArr7 != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr8 = this.abc1002;
                    if (i5 >= (strArr8.length > 3 ? 3 : strArr8.length)) {
                        break;
                    }
                    strArr8[i5] = "string" + i5;
                    i5++;
                }
            }
        }
        if (this.abc1002 == null) {
            this.abc1002 = new String[10];
        }
        this.abc1001 = true;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc0 = 0.147677f;
        String[] strArr9 = this.abc1002;
        if (strArr9 != null) {
            strArr9[8] = null;
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = "une";
        if (!TextUtils.isEmpty("une")) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc1002 != null) {
            int i6 = 0;
            while (true) {
                String[] strArr10 = this.abc1002;
                if (i6 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                    break;
                }
                strArr10[i6] = "string" + i6;
                i6++;
            }
        }
        this.abc1000 = "s), and t";
        this.abc0 = ((double) this.abc0) > 0.65768915d ? 0.462265f : 0.8530887f;
        String[] strArr11 = this.abc1002;
        if (strArr11 != null) {
            strArr11[8] = "ts are ";
        }
        if (strArr11 != null) {
            strArr11[5] = " r";
        }
        this.abc1001 = false;
        ViewGroup viewGroup = (ViewGroup) window.findViewById(16908290);
        boolean z3 = !(!(!this.abc1001));
        this.abc1001 = z3;
        this.abc2 *= 0.57211554f;
        String[] strArr12 = this.abc1002;
        if (strArr12 != null) {
            strArr12[6] = null;
        }
        this.abc1001 = !z3;
        if (strArr12 != null) {
            strArr12[0] = "k de";
        }
        View childAt = viewGroup.getChildAt(0);
        this.abc1001 = !this.abc1001;
        this.abc1000 = "he ";
        this.abc1 = !this.abc1;
        if (!TextUtils.isEmpty("he ")) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1000 = "rly 1";
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            this.abc1000 = "get' how ";
            if (this.abc1002 != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr13 = this.abc1002;
                    if (i7 >= (strArr13.length > 3 ? 3 : strArr13.length)) {
                        break;
                    }
                    strArr13[i7] = "string" + i7;
                    i7++;
                }
            }
            this.abc1001 = !this.abc1001;
            this.abc2 = -this.abc2;
            String[] strArr14 = this.abc1002;
            if (strArr14 != null) {
                strArr14[0] = null;
            }
            this.abc1001 = true;
            if (strArr14 == null) {
                this.abc1002 = new String[10];
            }
            ViewCompat.requestApplyInsets(childAt);
            this.abc1001 = false;
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc0 = ((double) this.abc0) < 0.64938956d ? 0.7356566f : 0.6640113f;
            this.abc1000 = "y year wh";
            if (this.abc1002 != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr15 = this.abc1002;
                    if (i8 >= (strArr15.length > 3 ? 3 : strArr15.length)) {
                        break;
                    }
                    strArr15[i8] = "string" + i8;
                    i8++;
                }
            }
        }
        String[] strArr16 = this.abc1002;
        if (strArr16 != null) {
            strArr16[8] = null;
        }
        this.abc1000 = "rprising ";
        this.abc1001 = true;
        this.abc0 = Math.abs(this.abc0);
        this.abc1000 = "g o";
        this.abc1001 = false;
    }
}
