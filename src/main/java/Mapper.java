import com.mcserby.training.refactoring.InternationalValues;
import com.mcserby.training.refactoring.Locale;
import com.mcserby.training.refactoring.Translation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    private static List<Translation> mapNames(List<InternationalValues> values) {
        String name = values.stream().map(iv -> iv.getName("uk")).distinct().collect(Collectors.joining(" "));
        Translation psfUk = new Translation(Collections.singletonList(name), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getName("nl")).distinct().collect(Collectors.joining(" "));
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getName("de")).distinct().collect(Collectors.joining(" "));
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getName("fr")).distinct().collect(Collectors.joining(" "));
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getName("es")).distinct().collect(Collectors.joining(" "));
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getName("it")).distinct().collect(Collectors.joining(" "));
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getName("at")).distinct().collect(Collectors.joining(" "));
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getName("chFr")).distinct().collect(Collectors.joining(" "));
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getName("chDe")).distinct().collect(Collectors.joining(" "));
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getName("chIt")).distinct().collect(Collectors.joining(" "));
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getName("beFr")).distinct().collect(Collectors.joining(" "));
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getName("luDe")).distinct().collect(Collectors.joining(" "));
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getName("caEs")).distinct().collect(Collectors.joining(" "));
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getName("luFr")).distinct().collect(Collectors.joining(" "));
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }

    private static List<Translation> mapDescriptions(List<InternationalValues> values) {
        String description = values.stream().map(iv -> iv.getDescription("uk")).findFirst().orElse("");
        Translation psfUk = new Translation(Collections.singletonList(description), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getDescription("nl").substring(0, Math.min(iv.getDescription("nl").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getDescription("de").substring(0, Math.min(iv.getDescription("de").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getDescription("fr").substring(0, Math.min(iv.getDescription("fr").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getDescription("es").substring(0, Math.min(iv.getDescription("es").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getDescription("it").substring(0, Math.min(iv.getDescription("it").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getDescription("at").substring(0, Math.min(iv.getDescription("at").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getDescription("chFr").substring(0, Math.min(iv.getDescription("chFr").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getDescription("chDe").substring(0, Math.min(iv.getDescription("chDe").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getDescription("chIt").substring(0, Math.min(iv.getDescription("chIt").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getDescription("beFr").substring(0, Math.min(iv.getDescription("beFr").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getDescription("luDe").substring(0, Math.min(iv.getDescription("luDe").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getDescription("caEs").substring(0, Math.min(iv.getDescription("caEs").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getDescription("luFr").substring(0, Math.min(iv.getDescription("luFr").length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }
}
