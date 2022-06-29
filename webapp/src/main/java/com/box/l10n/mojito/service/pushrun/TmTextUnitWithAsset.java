package com.box.l10n.mojito.service.pushrun;

import com.box.l10n.mojito.entity.Asset;
import com.box.l10n.mojito.entity.TMTextUnit;

/**
 * @author garion
 */
public class TmTextUnitWithAsset {
    TMTextUnit tmTextUnit;
    Asset asset;

    public TmTextUnitWithAsset(TMTextUnit tmTextUnit, Asset asset) {
        this.tmTextUnit = tmTextUnit;
        this.asset = asset;
    }

    public TMTextUnit getTmTextUnit() {
        return tmTextUnit;
    }

    public void setTmTextUnit(TMTextUnit tmTextUnit) {
        this.tmTextUnit = tmTextUnit;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
}
