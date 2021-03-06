/**
 * Tencent is pleased to support the open source community by making Tars available.
 *
 * Copyright (C) 2016THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.jceplugin.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.tencent.jceplugin.util.Utils;
import icons.JceIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class JceColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Constant", JceSyntaxHighlighter.CONSTANT),
            new AttributesDescriptor("Struct, Enum, Interface Name", JceSyntaxHighlighter.CLASS_NAME),
            new AttributesDescriptor("Function Name", JceSyntaxHighlighter.FUNCTION_DECLARATION),
            new AttributesDescriptor("Function Parameter", JceSyntaxHighlighter.PARAMETER),
            new AttributesDescriptor("Keyword", JceSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Identifier", JceSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Number", JceSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", JceSyntaxHighlighter.STRING),
            new AttributesDescriptor("Operator ::", JceSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Line Comment", JceSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Block Comment", JceSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Bad Character", JceSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Comma ,", JceSyntaxHighlighter.COMMA),
            new AttributesDescriptor("Semicolon ;", JceSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Parentheses ()", JceSyntaxHighlighter.PARENTHESES),
            new AttributesDescriptor("Brackets {}", JceSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("Braces [], <>", JceSyntaxHighlighter.BRACES),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return JceIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new JceSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return Utils.readFile(JceColorSettingsPage.class, "/sample.jce");
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Jce";
    }
}
