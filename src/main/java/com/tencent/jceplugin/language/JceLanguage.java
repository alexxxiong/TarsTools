package com.tencent.jceplugin.language;

import com.intellij.lang.Language;

public class JceLanguage extends Language {
    public static final Language INSTANCE = new JceLanguage();

    protected JceLanguage() {
        super("Jce");
    }
}