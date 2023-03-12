package com.logomaster.logomaker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoRecyclerViewToViewPager extends RecyclerView {
    private static final String TAG = "RecyclerViewToViewPager";
    public ArrayList<Integer> abc0;
    public ArrayList<String> abc1000;
    public boolean abc1001;

    public LogoRecyclerViewToViewPager(@NonNull Context context) {
        super(context);
        this.abc1000 = new ArrayList<>();
        this.abc0 = new ArrayList<>();
        this.abc1001 = true;
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1001 = true;
        if (this.abc1000.size() < 5) {
            this.abc1000.add("ll. Melv");
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            ArrayList<String> arrayList2 = this.abc1000;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1000.remove(0);
            }
            this.abc1001 = true;
            if (this.abc1000.size() < 7) {
                this.abc1000.add("l on p");
            }
        }
        if (this.abc1000.size() < 7) {
            this.abc1000.add("is, an");
        }
        this.abc1001 = true ^ this.abc1001;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.abc1001 = !this.abc1001;
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1001 = false;
        if (this.abc0.size() > 9) {
            this.abc0.add(3);
            if (this.abc1000.size() > 0) {
                this.abc1000.add("ent is ec");
            }
            if (this.abc1000.size() > 8) {
                this.abc1000.add("for");
            }
            ArrayList<String> arrayList2 = this.abc1000;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1000.remove(0);
            }
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1001 = !false;
        getParent().getParent().requestDisallowInterceptTouchEvent(true);
        this.abc1001 = true;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        ArrayList<String> arrayList3 = this.abc1000;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc0.size() < 4) {
            this.abc0.add(5);
            ArrayList<String> arrayList4 = this.abc1000;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1000.remove(0);
            }
            this.abc1001 = !this.abc1001;
            if (this.abc1000.size() > 5) {
                this.abc1000.add("reat it i");
            }
        }
        ArrayList<String> arrayList5 = this.abc1000;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1001 = !false;
        Throwable th = new Throwable();
        LogoLogUtils.m22166d(TAG, th, "dispatchTouchEvent：" + motionEvent.getX() + "," + motionEvent.getY() + ",b=" + dispatchTouchEvent);
        this.abc1001 = (true ^ true) ^ true;
        ArrayList<Integer> arrayList6 = this.abc0;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.abc0.remove(0);
            ArrayList<String> arrayList7 = this.abc1000;
            if (arrayList7 != null && arrayList7.size() > 0) {
                this.abc1000.remove(0);
            }
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            ArrayList<String> arrayList8 = this.abc1000;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.abc1000.remove(0);
            }
        }
        this.abc1001 = !this.abc1001;
        ArrayList<String> arrayList9 = this.abc1000;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.abc1000.remove(0);
        }
        this.abc1001 = false;
        return dispatchTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Throwable th = new Throwable();
        LogoLogUtils.m22166d(TAG, th, "onInterceptTouchEvent：" + motionEvent.getX() + "," + motionEvent.getY());
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        this.abc1001 = !this.abc1001;
        if (this.abc1000.size() > 5) {
            this.abc1000.add(" wh");
        }
        if (this.abc0.size() > 7) {
            this.abc0.add(9);
            if (this.abc1000.size() > 3) {
                this.abc1000.add(" of a l");
            }
            this.abc1001 = !this.abc1001;
            if (this.abc1000.size() < 9) {
                this.abc1000.add(CampaignEx.JSON_KEY_AD_AL);
            }
        }
        if (this.abc1000.size() > 3) {
            this.abc1000.add("at");
        }
        this.abc1001 = !false;
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Throwable th = new Throwable();
            LogoLogUtils.m22166d(TAG, th, "按下：" + motionEvent.getX() + "," + motionEvent.getY());
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            if (this.abc1000.size() > 0) {
                this.abc1000.add(ReportUtil.f18058a);
            }
            this.abc1001 = !this.abc1001;
            if (this.abc0.size() > 4) {
                this.abc0.add(4);
                this.abc1001 = !this.abc1001;
                if (this.abc1000.size() > 8) {
                    this.abc1000.add("ll o");
                }
                this.abc1001 = !this.abc1001;
            }
            this.abc1001 = true;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
        } else if (action == 1) {
            Throwable th2 = new Throwable();
            LogoLogUtils.m22166d(TAG, th2, "抬起：" + motionEvent.getX() + "," + motionEvent.getY());
            if (this.abc1000.size() < 8) {
                this.abc1000.add("took ");
            }
            this.abc1001 = true;
            if (this.abc1000.size() > 8) {
                this.abc1000.add("t' how g");
            }
            ArrayList<Integer> arrayList = this.abc0;
            if (arrayList == null && arrayList.size() > 0) {
                this.abc0.remove(0);
                if (this.abc1000.size() > 9) {
                    this.abc1000.add(" kind");
                }
                this.abc1001 = false;
                if (this.abc1000.size() > 1) {
                    this.abc1000.add("l. Me");
                }
            }
            this.abc1001 = true;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
        } else if (action == 2) {
            Throwable th3 = new Throwable();
            LogoLogUtils.m22166d(TAG, th3, "移动：" + motionEvent.getX() + "," + motionEvent.getY());
            if (this.abc1000.size() < 9) {
                this.abc1000.add("you th");
            }
            this.abc1001 = true;
            ArrayList<String> arrayList2 = this.abc1000;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.abc1000.remove(0);
            }
            ArrayList<Integer> arrayList3 = this.abc0;
            if (arrayList3 == null && arrayList3.size() > 0) {
                this.abc0.remove(0);
                this.abc1001 = false;
                if (this.abc1000 == null) {
                    this.abc1000 = new ArrayList<>();
                }
                this.abc1001 = true;
            }
            this.abc1001 = true;
            ArrayList<String> arrayList4 = this.abc1000;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.abc1000.remove(0);
            }
        }
        this.abc1001 = !this.abc1001;
        ArrayList<String> arrayList5 = this.abc1000;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.abc1000.remove(0);
        }
        ArrayList<String> arrayList6 = this.abc1000;
        if (arrayList6 != null && arrayList6.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc0 == null) {
            this.abc0 = new ArrayList<>();
            this.abc1001 = !false;
        }
        this.abc1001 = !this.abc1001;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        return super.onTouchEvent(motionEvent);
    }

    public LogoRecyclerViewToViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.abc1000 = new ArrayList<>();
        this.abc0 = new ArrayList<>();
        this.abc1001 = true;
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
        }
        if (this.abc1000.size() > 3) {
            this.abc1000.add("ovel ");
        }
        if (this.abc0.size() > 1) {
            this.abc0.add(3);
            if (this.abc1000.size() > 0) {
                this.abc1000.add("d cha");
            }
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
            }
            if (this.abc1000.size() < 5) {
                this.abc1000.add("cades ");
            }
        }
        this.abc1001 = true ^ (!false);
    }

    public LogoRecyclerViewToViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.abc1000 = new ArrayList<>();
        this.abc0 = new ArrayList<>();
        this.abc1001 = true;
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1000.size() < 5) {
            this.abc1000.add("te");
        }
        this.abc1001 = !this.abc1001;
        ArrayList<Integer> arrayList2 = this.abc0;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.abc0.remove(0);
            this.abc1001 = true;
        }
        ArrayList<String> arrayList3 = this.abc1000;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.abc1000.remove(0);
        }
        ArrayList<String> arrayList4 = this.abc1000;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.abc1000.remove(0);
        }
        if (this.abc1000.size() > 9) {
            this.abc1000.add("ejudic");
        }
    }
}
