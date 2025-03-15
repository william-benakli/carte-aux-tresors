import java.util.Map;

public class ParserFactory {

    private static final Map<Character, Parser> mapOfParseElement =  Map.of(
            '#', new CommentParser(),
            'C', new MapParser(),
            'T', new TreasureParser(),
            'M', new MountainParser()
    );

    public static Parser ParserFactory(String line){
        if(line == null || line.isEmpty()) throw new IllegalArgumentException("Ligne vide ou nulle");

        char firstChar = line.charAt(0);
        Parser parserSelected = mapOfParseElement.get(firstChar);
        if (parserSelected == null) throw new IllegalArgumentException("Ligne vide ou nulle");
        return parserSelected;
    }
}
