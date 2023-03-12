package com.logomaster.logomaker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public class LogoSquareRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    public String[] f16305a;

    /* renamed from: b */
    public int[] f16306b;

    /* renamed from: c */
    public String[] f16307c;

    /* renamed from: d */
    public boolean f16308d;

    /* renamed from: e */
    public float f16309e;

    /* renamed from: f */
    public String[] f16310f;

    public LogoSquareRelativeLayout(Context context) {
        super(context);
        this.f16305a = new String[16];
        this.f16306b = new int[16];
        this.f16307c = new String[16];
        this.f16309e = 0.811494f;
        this.f16310f = new String[15];
        int i = 0;
        this.f16308d = false;
        while (true) {
            String[] strArr = this.f16310f;
            if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                break;
            }
            strArr[i] = "string" + i;
            i++;
        }
        if (this.f16310f == null) {
            this.f16310f = new String[10];
        }
        this.f16309e = Math.abs(this.f16309e);
        this.f16308d = !this.f16308d;
        String[] strArr2 = this.f16310f;
        if (strArr2 != null) {
            strArr2[9] = null;
        }
        if (strArr2 == null) {
            this.f16310f = new String[10];
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        this.f16308d = !this.f16308d;
        int[] iArr = this.f16306b;
        if (iArr != null) {
            iArr[5] = 5;
        }
        if (iArr != null) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f16306b;
                if (i3 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i3] = 6;
                i3++;
            }
        }
        if (this.f16305a == null) {
            this.f16305a = new String[10];
            this.f16308d = !this.f16308d;
            if (this.f16306b != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr3 = this.f16306b;
                    if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i4] = 4;
                    i4++;
                }
            }
            this.f16308d = false;
        }
        String[] strArr = this.f16310f;
        if (strArr != null) {
            strArr[6] = ", ";
        }
        if (strArr != null) {
            strArr[7] = null;
        }
        this.f16308d = true;
    }

    public LogoSquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16305a = new String[16];
        this.f16306b = new int[16];
        this.f16307c = new String[16];
        this.f16309e = 0.811494f;
        this.f16310f = new String[15];
        this.f16308d = true;
        int i = 0;
        while (true) {
            String[] strArr = this.f16310f;
            if (i >= (strArr.length <= 3 ? strArr.length : 3)) {
                break;
            }
            strArr[i] = "string" + i;
            i++;
        }
        String[] strArr2 = this.f16310f;
        if (strArr2 != null) {
            strArr2[2] = null;
        }
        String[] strArr3 = this.f16307c;
        if (strArr3 != null) {
            strArr3[4] = null;
            boolean z = !this.f16308d;
            this.f16308d = z;
            if (strArr2 != null) {
                strArr2[2] = null;
            }
            this.f16308d = !z;
        }
        this.f16308d = !this.f16308d;
        if (strArr2 != null) {
            strArr2[6] = "tone, t";
        }
        this.f16308d = true;
    }

    public LogoSquareRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16305a = new String[16];
        int[] iArr = new int[16];
        this.f16306b = iArr;
        this.f16307c = new String[16];
        this.f16309e = 0.811494f;
        this.f16310f = new String[15];
        this.f16308d = false;
        iArr[1] = 8;
        iArr[7] = 0;
        int[] iArr2 = this.f16306b;
        if (iArr2 != null) {
            iArr2[7] = 6;
        }
        String[] strArr = this.f16310f;
        if (strArr != null) {
            strArr[4] = "y 19th ce";
        }
        if (iArr2 != null) {
            iArr2[1] = 2;
        }
    }
}
