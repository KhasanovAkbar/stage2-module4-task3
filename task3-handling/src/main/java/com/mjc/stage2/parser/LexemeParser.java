package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser() {
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        //
        String[] lexemes = string.split(LEXEME_REGEX);
        for (String lexeme:lexemes){
            if (nextParser != null)
                nextParser.parse(abstractTextComponent, lexeme);
        }
    }
}
