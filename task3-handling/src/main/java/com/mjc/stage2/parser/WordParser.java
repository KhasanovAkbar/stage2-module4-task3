package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{

    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public WordParser() {
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        //
        if (string.matches(WORD_REGEX)){
            TextComponent wordComponent = new TextComponent(TextComponentType.WORD);
            for (char symbol :string.toCharArray())
                wordComponent.add(new SymbolLeaf(symbol));
            abstractTextComponent.add(wordComponent);
        }
        else if (nextParser != null)
            nextParser.parse(abstractTextComponent, string);
    }

}
