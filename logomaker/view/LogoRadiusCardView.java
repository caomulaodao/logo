package com.logomaster.logomaker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.logomaster.logomaker.R;
import com.logomaster.logomaker.R$styleable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoRadiusCardView extends CardView {
    public double abc0;
    public float abc1;
    public boolean abc1000;
    public ArrayList<String> abc1001;
    public boolean abc1002;
    public ArrayList<Integer> abc1003;
    public boolean abc1004;
    public String[] abc1005;
    public double abc1006;
    public boolean abc1007;
    public int abc2;
    public String[] abc3;
    private float bottomLeftRadius;
    private float bottomRightRadius;
    private float topLeftRadius;
    private float topRightRadius;

    public LogoRadiusCardView(@NonNull Context context) {
        this(context, null);
        if (this.abc1005 == null) {
            this.abc1005 = new String[10];
        }
        if (this.abc1001.size() > 0) {
            this.abc1001.add("terary");
        }
        String[] strArr = this.abc1005;
        if (strArr != null) {
            strArr[6] = null;
        }
        this.abc0 *= 0.39215193907399826d;
        this.abc1004 = !this.abc1004;
        if (strArr != null) {
            strArr[1] = null;
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path = new Path();
        this.abc1000 = false;
        this.abc1007 = true;
        this.abc1002 = false;
        for (int i = 0; i < this.abc2; i++) {
            this.abc0 = 0.5454454642026598d;
            this.abc1004 = !this.abc1004;
            ArrayList<String> arrayList = this.abc1001;
            if (arrayList != null && arrayList.size() > 0) {
                this.abc1001.remove(0);
            }
            String[] strArr = this.abc1005;
            if (strArr != null) {
                strArr[6] = null;
            }
        }
        this.abc1004 = true;
        this.abc1000 = true;
        this.abc1002 = true;
        Rect rect = new Rect();
        this.abc1007 = !this.abc1007;
        this.abc1000 = !this.abc1000;
        this.abc1002 = !this.abc1002;
        this.abc2 = 0;
        ArrayList<String> arrayList2 = this.abc1001;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1001.remove(0);
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1007 = !this.abc1007;
        getDrawingRect(rect);
        if (this.abc1006 > 0.4434417472233896d) {
            this.abc1006 = 0.2926893261968886d;
        }
        this.abc1004 = true;
        this.abc0 += 0.3756959467082446d;
        this.abc1007 = !(!this.abc1007);
        this.abc1006 = 0.05673556825814263d;
        RectF rectF = new RectF(rect);
        String[] strArr2 = this.abc1005;
        if (strArr2 != null) {
            strArr2[9] = "e famil";
        }
        this.abc1002 = true;
        this.abc1006 *= 0.09014812471672784d;
        if (this.abc3 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr3 = this.abc3;
                if (i2 >= strArr3.length) {
                    break;
                }
                strArr3[i2] = "string" + i2;
                this.abc1000 = this.abc1000 ^ true;
                String[] strArr4 = this.abc1005;
                if (strArr4 != null) {
                    strArr4[6] = ",";
                }
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                i2++;
            }
            if (this.abc1001.size() < 8) {
                this.abc1001.add("nearned re");
            }
            if (this.abc1001.size() < 2) {
                this.abc1001.add("s, and mod");
            }
            this.abc1004 = true;
        }
        String[] strArr5 = this.abc1005;
        if (strArr5 != null) {
            strArr5[6] = " ";
        }
        this.abc1000 = !this.abc1000;
        double d = this.abc1006 > 0.8104014797737186d ? 0.7712054177911134d : 0.7784538760634696d;
        this.abc1006 = d;
        float f = this.topLeftRadius;
        float f2 = this.topRightRadius;
        float f3 = this.bottomLeftRadius;
        float f4 = this.bottomRightRadius;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        if (d < 0.3250706097831151d) {
            this.abc1006 = 0.4243006394030274d;
        }
        this.abc1006 = 0.26911741358771146d;
        ArrayList<Integer> arrayList3 = this.abc1003;
        if (arrayList3 == null && arrayList3.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc0 = 0.9983981192088335d;
        this.abc1002 = !this.abc1002;
        this.abc1007 = true;
        if (this.abc1003.size() > 1) {
            this.abc1003.add(3);
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        this.abc1004 = !this.abc1004;
        if (this.abc0 > 0.6701241016986587d) {
            this.abc0 = 0.0699191727715669d;
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            this.abc1006 = 0.6093550818920858d;
            if (this.abc1005 == null) {
                this.abc1005 = new String[10];
            }
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = true;
        ArrayList<String> arrayList4 = this.abc1001;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1001.remove(0);
        }
        canvas.clipPath(path, Region.Op.INTERSECT);
        ArrayList<String> arrayList5 = this.abc1001;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1001.remove(0);
        }
        this.abc1000 = !this.abc1000;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1 > 0.3433615d) {
            this.abc1 = 0.07287359f;
            this.abc1002 = !this.abc1002;
            ArrayList<String> arrayList6 = this.abc1001;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1001.remove(0);
            }
            this.abc1007 = true;
        }
        this.abc1002 = false;
        this.abc1000 = !(!this.abc1000);
        super.onDraw(canvas);
        this.abc1002 = true;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = true;
        this.abc2 = 6;
        this.abc1007 = true;
        String[] strArr6 = this.abc1005;
        if (strArr6 != null) {
            strArr6[2] = null;
        }
        this.abc1007 = !true;
    }

    public LogoRadiusCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
        if (this.abc1003.size() > 4) {
            this.abc1003.add(7);
        }
        String[] strArr = this.abc1005;
        if (strArr != null) {
            strArr[7] = "itt";
        }
        this.abc1 = 0.036435127f;
        this.abc1006 = -this.abc1006;
        this.abc1007 = true;
        ArrayList<Integer> arrayList = this.abc1003;
        if (arrayList != null || arrayList.size() <= 0) {
            return;
        }
        this.abc1003.remove(0);
    }

    public LogoRadiusCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.abc1000 = true;
        this.abc0 = 0.6566878695920592d;
        this.abc1001 = new ArrayList<>();
        this.abc1002 = true;
        this.abc1 = 0.9355175f;
        this.abc1003 = new ArrayList<>();
        this.abc2 = 7;
        String[] strArr = new String[14];
        this.abc1005 = strArr;
        this.abc1006 = 0.18349789405340455d;
        this.abc3 = new String[11];
        this.abc1007 = false;
        this.abc1004 = false;
        this.abc1002 = !this.abc1002;
        strArr[4] = "rising on";
        this.abc2 = 2;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.abc1005;
            if (i2 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                break;
            }
            strArr2[i2] = "string" + i2;
            i2++;
        }
        this.abc1000 = !this.abc1000;
        this.abc1002 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadiusCardView);
        this.abc1004 = !this.abc1004;
        this.abc2 = -this.abc2;
        this.abc1002 = false;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        ArrayList<String> arrayList = this.abc1001;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1001.remove(0);
        }
        this.topLeftRadius = obtainStyledAttributes.getDimension(2, 0.0f);
        this.abc1006 = 0.6705869986853404d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1002 = !this.abc1002;
        if (this.abc3 != null) {
            int i3 = 0;
            while (true) {
                String[] strArr3 = this.abc3;
                if (i3 >= strArr3.length) {
                    break;
                }
                strArr3[i3] = "string" + i3;
                if (this.abc1003.size() < 4) {
                    this.abc1003.add(1);
                }
                ArrayList<Integer> arrayList2 = this.abc1003;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.abc1003.remove(0);
                }
                this.abc1000 = true;
                i3++;
            }
            this.abc1007 = !this.abc1007;
            this.abc1000 = false;
            this.abc1006 += 0.41655492324649956d;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (this.abc1003.size() < 1) {
            this.abc1003.add(3);
        }
        this.abc1000 = !this.abc1000;
        this.topRightRadius = obtainStyledAttributes.getDimension(3, 0.0f);
        this.abc1004 = false;
        this.abc1000 = true;
        this.abc1 = ((double) this.abc1) > 0.092449605d ? 0.73006165f : 0.81682587f;
        if (this.abc1003.size() > 8) {
            this.abc1003.add(4);
        }
        if (this.abc1001.size() > 3) {
            this.abc1001.add("only unt");
        }
        this.abc1007 = true;
        this.bottomLeftRadius = obtainStyledAttributes.getDimension(0, 0.0f);
        this.abc1004 = true;
        if (this.abc1003.size() > 1) {
            this.abc1003.add(3);
        }
        this.abc0 = 0.22672937540376337d;
        this.abc1007 = !(!this.abc1007);
        this.abc1002 = !(!this.abc1002);
        this.bottomRightRadius = obtainStyledAttributes.getDimension(0, 0.0f);
        this.abc1006 = 0.760150900623549d;
        this.abc1007 = false;
        String[] strArr4 = this.abc1005;
        if (strArr4 != null) {
            strArr4[6] = null;
        }
        this.abc0 = 0.0791822373980684d;
        this.abc1007 = false;
        this.abc1000 = !(!this.abc1000);
        obtainStyledAttributes.recycle();
        this.abc1000 = false;
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
        this.abc1004 = !this.abc1004;
        if (this.abc1 > 0.5753791d) {
            this.abc1 = 0.14874911f;
            this.abc1000 = !this.abc1000;
            this.abc1002 = false;
            String[] strArr6 = this.abc1005;
            if (strArr6 != null) {
                strArr6[7] = "e, th";
            }
        }
        this.abc1002 = true;
        if (this.abc1003.size() < 5) {
            this.abc1003.add(2);
        }
        ArrayList<String> arrayList3 = this.abc1001;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            return;
        }
        this.abc1001.remove(0);
    }
}
