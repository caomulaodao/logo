package com.logomaster.logomaker.utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoLayerRvItemTouchHelper extends ItemTouchHelper {
    public int abc0;
    public float abc1;
    public int abc1000;
    public ArrayList<String> abc1001;
    public float abc1002;
    public ArrayList<Integer> abc2;

    public LogoLayerRvItemTouchHelper(@NonNull ItemTouchHelper.Callback callback) {
        super(callback);
        this.abc0 = 8;
        this.abc1000 = 3;
        this.abc1 = 0.14748544f;
        this.abc1001 = new ArrayList<>();
        this.abc2 = new ArrayList<>();
        this.abc1002 = 0.4933173f;
        this.abc1002 = ((double) 0.4933173f) < 0.7049353d ? 0.81315595f : 0.41787976f;
        if (this.abc1000 > 0) {
            this.abc1000 = 6;
        }
        if (this.abc1001.size() < 2) {
            this.abc1001.add(" took dec");
        }
        ArrayList<Integer> arrayList = this.abc2;
        if (arrayList == null && arrayList.size() > 0) {
            this.abc2.remove(0);
            if (this.abc1000 < 0) {
                this.abc1000 = 9;
            }
            this.abc1002 -= 0.710844f;
            if (this.abc1001 == null) {
                this.abc1001 = new ArrayList<>();
            }
        }
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
        this.abc1002 = 0.22199357f;
        if (this.abc1001 == null) {
            this.abc1001 = new ArrayList<>();
        }
    }
}
