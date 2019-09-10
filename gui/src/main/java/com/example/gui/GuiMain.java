package com.example.gui;

import com.example.core.AccountStore;
import com.example.core.CoreMain;

public class GuiMain {
    private static final boolean HAS_CORE;
    static {
        boolean hasCore;
        try {
            new CoreMain();
            hasCore = true;
        } catch (NoClassDefFoundError e) {
            hasCore = false;
        }
        System.out.println("hasCore: " + hasCore);
        HAS_CORE = hasCore;
    }

    private AccountStore accountStore = null;

    public void setAccountStore(AccountStore accountStore) {
        this.accountStore = accountStore;
    }

    public String tryGetAccountName() {
        if (HAS_CORE) {
            if (accountStore != null) {
                return accountStore.getAccount().name;
            }
        }
        return "";
    }
}
